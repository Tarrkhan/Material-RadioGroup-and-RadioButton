package com.tarakhan.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.RadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)

                {
                    case R.id.Radio_Id :
                        Toast.makeText(getApplicationContext(),"radio 1",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.Radio_Id2:
                        Toast.makeText(getApplicationContext(),"radio 2",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
