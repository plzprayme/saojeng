package com.example.saojeong.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.saojeong.R;

public class ExampleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, // xml을 View 객체로 인스턴스화 시켜준다.
                             ViewGroup container, // fragment가 삽입될 레이아웃의 액티비티의 ViewGroup
                             Bundle savedInstanceState) { // fragment가 resume될 때 저장해놓는 데이터 뭉치
        // inflate(param1, param2, param3)
        // param1: 인스턴스화 시킬 XML
        // param2: 위와 같음
        // param3: param2에 등록한 ViewGroup에 param1을 등록(attache)할 것인지 정하는 boolean
        return inflater.inflate(R.layout.example_fragment, container, false);
    }
}

