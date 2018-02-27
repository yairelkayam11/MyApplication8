package com.example.j.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.webkit.WebSettings.PluginState.ON;
import static java.util.logging.Level.OFF;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    ToggleButton TB1;
    Switch swt1;
    LinearLayout LL;
    boolean bool1;
    boolean bool2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button) findViewById(R.id.btn1);

        TB1 = (ToggleButton) findViewById(R.id.TB1);

        swt1 = (Switch) findViewById(R.id.swt1);

        LL = (LinearLayout) findViewById(R.id.LL);
    }


    public void yair1(View view){

        bool1= TB1.isChecked();
    }

    public void yair2(View view){

        bool2=swt1.isChecked();
    }



    public void yair3(View view) {

        if (bool1 && bool2) {
            LL.setBackgroundColor(Color.BLUE);
        }
         else if ( bool1 && !bool2) {
            LL.setBackgroundColor(Color.GREEN);
        }
        else if (!bool1 && bool2) {
            LL.setBackgroundColor(Color.MAGENTA);
        }
        else if (!bool1 && !bool2) {
            LL.setBackgroundColor(Color.YELLOW);
        }
    }
}






