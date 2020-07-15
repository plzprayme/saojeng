package com.example.saojeong.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.saojeong.R;

public class TabFragment extends Fragment {
    int num;

    TabFragment(int position)
    {
        num=position;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        if(num==1)
            view=inflater.inflate(R.layout.text_fragment1, container, false); //1이면 이탭
        else
            view=inflater.inflate(R.layout.text_fragment2, container, false); //0,2,외 이탭
        return view;
    }
}
