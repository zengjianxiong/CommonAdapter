package com.zeng.commonadapter.ViewHolder;

import android.content.DialogInterface;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by zeng on 2016/2/4.
 */
public class ViewHolderImpl {

    View mItemView;

    private SparseArray<View> mCacheView=new SparseArray<>();

    public ViewHolderImpl(View itemView){
        mItemView=itemView;
    }

    public View getItemView() {
        return mItemView;
    }

    public <D extends View> D findViewById(int viewId){
        View target=mCacheView.get(viewId);
        if(target==null){
            target=mItemView.findViewById(viewId);
            mCacheView.put(viewId,target);
        }
        return (D)target;
    }

    /*
    * 各种事件
    * */
    public void setOnClickListener(int viewId,View.OnClickListener listener){
        View view=findViewById(viewId);
        view.setOnClickListener(listener);
    }
    public void setOnTouchListener(int viewId,View.OnTouchListener listener){
        View view=findViewById(viewId);
        view.setOnTouchListener(listener);
    }
    public void setOnLongClickListener(int viewId, View.OnLongClickListener listener) {
        View view = findViewById(viewId);
        view.setOnLongClickListener(listener);
    }

    public void setOnItemClickListener(int viewId, AdapterView.OnItemClickListener listener) {
        AdapterView view = findViewById(viewId);
        view.setOnItemClickListener(listener);
    }


    public void setOnItemLongClickListener(int viewId, AdapterView.OnItemLongClickListener listener) {
        AdapterView view = findViewById(viewId);
        view.setOnItemLongClickListener(listener);
    }


    public void setOnItemSelectedClickListener(int viewId, AdapterView.OnItemSelectedListener listener) {
        AdapterView view = findViewById(viewId);
        view.setOnItemSelectedListener(listener);
    }




}
