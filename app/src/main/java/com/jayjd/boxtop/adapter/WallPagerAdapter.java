package com.jayjd.boxtop.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter4.BaseQuickAdapter;
import com.chad.library.adapter4.viewholder.QuickViewHolder;
import com.jayjd.boxtop.R;
import com.jayjd.boxtop.entity.WallPagerEntity;

public class WallPagerAdapter extends BaseQuickAdapter<WallPagerEntity.DataBean.ListBean, QuickViewHolder> {
    private Context context;
    @NonNull
    @Override
    protected QuickViewHolder onCreateViewHolder(@NonNull Context context, @NonNull ViewGroup viewGroup, int i) {
        this.context = context;
        return new QuickViewHolder(R.layout.activity_wall_pager_item, viewGroup);
    }

    @Override
    protected void onBindViewHolder(@NonNull QuickViewHolder quickViewHolder, int i, @Nullable WallPagerEntity.DataBean.ListBean listBean) {
        ImageView imageView = quickViewHolder.getView(R.id.iv_wall_pager);
        if (listBean != null) {
            Glide.with(context)
                    .load(listBean.getImg())
                    .into(imageView);
        }
    }
}
