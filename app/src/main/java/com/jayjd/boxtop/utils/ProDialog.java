package com.jayjd.boxtop.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jayjd.boxtop.R;

import java.util.Objects;

public class ProDialog {

    public static void show(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.ProDialogTheme);
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_pro, null);
        builder.setView(view);

        AlertDialog dialog = builder.create();
        dialog.setCanceledOnTouchOutside(true);

        Button unlockBtn = view.findViewById(R.id.pro_btn_unlock);
        unlockBtn.setOnClickListener(v -> {
            dialog.dismiss();
            // TODO: 打开购买/解锁流程
            boolean b = PurchaseManager.getInstance().unlockWithCode(context, "123123123");
            if (b) {
                Toast.makeText(context, "解锁成功", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "解锁失败", Toast.LENGTH_SHORT).show();
            }
        });

        // TV 聚焦优化
        unlockBtn.requestFocus();

        dialog.show();
        // 设置宽高

        Objects.requireNonNull(dialog.getWindow()).setLayout(dpToPx(context, 400), dpToPx(context, 260));
    }

    // dp 转 px
    private static int dpToPx(Context context, int dp) {
        return (int) (dp * context.getResources().getDisplayMetrics().density);
    }
}
