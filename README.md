# ListViewAdapter用法
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
        
        # RecyclerViewAdapter用法
        
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
