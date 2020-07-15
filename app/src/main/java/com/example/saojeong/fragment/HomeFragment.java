package com.example.saojeong.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.saojeong.FragmentActivity;
import com.example.saojeong.R;

public class HomeFragment extends Fragment {

    public static HomeFragment newInstace() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, null);
        Button btn_cg = view.findViewById(R.id.btn_cg);
        Button btn_nh = view.findViewById(R.id.btn_nh);
        Button btn_ss = view.findViewById(R.id.btn_ss);

        btn_cg.setOnClickListener((v) -> {
            ((FragmentActivity)getActivity()).replaceFragment(ChungGwaFragment.newInstance());
        });

        btn_nh.setOnClickListener((v) -> {
            ((FragmentActivity)getActivity()).replaceFragment(NHFragment.newInstance());
        });
        btn_ss.setOnClickListener((v) -> {
            ((FragmentActivity)getActivity()).replaceFragment(SeaFoodFragment.newInstance());
        });

        return view;
    }
}
