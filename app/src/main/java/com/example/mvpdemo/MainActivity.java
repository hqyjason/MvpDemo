package com.example.mvpdemo;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MVPView, android.view.View.OnClickListener {

    private TextView news;
    private Button add;
    private Button less;

    MainPresentet mainPresentet = new MainPresentet(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("分支第一次提交" , "yes");
        setContentView(R.layout.activity_main);
        initView();
        Log.e("修改" , "yes");
        mainPresentet.show();

        
    }

    @Override
    public void addNum(String str) {
        news.setText(str);
    }

    @Override
    public void lessNum(String str) {
        news.setText(str);
    }

    @Override
    public void show(String string) {
        news.setText(string);
    }

    private void initView() {
        news = (TextView) findViewById(R.id.news);
        add = (Button) findViewById(R.id.add);
        less = (Button) findViewById(R.id.less);

        add.setOnClickListener(this);
        less.setOnClickListener(this);
    }

    @Override
    public void onClick(android.view.View v) {
        switch (v.getId()) {
            case R.id.add:
                mainPresentet.addNum();
                break;
            case R.id.less:
                mainPresentet.lessNum();
                break;
        }
    }

}