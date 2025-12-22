package com.jayjd.boxtop.cards.tvdesktop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class WaveformView extends View {

    private static final int DEFAULT_LINES = 2;
    private static final int MAX_POINTS = 60;

    // 顶部留白比例（0.9 = 永远留 10%）
    private static final float HEADROOM = 0.9f;

    // max 值衰减速度（越接近 1 越慢）
    private static final float MAX_DECAY = 0.98f;

    private float[][] values;      // [line][points]
    private float[] maxValues;     // 每条线的动态 max
    private Paint[] linePaints;
    private Paint gridPaint;

    private int lineCount;

    public WaveformView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(DEFAULT_LINES);
    }

    /** 初始化多少条线 */
    public void init(int lines) {
        this.lineCount = lines;

        values = new float[lines][MAX_POINTS];
        maxValues = new float[lines];
        linePaints = new Paint[lines];

        for (int i = 0; i < lines; i++) {
            maxValues[i] = 1f;

            Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(dp(2));
            p.setColor(getDefaultColor(i));
            linePaints[i] = p;
        }

        gridPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        gridPaint.setColor(0x22FFFFFF);
        gridPaint.setStrokeWidth(1);
    }

    /** 设置某条线颜色 */
    public void setLineColor(int index, int color) {
        if (index < 0 || index >= lineCount) return;
        linePaints[index].setColor(color);
    }

    /** 推入数据（原始值，不要求 0~1） */
    public void pushValue(int lineIndex, float value) {
        if (lineIndex < 0 || lineIndex >= lineCount) return;

        float[] line = values[lineIndex];

        // 更新动态 max（慢慢下降）
        maxValues[lineIndex] = Math.max(
                value,
                maxValues[lineIndex] * MAX_DECAY
        );

        // 左移数据
        System.arraycopy(line, 1, line, 0, line.length - 1);

        // TV 级平滑
        float last = line[line.length - 2];
        line[line.length - 1] = last * 0.7f + value * 0.3f;

        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int w = getWidth();
        int h = getHeight();

        drawGrid(canvas, w, h);
        drawAllWaves(canvas, w, h);
    }

    /** 参考线 */
    private void drawGrid(Canvas canvas, int w, int h) {
        canvas.drawLine(0, h / 2f, w, h / 2f, gridPaint);
        canvas.drawLine(0, h / 4f, w, h / 4f, gridPaint);
        canvas.drawLine(0, h * 3 / 4f, w, h * 3 / 4f, gridPaint);
    }

    /** 绘制所有波形 */
    private void drawAllWaves(Canvas canvas, int w, int h) {
        float stepX = (float) w / (MAX_POINTS - 1);

        for (int l = 0; l < lineCount; l++) {
            Path path = new Path();
            float[] line = values[l];

            float max = Math.max(maxValues[l], 0.001f);

            for (int i = 0; i < MAX_POINTS; i++) {
                float x = i * stepX;

                float normalized = line[i] / max;
                if (normalized > 1f) normalized = 1f;

                float y = h - (normalized * h * HEADROOM);

                if (i == 0) {
                    path.moveTo(x, y);
                } else {
                    path.lineTo(x, y);
                }
            }
            canvas.drawPath(path, linePaints[l]);
        }
    }

    /** 默认颜色 */
    private int getDefaultColor(int index) {
        return switch (index) {
            case 0 -> 0xFF4CAF50; // CPU
            case 1 -> 0xFF03A9F4; // RAM
            case 2 -> 0xFFFFC107; // FPS
            default -> Color.WHITE;
        };
    }

    private float dp(float v) {
        return v * getResources().getDisplayMetrics().density;
    }
}
