package com.jayjd.boxtop;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.jayjd.boxtop.adapter.WallPagerAdapter;
import com.jayjd.boxtop.entity.WallPagerEntity;
import com.jayjd.boxtop.listeners.TvOnItemListener;
import com.jayjd.boxtop.listeners.ViewAnimationShake;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.owen.tvrecyclerview.widget.TvRecyclerView;
import com.owen.tvrecyclerview.widget.V7GridLayoutManager;

import java.util.List;

public class WallPagerActivity extends AppCompatActivity {

    private WallPagerAdapter wallPagerAdapter;
    private TvRecyclerView trWallList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wall_pager);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initView();
        initData();
    }

    private void initData() {
        OkGo.<String>get(ApiConfig.WALLPAPER_URL).execute(new StringCallback() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onSuccess(Response<String> response) {
                if (response.isSuccessful()) {
                    try {
                        String json = response.body();
                        WallPagerEntity wallPagerEntity = new Gson().fromJson(json, WallPagerEntity.class);
                        if (wallPagerEntity.getCode() == 200) {
                            List<WallPagerEntity.DataBean.ListBean> list = wallPagerEntity.getData().getList();
                            wallPagerAdapter.setItems(list);
                            wallPagerAdapter.notifyDataSetChanged();
                            trWallList.requestFocus();
                        }
                    } catch (JsonSyntaxException e) {

                    }
                }
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
            }
        });
    }

    private void initView() {
        trWallList = findViewById(R.id.tr_wall_list);
        trWallList.setLayoutManager(new V7GridLayoutManager(this, 4));
        wallPagerAdapter = new WallPagerAdapter();
        trWallList.setAdapter(wallPagerAdapter);
        trWallList.setOnItemListener(new TvOnItemListener());
        trWallList.setOnInBorderKeyEventListener(new ViewAnimationShake(trWallList, this, 0, null));
    }
}