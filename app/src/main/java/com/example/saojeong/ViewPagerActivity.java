package com.example.saojeong;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.saojeong.adapter.PagerAdapter;
import com.example.saojeong.model.DataPage;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {
    ViewPager2 viewPager2;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager2);

        viewPager2 = findViewById(R.id.pager);

        ArrayList<DataPage> list = new ArrayList<>();
        list.add(new DataPage(android.R.color.black,"1 Page"));
        list.add(new DataPage(android.R.color.holo_red_light,"2 Page"));
        list.add(new DataPage(android.R.color.holo_green_dark,"3 Page"));
        list.add(new DataPage(android.R.color.holo_orange_dark,"4 Page"));
        list.add(new DataPage(android.R.color.holo_blue_light,"5 Page"));

        viewPager2.setAdapter(new PagerAdapter(list));
    }
}
