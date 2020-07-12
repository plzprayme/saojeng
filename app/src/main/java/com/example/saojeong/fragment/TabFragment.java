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
        View view=inflater.inflate(R.layout.text_fragment1, container, false);
        TextView text=view.findViewById(R.id.textView1111);
        text.setText(num);
        return view;
    }
}
