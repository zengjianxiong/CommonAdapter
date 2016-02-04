package com.zeng.commonadapter.ViewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import java.io.Serializable;

/**
 * 适用于RecyclerView的ViewHolder
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    /**
     * ViewHolder实现类,桥接模式适配AbsListView与RecyclerView的二维变化
     */
    ViewHolderImpl mHolderImpl;

    /**
     * @param itemView
     */
    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mHolderImpl = new ViewHolderImpl(itemView);
    }

    public Context getContext() {
        return mHolderImpl.mItemView.getContext();
    }

    /**
     * @param viewId
     * @param <T>
     * @return
     */
    public <T extends View> T findViewById(int viewId) {
        return mHolderImpl.findViewById(viewId);
    }

    public View getItemView() {
        return mHolderImpl.getItemView();
    }


    public RecyclerViewHolder setOnClickListener(int viewId, View.OnClickListener listener) {
        mHolderImpl.setOnClickListener(viewId, listener);
        return this;
    }

    public RecyclerViewHolder setOnTouchListener(int viewId, View.OnTouchListener listener) {
        mHolderImpl.setOnTouchListener(viewId, listener);
        return this;
    }


    public RecyclerViewHolder setOnLongClickListener(int viewId, View.OnLongClickListener listener) {
        mHolderImpl.setOnLongClickListener(viewId, listener);
        return this;
    }

    public RecyclerViewHolder setOnItemClickListener(int viewId, AdapterView.OnItemClickListener listener) {
        mHolderImpl.setOnItemClickListener(viewId, listener);
        return this;
    }


    public RecyclerViewHolder setOnItemLongClickListener(int viewId, AdapterView.OnItemLongClickListener listener) {
        mHolderImpl.setOnItemLongClickListener(viewId, listener);
        return this;
    }


    public RecyclerViewHolder setOnItemSelectedClickListener(int viewId, AdapterView.OnItemSelectedListener listener) {
        mHolderImpl.setOnItemSelectedClickListener(viewId, listener);
        return this;
    }
}
