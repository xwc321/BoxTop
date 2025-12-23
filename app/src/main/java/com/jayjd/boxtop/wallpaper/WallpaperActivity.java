package com.jayjd.boxtop.wallpaper;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.jayjd.boxtop.R;
import com.jayjd.boxtop.adapter.InfoCardPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class WallpaperActivity extends AppCompatActivity {
    TabLayout wallPaperTabLayout;
    ViewPager2 wallPaperViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wallpaper);
        initView();
        initData();
        bindTabWithViewPage();
    }

    private void bindTabWithViewPage() {
        new TabLayoutMediator(wallPaperTabLayout, wallPaperViewpager, (tab, position) -> {
            switch (position) {
                case 0 -> tab.setText("本地壁纸");
                case 1 -> tab.setText("内置壁纸");
            }
        }).attach();
    }

    private void initData() {
        List<Fragment> fragments = getFragments();
        InfoCardPagerAdapter wallPaperPagerAdapter = new InfoCardPagerAdapter(this, fragments);
        wallPaperViewpager.setAdapter(wallPaperPagerAdapter);
    }

    private List<Fragment> getFragments() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new LocalWallPaperFragment());
        fragments.add(new BuiltInWallPaperFragment());
        return fragments;
    }

    private void initView() {
        wallPaperTabLayout = findViewById(R.id.wall_paper_tab_layout);
        wallPaperViewpager = findViewById(R.id.wall_paper_viewpager);
    }
}