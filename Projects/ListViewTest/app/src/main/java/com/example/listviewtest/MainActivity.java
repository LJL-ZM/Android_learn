package com.example.listviewtest;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<MengFuFu> mengList = new ArrayList<MengFuFu>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        MengFuFuAdapter ad = new MengFuFuAdapter(MainActivity.this, R.layout.mengfufu_item, mengList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(ad);
    }
    private void init(){
        for(int i = 0; i < 4; i++){
            MengFuFu furry = new MengFuFu("福瑞", R.drawable.p1);
            mengList.add(furry);
            MengFuFu nuo = new MengFuFu("糯叽", R.drawable.p2);
            mengList.add(nuo);
            MengFuFu sun = new MengFuFu("晴空", R.drawable.p3);
            mengList.add(sun);
            MengFuFu ear = new MengFuFu("兽耳", R.drawable.p4);
            mengList.add(ear);
            MengFuFu black = new MengFuFu("暗黑", R.drawable.p5);
            mengList.add(black);
        }
    }
}