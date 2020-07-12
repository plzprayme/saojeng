package com.example.saojeong.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter1  extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapter1(FragmentManager fm, int num){
        super(fm);
        this.num=num;
    }

    @Override
    public Fragment getItem(int position) {


        TabFragment tab1=new TabFragment(num);
        return tab1;

    }

    @Override
    public int getCount() {
        return num;
    }
}