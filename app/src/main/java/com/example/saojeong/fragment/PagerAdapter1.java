package com.example.saojeong.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter1  extends FragmentStateAdapter {
    public PagerAdapter1(FragmentActivity fa){
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) { //Fragment 생성
        switch(position){
            case 0:
                return new TabFragment(position); //0번째 탭
            case 1:
                return new TabFragment(position); //1번째 탭
            default:
                return new TabFragment(position); //2번째 탭
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}