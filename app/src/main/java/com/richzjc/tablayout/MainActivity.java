package com.richzjc.tablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.richzjc.library.TabLayout;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewpager);
        TabLayout tb = findViewById(R.id.tab);

        final List<Fragment> fragments = new ArrayList <> ();
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        final List<String> titles = new ArrayList<>();
        titles.add("android");
        titles.add("ios");
        titles.add("backEnd");
        BaseFragmentAdapter fragmentAdapter = new BaseFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdapter);
        fragmentAdapter.configData(titles, fragments);
        tb.setupWithViewPager(viewPager);
    }
}
