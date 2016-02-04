package com.zeng.commonadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.zeng.commonadapter.Adapter.ListViewAdapter;
import com.zeng.commonadapter.ViewHolder.ListViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zeng on 2016/2/4.
 */
public class ListViewActivity extends AppCompatActivity {

    private ListView listView;

    private List<String> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView= (ListView) findViewById(R.id.list_view);

        for(int i=0;i<10000;i++){
            data.add("这个是第"+i+"条数据");
        }
        /*
        * 设置布局和数据源
        * */
        ListViewAdapter<String> mAdapter=new ListViewAdapter<String>(R.layout.item_view,data) {
            TextView textView;
            @Override
            protected void onBindData(ListViewHolder viewHolder, int position, String item) {
                textView= (TextView) viewHolder.getItemView().findViewById(R.id.textView);
                textView.setText(item);
            }
        };
        listView.setAdapter(mAdapter);
    }
}
