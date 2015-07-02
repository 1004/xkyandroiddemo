package com.xky.learnandrod.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xky.learnandrod.R;
import com.xky.learnandrod.domains.Mainitem;

import java.util.ArrayList;
import java.util.List;


public class MainAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Mainitem> mDatas;

    public MainAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        mDatas = new ArrayList<Mainitem>();
    }

    public void setData(List<Mainitem> datas) {
        mDatas.addAll(datas);
    }

    @Override
    public int getCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoder mViewHolder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.main_item, null);
            mViewHolder = new ViewHoder();
            mViewHolder.item = (TextView) convertView.findViewById(R.id.item_title);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHoder) convertView.getTag();
        }
        mViewHolder.item.setText(mDatas.get(position).getItemName());
        return convertView;
    }

    class ViewHoder {
        public TextView item;
    }

}
