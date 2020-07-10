package com.example.saojeong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.saojeong.fragment.ChungGwaFragment;
import com.example.saojeong.fragment.ExampleFragment;
import com.example.saojeong.fragment.NHFragment;
import com.example.saojeong.fragment.SeaFoodFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private NHFragment nhFragment;
    private ChungGwaFragment chungGwaFragment;
    private SeaFoodFragment seaFoodFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView textView = findViewById(R.id.textView);
//        textView.setText("충돌이 나겠죠??");
        //textView.setText("I`m HyunWoo");  //confilct 제거
        //rebase test입니다.
        //git log test입니다.

        fragmentManager = getSupportFragmentManager();

        nhFragment = new NHFragment();
        chungGwaFragment = new ChungGwaFragment();
        seaFoodFragment = new SeaFoodFragment();

        transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.frameLayout, new ExampleFragment())
                .commitAllowingStateLoss();
//        transaction.add(R.id.frameLayout, new ExampleFragment());
    }

    public void clickHandler(View view) {
        transaction = fragmentManager.beginTransaction();

        switch (view.getId())
        {
            case R.id.btn_nh:
                transaction.replace(R.id.frameLayout, nhFragment)
                        .commitAllowingStateLoss();
                break;

            case R.id.btn_cg:
                transaction.replace(R.id.frameLayout, chungGwaFragment)
                        .commitAllowingStateLoss();
                break;
            case R.id.btn_ss:
                transaction.replace(R.id.frameLayout, seaFoodFragment)
                        .commitAllowingStateLoss();
                break;
        }
    }

}