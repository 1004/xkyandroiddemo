package com.xky.learnandrod.java_.memo_type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xky on 15/6/10.
 *
 * 备忘录管理器
 *
 * 如果要有历史记录的  则需要备份多个
 */
public class MemoManager {

    List<Memo> mDatas = new ArrayList<Memo>();
    private static MemoManager INSTANCE = new MemoManager();
    public static MemoManager getInstance(){
        return INSTANCE;
    }

    /**
     * 保存备忘录
     */
    public void saveMemo(Memo memo){
        if (memo != null){
            mDatas.add(memo);
        }
    }

    /**
     * 获取备忘录  进行数据恢复
     * @param position
     */
    public Memo getMemo(int position){
        if (position<0 || position>=mDatas.size()){
            throw  new IllegalArgumentException("position范围没有备忘录哦");
        }
        return mDatas.get(position);
    }

    /**
     * 清空备忘录
     */
    public void clearMemo(){
        mDatas.clear();
    }


}
