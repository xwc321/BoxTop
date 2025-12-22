package com.jayjd.boxtop.cards;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.jayjd.boxtop.R;

import java.io.File;
import java.util.Locale;


public class CardStorage extends BaseCardFragment {

    private ProgressBar pbStorage;
    private TextView tvStoragePercent;
    private TextView tvStorageSize;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_card_storage, container, false);

        initView(view);
        return view;
    }

    private void initView(View view) {
        pbStorage = view.findViewById(R.id.pb_storage);
        tvStoragePercent = view.findViewById(R.id.tv_storage_percent);
        tvStorageSize = view.findViewById(R.id.tv_storage_size);
    }

    private void updateInternalStorage() {
        try {
            File dataDir = Environment.getDataDirectory();
            StatFs statFs = new StatFs(dataDir.getPath());

            long totalBytes = statFs.getTotalBytes();
            long availableBytes = statFs.getAvailableBytes();
            long usedBytes = totalBytes - availableBytes;

            int percent = (int) ((usedBytes * 100f) / totalBytes);

            // UI 更新
            pbStorage.setProgress(percent);
            tvStoragePercent.setText(percent + "%");
            tvStorageSize.setText(formatSize(usedBytes) + " / " + formatSize(totalBytes));

            // 根据使用率变色（可选）
            Drawable drawable = ContextCompat.getDrawable(requireContext(), getProgressDrawable(percent));
            pbStorage.setProgressDrawable(drawable);

            ObjectAnimator animator =
                    ObjectAnimator.ofInt(pbStorage, "progress", 0, percent);
            animator.setDuration(600);
            animator.start();
        } catch (Exception e) {
            Log.e("CardStorage", "updateInternalStorage error", e);
        }
    }

    private String formatSize(long bytes) {
        float gb = bytes / 1024f / 1024f / 1024f;
        return String.format(Locale.getDefault(), "%.1f GB", gb);
    }

    private int getProgressDrawable(int percent) {
        if (percent < 70) {
            return R.drawable.bg_storage_progress_ring;
        } else if (percent < 85) {
            return R.drawable.bg_storage_progress_ring_orange;
        } else {
            return R.drawable.bg_storage_progress_ring_red;
        }
    }

    @Override
    protected void onFragmentVisible() {
        super.onFragmentVisible();
        Log.d("CardStorage", "onFragmentVisible() called");
        updateInternalStorage();
    }

    @Override
    protected void onFragmentInvisible() {
        super.onFragmentInvisible();
        Log.d("CardStorage", "onFragmentInvisible() called");
    }
}