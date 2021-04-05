package com.example.viewpager2withrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 mViewpager;
    MyAdapter myAdapter;
    List<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewpager = findViewById(R.id.viewPagerEx);
        strings = new ArrayList<>();
        strings.add("Screen 1");
        strings.add("Screen 2");
        strings.add("Screen 3");
        strings.add("Screen 4");
        strings.add("Screen 5");
        strings.add("Screen 6");
        strings.add("Screen 7");
        strings.add("Screen 8");
        strings.add("Screen 9");
        strings.add("Screen 10");

        myAdapter = new MyAdapter(this, strings);
        mViewpager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        mViewpager.setAdapter(myAdapter);

    }
}