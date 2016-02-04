package com.zeng.commonadapter.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

/**
 * Created by zeng on 2016/2/4.
 */
public class ListViewHolder {
    ViewHolderImpl mHolderImpl;

    /**
     * @param itemView
     */
    ListViewHolder(View itemView) {
        mHolderImpl = new ViewHolderImpl(itemView);
    }

    /**
     * 获取GodViewHolder
     *
     * @param convertView
     * @param parent
     * @param layoutId
     * @return
     */
    public static ListViewHolder get(View convertView, ViewGroup parent, int layoutId) {
        ListViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
            viewHolder = new ListViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ListViewHolder) convertView.getTag();
        }

        return viewHolder;
    }

    /**
     * @param viewId
     * @param <T>
     * @return
     */
    public <T extends View> T findViewById(int viewId) {
        return mHolderImpl.findViewById(viewId);
    }

    public Context getContext() {
        return mHolderImpl.mItemView.getContext();
    }

    public View getItemView() {
        return mHolderImpl.getItemView();
    }


    public ListViewHolder setOnClickListener(int viewId, View.OnClickListener listener) {
        mHolderImpl.setOnClickListener(viewId, listener);
        return this;
    }

    public ListViewHolder setOnTouchListener(int viewId, View.OnTouchListener listener) {
        mHolderImpl.setOnTouchListener(viewId, listener);
        return this;
    }

    public ListViewHolder setOnLongClickListener(int viewId, View.OnLongClickListener listener) {
        mHolderImpl.setOnLongClickListener(viewId, listener);
        return this;
    }

    public ListViewHolder setOnItemClickListener(int viewId, AdapterView.OnItemClickListener listener) {
        mHolderImpl.setOnItemClickListener(viewId, listener);
        return this;
    }


    public ListViewHolder setOnItemLongClickListener(int viewId, AdapterView.OnItemLongClickListener listener) {
        mHolderImpl.setOnItemLongClickListener(viewId, listener);
        return this;
    }


    public ListViewHolder setOnItemSelectedClickListener(int viewId, AdapterView.OnItemSelectedListener listener) {
        mHolderImpl.setOnItemSelectedClickListener(viewId, listener);
        return this;
    }
}
