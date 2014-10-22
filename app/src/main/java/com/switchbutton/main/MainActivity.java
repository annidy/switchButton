package com.switchbutton.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.switchbutton.main.IosSwitchButton.Ios_switchButton;


public class MainActivity extends Activity{

    private Ios_switchButton topswitchButton;
    private Ios_switchButton centerswitchButton;
    private Ios_switchButton bottomswitchButton;

    private int[] img = new int[]{
            R.drawable.switch_btn_bg_green,
            R.drawable.switch_btn_bg_white,
            R.drawable.switch_btn_normal,
            R.drawable.switch_btn_pressed
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topswitchButton = (Ios_switchButton)findViewById(R.id.top_switch_button);
        topswitchButton.imageInit(this, R.drawable.switch_btn_bg_green, R.drawable.switch_btn_bg_white, R.drawable.switch_btn_normal, R.drawable.switch_btn_pressed);

        centerswitchButton = (Ios_switchButton)findViewById(R.id.center_switch_button);
        centerswitchButton.imageInit(this,R.drawable.switch_btn_bg_green,R.drawable.switch_btn_bg_white,R.drawable.switch_btn_normal,R.drawable.switch_btn_pressed);

        bottomswitchButton = (Ios_switchButton)findViewById(R.id.bottom_switch_button);
        bottomswitchButton.imageInit(this,img);

        topswitchButton.setChecked(true);
        centerswitchButton.setChecked(false);
        bottomswitchButton.setChecked(true);
        bottomswitchButton.setEnabled(false);

        centerswitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(MainActivity.this,"checked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"UnChecked",Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
