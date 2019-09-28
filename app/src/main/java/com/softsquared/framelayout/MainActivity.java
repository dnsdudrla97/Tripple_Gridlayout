package com.softsquared.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.LinkAddress;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    private View layout_day1;
    private View layout_day2;
    private View layout_day3;
    private View layout_day4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);

        this.InitializeView();
    }

    public void InitializeView()
    {
        layout_day1 = (LinearLayout)findViewById(R.id.day_layout1);
        layout_day2 = (LinearLayout)findViewById(R.id.day_layout2);
        layout_day3 = (LinearLayout)findViewById(R.id.day_layout3);
        layout_day4 = (LinearLayout)findViewById(R.id.day_layout4);
    }

    @Override
    public void onClick(View view){
        layout_day1.setVisibility(View.INVISIBLE);
        layout_day2.setVisibility(View.INVISIBLE);
        layout_day3.setVisibility(View.INVISIBLE);
        layout_day4.setVisibility(View.INVISIBLE);

        switch (view.getId()){
            case R.id.btn_1:
                layout_day1.setVisibility(View.VISIBLE);
                break;

            case R.id.btn_2:
                layout_day2.setVisibility(View.VISIBLE);
                break;

            case R.id.btn_3:
                layout_day3.setVisibility(View.VISIBLE);
                break;

            case R.id.btn_4:
                layout_day4.setVisibility(View.VISIBLE);
                break;

        }
    }
}
