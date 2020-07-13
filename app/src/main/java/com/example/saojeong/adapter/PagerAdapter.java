package com.example.saojeong.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.saojeong.R;
import com.example.saojeong.model.DataPage;

import java.util.ArrayList;

public class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_title;
        public RelativeLayout rl_layout;

        DataPage data;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            rl_layout = itemView.findViewById(R.id.rl_layout);
        }
    }
    private ArrayList<DataPage> listData;

    public PagerAdapter(ArrayList<DataPage> data) {
        this.listData = data;
    }

    @Override
    public PagerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_viewpager, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //if(holder instanceof ViewHolder) {
            DataPage data = listData.get(position);

            TextView textView = holder.tv_title;
            RelativeLayout layout = holder.rl_layout;
            textView.setText(data.getTitle());
            layout.setBackgroundResource(data.getColor());
        //}
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

}
