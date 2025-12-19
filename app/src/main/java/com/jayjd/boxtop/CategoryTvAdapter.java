package com.jayjd.boxtop;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter4.BaseQuickAdapter;
import com.chad.library.adapter4.viewholder.QuickViewHolder;

public class CategoryTvAdapter extends BaseQuickAdapter<String, QuickViewHolder> {
    @NonNull
    @Override
    protected QuickViewHolder onCreateViewHolder(@NonNull Context context, @NonNull ViewGroup viewGroup, int i) {
        return new QuickViewHolder(R.layout.item_category, viewGroup);
    }

    @Override
    protected void onBindViewHolder(@NonNull QuickViewHolder quickViewHolder, int i, @Nullable String s) {
        quickViewHolder.setText(R.id.category_id, String.valueOf(i + 1));
        quickViewHolder.setText(R.id.category_name, s);
    }
}
