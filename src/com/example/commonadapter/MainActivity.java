package com.example.commonadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.lv);
        MyCommenAdapter myAdapter = new  MyCommenAdapter(this);
        List<Grade> list=new ArrayList<Grade>();
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        list.add(new Grade("1","高一",0));
        list.add(new Grade("1","高一",1));
        list.add(new Grade("1","高一",2));
        lv.setAdapter(myAdapter);
        myAdapter.updateViewData(list,true);
    }
}
