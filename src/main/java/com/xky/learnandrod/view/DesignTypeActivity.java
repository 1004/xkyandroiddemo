package com.xky.learnandrod.view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.xky.learnandrod.BaseActivity;
import com.xky.learnandrod.R;
import com.xky.learnandrod.domains.DesignItem;
import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.adapter_type.impl.AdapterClient;
import com.xky.learnandrod.java_.appearence_type.impl.AppearenceClient;
import com.xky.learnandrod.java_.bridge_type.impl.BridgeClient;
import com.xky.learnandrod.java_.clone_type.CloneClient;
import com.xky.learnandrod.java_.command_type.impl.CommondClient;
import com.xky.learnandrod.java_.decorate_type.impl.DecorateClient;
import com.xky.learnandrod.java_.design_type.proxy.proxy_client;
import com.xky.learnandrod.java_.duty_type.impl.DutyClient;
import com.xky.learnandrod.java_.factory_type.impl.FactoryClient;
import com.xky.learnandrod.java_.iterator_type.impl.PagerClient;
import com.xky.learnandrod.java_.medium_type.impl.mediumClient;
import com.xky.learnandrod.java_.memo_type.MemoClient;
import com.xky.learnandrod.java_.state_type.impl.GameClient;
import com.xky.learnandrod.java_.strategy_type.impl.StrategyClient;
import com.xky.learnandrod.java_.temeplate_type.impl.PutClient;
import com.xky.learnandrod.view.adapter.DesignAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xky on 15/5/18.
 */
public class DesignTypeActivity extends BaseActivity{
    private ListView mListView;
    private DesignAdapter mAdapters;
    private List<DesignItem> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        initView();
        initData();
        setlistener();
//        Log.i("test","DesignTypeActivity");
    }


    private void setlistener() {
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mDatas.get(i).getClient().test();
            }
        });
    }

    private void initData() {
        mDatas = new ArrayList<DesignItem>();
        mDatas.add(getDesignItem("代理_1",new proxy_client()));
        mDatas.add(getDesignItem("迭代器_1",new PagerClient()));
        mDatas.add(getDesignItem("工厂_1",new FactoryClient()));
        mDatas.add(getDesignItem("命令_1",new CommondClient()));
        mDatas.add(getDesignItem("适配器_1",new AdapterClient()));
        mDatas.add(getDesignItem("状态_1",new GameClient()));
        mDatas.add(getDesignItem("中介_1",new mediumClient()));
        mDatas.add(getDesignItem("模板_1",new PutClient()));
        mDatas.add(getDesignItem("外观_1",new AppearenceClient()));
        mDatas.add(getDesignItem("策略_1",new StrategyClient()));
        mDatas.add(getDesignItem("通讯录_1",new MemoClient()));
        mDatas.add(getDesignItem("桥接_1",new BridgeClient()));
        mDatas.add(getDesignItem("装饰_1",new DecorateClient()));
        mDatas.add(getDesignItem("原型_1",new CloneClient()));
        mDatas.add(getDesignItem("责任链_1",new DutyClient()));

        mAdapters = new DesignAdapter(this);
        mAdapters.setData(mDatas);

        mListView.setAdapter(mAdapters);
    }

    private void initView(){
        mListView = (ListView) findViewById(R.id.all_design_listview);
    }

    private DesignItem getDesignItem(String title,Client client){
        DesignItem item = new DesignItem();
        item.setClient(client);
        item.setDesignName(title);
        return item;
    }
    
    


}
