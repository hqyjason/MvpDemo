package com.example.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private StepView stepView;
    private Button mLastBtn;
    private Button mNextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String[] titles = new String[]{"提现申请", "申请资料", "联系人", "确认信息"};
        //设置进度标题
        stepView = (StepView) findViewById(R.id.sv);
        mLastBtn = (Button) findViewById(R.id.last);
        mNextBtn = (Button)findViewById(R.id.next);
        stepView.setTitles(titles);

        //后退按钮
        mLastBtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                int step = stepView.getCurrentStep();
                //设置进度
                stepView.setCurrentStep(Math.max((step - 1) % stepView.getStepNum(), 0));
            }
        });
        mNextBtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                int step = stepView.getCurrentStep();
                //设置进度
                stepView.setCurrentStep((step + 1) % stepView.getStepNum());
            }
        });

    }
}