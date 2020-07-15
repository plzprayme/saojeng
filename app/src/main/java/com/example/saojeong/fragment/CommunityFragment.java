package com.example.saojeong.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.saojeong.MainActivity;
import com.example.saojeong.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CommunityFragment extends Fragment {


    PagerAdapter1 adapter;
    ViewPager2 viewPager;
    TabLayout tabLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = (ViewGroup) inflater.inflate(R.layout.community_fragment, container, false);


        adapter=new PagerAdapter1(getActivity());
        viewPager=view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        tabLayout = view.findViewById(R.id.tablayout);

        //Tab사용시 필요
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.OnConfigureTabCallback(){

            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) { //탭 목록
                switch(position){
                    case 0:{
                        tab.setText("0");
                        break;
                    }
                    case 1:{
                        tab.setText("1");
                        break;
                    }
                    case 2:{
                        tab.setText("2");
                        break;
                    }
                }



            }
        });
        tabLayoutMediator.attach(); //붙임

        return view;
    }

}
