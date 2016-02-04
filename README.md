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
