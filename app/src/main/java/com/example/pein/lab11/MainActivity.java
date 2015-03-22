package com.example.pein.lab11;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TooManyListenersException;


public class MainActivity  extends Activity  implements RadioGroup.OnCheckedChangeListener  {

    private  RadioGroup r1, r2,r3,r4;
    final Model m = new Model();
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

        final RadioButton rbtn1 = (RadioButton) findViewById(R.id.radio_btn1);
        rbtn1.setChecked(true);
        final RadioButton rbtn2 = (RadioButton) findViewById(R.id.radio_btn2);
        final RadioButton rbtn3 = (RadioButton) findViewById(R.id.radio_btn3);
        final RadioButton rbtn4 = (RadioButton) findViewById(R.id.radio_btn4);


        final ImageView v1 = (ImageView) findViewById(R.id.image_view1);
        final ImageView v2 = (ImageView) findViewById(R.id.image_view2);
        final ImageView v3 = (ImageView) findViewById(R.id.image_view3);
        final ImageView v4 = (ImageView) findViewById(R.id.image_view4);

        loadImage(m.getCurrentIndex());

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbtn1.setChecked(true);
//                rbtn1.setChecked(true);

            }
        });

        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbtn2.setChecked(true);
//                rbtn2.setChecked(true);

            }
        });

        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbtn3.setChecked(true);
//                rbtn3.setChecked(true);

            }
        });

        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbtn4.setChecked(true);
//                rbtn4.setChecked(true);

            }
        });


        int curIndex = -1;
        final Button nextbtn = (Button) findViewById(R.id.next_btn);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Act", "next button is clicked");

                int curIndex = m.getCurrentIndex();
                Log.d("Act", "CurrentQuestion: " + Integer.toString(curIndex));
                if (rbtn1.isChecked()) {
                    m.setAnswer(0);
                    Log.d("q", "question: " + Integer.toString(curIndex) + "answer is 0");
                } else
                if (rbtn2.isChecked()) {
                    m.setAnswer(1);
                    Log.d("q", "question: " + Integer.toString(curIndex) + "answer is 1");
                } else
                if (rbtn3.isChecked()) {
                    m.setAnswer(2);
                    Log.d("q", "question: " + Integer.toString(curIndex) + "answer is 2");
                } else
                if (rbtn4.isChecked()) {
                    m.setAnswer(3);
                    Log.d("q", "question: " + Integer.toString(curIndex) + "answer is 3");
                }
                Question q = m.getQuestion();





                   // Toast.makeText(getApplicationContext(), Integer.toString(curIndex), Toast.LENGTH_SHORT).show();
                loadImage(m.getCurrentIndex());




            }
        });

        //nextbtn.callOnClick();

        Button resultbtn = (Button) findViewById(R.id.result_btn);

        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //last question
                int curIndex = m.getCurrentIndex();
                if (rbtn1.isChecked()) {
                    m.setAnswer(0);
                    Log.d("Act", "question: " + Integer.toString(curIndex) + "answer is 0");
                } else
                if (rbtn2.isChecked()) {
                    m.setAnswer(1);
                    Log.d("Act", "question: " + Integer.toString(curIndex) + "answer is 1");
                } else
                if (rbtn3.isChecked()) {
                    m.setAnswer(2);
                    Log.d("Act", "question: " + Integer.toString(curIndex) + "answer is 2");
                } else
                if (rbtn4.isChecked()) {
                    m.setAnswer(3);
                    Log.d("Act", "question: " + Integer.toString(curIndex) + "answer is 3");
                }
                String res = Integer.toString(m.getSummOfAnswer());
                Toast.makeText(getApplicationContext(), res, Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void  loadImage(int curIndex) {
        final ImageView v1 = (ImageView) findViewById(R.id.image_view1);
        final ImageView v2 = (ImageView) findViewById(R.id.image_view2);
        final ImageView v3 = (ImageView) findViewById(R.id.image_view3);
        final ImageView v4 = (ImageView) findViewById(R.id.image_view4);

        switch (curIndex) {
            case 0: {
                v1.setImageDrawable(getResources().getDrawable(R.drawable.img11));
                v2.setImageDrawable(getResources().getDrawable(R.drawable.img12));
                v3.setImageDrawable(getResources().getDrawable(R.drawable.img13));
                v4.setImageDrawable(getResources().getDrawable(R.drawable.img14));
                break;
            }
            case 1: {
                v1.setImageDrawable(getResources().getDrawable(R.drawable.img21));
                v2.setImageDrawable(getResources().getDrawable(R.drawable.img22));
                v3.setImageDrawable(getResources().getDrawable(R.drawable.img23));
                v4.setImageDrawable(getResources().getDrawable(R.drawable.img24));
                break;
            }
            case 2: {
                v1.setImageDrawable(getResources().getDrawable(R.drawable.img31));
                v2.setImageDrawable(getResources().getDrawable(R.drawable.img32));
                v3.setImageDrawable(getResources().getDrawable(R.drawable.img33));
                v4.setImageDrawable(getResources().getDrawable(R.drawable.img34));
                break;
            }
            case 3: {
                v1.setImageDrawable(getResources().getDrawable(R.drawable.img41));
                v2.setImageDrawable(getResources().getDrawable(R.drawable.img42));
                v3.setImageDrawable(getResources().getDrawable(R.drawable.img43));
                v4.setImageDrawable(getResources().getDrawable(R.drawable.img44));
                Button btn = (Button) findViewById(R.id.result_btn);
                btn.setEnabled(true);
                final Button nextbtn = (Button) findViewById(R.id.next_btn);
                nextbtn.setEnabled(false);
                break;
            }
            default:

                break;
        }
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
