package com.jayjd.boxtop.wallpaper;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.jayjd.boxtop.R;
import com.jayjd.boxtop.adapter.InfoCardPagerAdapter;
import com.jayjd.boxtop.cards.CardPerformance;
import com.jayjd.boxtop.cards.CardStorage;
import com.jayjd.boxtop.cards.CardWeather;

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
    }

    private void initData() {
        List<Fragment> fragments = getFragments();
        InfoCardPagerAdapter wallPaperPagerAdapter = new InfoCardPagerAdapter(this, fragments);
        wallPaperViewpager.setAdapter(wallPaperPagerAdapter);
    }

    private List<Fragment> getFragments() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new CardWeather());
        fragments.add(new CardStorage());
        fragments.add(new CardPerformance());
        return fragments;
    }

    private void initView() {
        wallPaperTabLayout = findViewById(R.id.wall_paper_tab_layout);
        wallPaperViewpager = findViewById(R.id.wall_paper_viewpager);
    }
}