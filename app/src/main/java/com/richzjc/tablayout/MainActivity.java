package com.richzjc.tablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.richzjc.library.TabLayout;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    TabLayout tb;
    List<String> titles;
    List<Fragment> fragments;
    BaseFragmentAdapter fragmentAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        tb = findViewById(R.id.tab);

        fragments = new ArrayList<>();
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        fragments.add(new Fragment());
        titles = new ArrayList<>();
        titles.add("a");
        titles.add("b");
        titles.add("c");
        titles.add("d");
        titles.add("e");
        titles.add("f");
        titles.add("g");
        titles.add("h");
        titles.add("i");
        titles.add("j");
        titles.add("k");
        titles.add("l");
        titles.add("m");
        titles.add("n");
        titles.add("o");
        fragmentAdapter = new BaseFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdapter);
        fragmentAdapter.configData(titles, fragments);
        tb.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(8);
        setListener();
    }

    private void setListener() {
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(titles.size());
                if (index % 2 == 0) {
                    titles.remove(index);
                    fragments.remove(index);
                    fragmentAdapter.configData(titles, fragments);

                } else {
                    titles.add(index, System.currentTimeMillis() + "");
                    fragments.add(index, new Fragment());
                    fragmentAdapter.configData(titles, fragments);
                }
                viewPager.setAdapter(fragmentAdapter);
                tb.setupWithViewPager(viewPager);
                viewPager.setCurrentItem(index);
            }
        });
    }

}
