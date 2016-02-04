package com.zeng.commonadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.zeng.commonadapter.Adapter.RecyclerViewAdapter;
import com.zeng.commonadapter.ViewHolder.RecyclerViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zeng on 2016/2/4.
 */
public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<String> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        for(int i=0;i<10000;i++){
            data.add("这个是第"+i+"条数据");
        }
        RecyclerViewAdapter<String> mAdapter=new RecyclerViewAdapter<String>(R.layout.item_view,data) {
            TextView textView;
            @Override
            protected void onBindData(RecyclerViewHolder viewHolder, int position, String item) {
                textView= (TextView) viewHolder.getItemView().findViewById(R.id.textView);
                textView.setText(item);
            }
        };
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
    }
}
