package com.example.saojeong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.saojeong.fragment.ChungGwaFragment;
import com.example.saojeong.fragment.CommunityFragment;
import com.example.saojeong.fragment.HomeFragment;

import androidx.annotation.NonNull;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//bottom_nav_menu android:icon="" 추가필요

public class MainActivity extends AppCompatActivity {

    public Button button;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        BottomNavigationView bottomNavigationView = findViewById(R.id.navBottm_view);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, new ChungGwaFragment()).commitAllowingStateLoss();

        // bottomNavigationView의 아이템이 선택될 때 호출될 리스너 등록
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            FragmentTransaction transaction1 = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home: {
                    transaction1.replace(R.id.frame_layout, new ChungGwaFragment()).commitAllowingStateLoss();
                    break;
                }
                case R.id.navigation_bot: {
                    transaction1.replace(R.id.frame_layout, new ChungGwaFragment()).commitAllowingStateLoss();
                    break;
                }
                case R.id.navigation_money: {
                    transaction1.replace(R.id.frame_layout, new HomeFragment()).commitAllowingStateLoss();
                    break;
                }
                case R.id.navigation_community: {
                    transaction1.replace(R.id.frame_layout, new CommunityFragment()).commitAllowingStateLoss();
                    break;
                }
            }

            return true;
        });

    }

    public void OnClickHandler(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("리스트 추가 예제");

        builder.setItems(R.array.Score, (dialog, pos) -> {
            String[] items = getResources().getStringArray(R.array.Score);
            switch (pos) {
                case 0:
                    button.setText("평점높");
                    break;
                case 1:
                    button.setText("평점많");
                    break;
                case 2:
                    button.setText("점포번호");
                    break;
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}


//public class MainActivity extends AppCompatActivity {
//
//    private FragmentManager fragmentManager;
//    private FragmentTransaction transaction;
//    private NHFragment nhFragment;
//    private ChungGwaFragment chungGwaFragment;
//    private SeaFoodFragment seaFoodFragment;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
////        TextView textView = findViewById(R.id.textView);
////        textView.setText("충돌이 나겠죠??");
//        //textView.setText("I`m HyunWoo");  //confilct 제거
//        //rebase test입니다.
//        //git log test입니다.
//
//        fragmentManager = getSupportFragmentManager();
//
//        nhFragment = new NHFragment();
//        chungGwaFragment = new ChungGwaFragment();
//        seaFoodFragment = new SeaFoodFragment();
//
//        transaction = fragmentManager.beginTransaction();
//
//        transaction.replace(R.id.frameLayout, new ExampleFragment())
//                .commitAllowingStateLoss();
////        transaction.add(R.id.frameLayout, new ExampleFragment());
//    }
//
//    public void clickHandler(View view) {
//        transaction = fragmentManager.beginTransaction();
//
//        switch (view.getId())
//        {
//            case R.id.btn_nh:
//                transaction.replace(R.id.frameLayout, nhFragment)
//                        .commitAllowingStateLoss();
//                break;
//
//            case R.id.btn_cg:
//                transaction.replace(R.id.frameLayout, chungGwaFragment)
//                        .commitAllowingStateLoss();
//                break;
//            case R.id.btn_ss:
//                transaction.replace(R.id.frameLayout, seaFoodFragment)
//                        .commitAllowingStateLoss();
//                break;
//        }
//    }
//
//}