package com.example.pein.lab11;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity  extends Activity  implements RadioGroup.OnCheckedChangeListener  {

    private  RadioGroup r1, r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RadioGroup) findViewById(R.id.radiogroup1);
         r2 = (RadioGroup) findViewById(R.id.radiogroup2);
         r3 = (RadioGroup) findViewById(R.id.radiogroup3);
         r4 = (RadioGroup) findViewById(R.id.radiogroup4);

        r1.setOnCheckedChangeListener(this);
        r2.setOnCheckedChangeListener(this);
        r3.setOnCheckedChangeListener(this);
        r4.setOnCheckedChangeListener(this);

        RadioButton rbtn1 = (RadioButton) findViewById(R.id.radio_btn1);
        rbtn1.setChecked(true);




    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (r1.equals(group) && r1.getCheckedRadioButtonId() != -1) {
            Log.d("Test", "r1 checkde");
            r2.clearCheck();
            r3.clearCheck();
            r4.clearCheck();
        } else if (r2.equals(group) && r2.getCheckedRadioButtonId() != -1) {
            Log.d("Test", "r2 checkde");
            r1.clearCheck();
            r3.clearCheck();
            r4.clearCheck();
        } else if (r3.equals(group) && r3.getCheckedRadioButtonId() != -1) {
            Log.d("Test", "r3 checkde");
            r1.clearCheck();
            r2.clearCheck();
            r4.clearCheck();
        } else if (r4.equals(group) && r4.getCheckedRadioButtonId() != -1) {
            Log.d("Test", "r4 checkde");
            r1.clearCheck();
            r2.clearCheck();
            r3.clearCheck();
        } else {
            Log.d("Test", "no checkde");
        }

    }
}
