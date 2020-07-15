package com.example.saojeong.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.saojeong.R;

public class ChungGwaFragment extends Fragment {

    public static ChungGwaFragment newInstance() {
        return new ChungGwaFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cg_fragment, container, false);
    }
}
