package com.example.saojeong.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.saojeong.R;

public class SeaFoodFragment extends Fragment {

    public static SeaFoodFragment newInstance() {
        return new SeaFoodFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.ss_fragment, container, false);
    }
}
