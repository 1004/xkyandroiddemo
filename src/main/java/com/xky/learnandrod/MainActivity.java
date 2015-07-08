package com.xky.learnandrod;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.xky.learnandrod.domains.Mainitem;
import com.xky.learnandrod.view.AritActivity;
import com.xky.learnandrod.view.DesignTypeActivity;
import com.xky.learnandrod.view.JavaGrammarActivity;
import com.xky.learnandrod.view.LeanrBinderActivity;
import com.xky.learnandrod.view.adapter.MainAdapter;
import com.xky.learnandrod.view.guide.guideActivity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MainActivity extends BaseActivity {

    private ListView mListView;
    private List<Mainitem> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        setlistener();
        loadData();
    }

    private void setlistener() {
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),mDatas.get(i).getItemClass());
                startActivity(intent );
            }
        });

    }

    private void loadData() {
    }

    private void initData() {
        mDatas = new ArrayList<Mainitem>();
        mDatas.add(getMainItem("设计代码", DesignTypeActivity.class));
        mDatas.add(getMainItem("java 语法细节", JavaGrammarActivity.class));
        mDatas.add(getMainItem("常用算法",AritActivity.class));
        mDatas.add(getMainItem("Binder_LEARN",LeanrBinderActivity.class));
        mDatas.add(getMainItem("启动导航页",guideActivity.class));
        MainAdapter mAdapter = new MainAdapter(this);
        mAdapter.setData(mDatas);
        mListView.setAdapter(mAdapter);
//        System.out.println("dsfa");
//        Log.i("test","ddd");
    }

    /**
     * 初始化数据
     */
    private void initView() {
        mListView = (ListView) findViewById(R.id.all_function_listview);
    }
    private Mainitem getMainItem(String name,Class clazz){
        Mainitem  item = new Mainitem();
        item.setItemClass(clazz);
        item.setItemName(name);
        return item;
    }





}
