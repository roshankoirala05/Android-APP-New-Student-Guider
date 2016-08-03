package com.example.android.newstudentguider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void display(View view){

        CheckBox cbx = (CheckBox)this.findViewById(R.id.checkBox);
        if(cbx.isChecked()) {
            LinearLayout information = (LinearLayout) this.findViewById(R.id.information);
            LinearLayout intro = (LinearLayout) this.findViewById(R.id.intro);
            intro.setVisibility(LinearLayout.GONE);
            information.setVisibility(LinearLayout.VISIBLE);

            EditText name = (EditText) this.findViewById(R.id.name);
            String student = name.getText().toString().toUpperCase();

            String greetings = "HI "+student+"\n\n 5 THINGS YOU NEED TO KNOW";
            TextView greetingTextView = (TextView)this.findViewById(R.id.greeting);
            greetingTextView.setText(greetings);
        }
        else {
            Toast message = Toast.makeText(getApplicationContext(), "Please verify that you are new international student",Toast.LENGTH_SHORT);
            message.show();
        }



    }

    public void btn1display(View view) {
        TextView info1 = (TextView)findViewById(R.id.info1);

        if(info1.getVisibility()==View.VISIBLE) {
            info1.setVisibility(View.GONE);
        }
        else {
            info1.setVisibility(View.VISIBLE);

        }
    }
    public void btn2display(View view) {
        TextView info2 = (TextView)findViewById(R.id.info2);
        if(info2.getVisibility()==View.VISIBLE) {
            info2.setVisibility(View.GONE);
        }
        else {
            info2.setVisibility(View.VISIBLE);

        }
    }
    public void btn3display(View view) {
        TextView info3 = (TextView)findViewById(R.id.info3);
        if(info3.getVisibility()==View.VISIBLE) {
            info3.setVisibility(View.GONE);
        }
        else {
            info3.setVisibility(View.VISIBLE);

        }    }
    public void btn4display(View view) {
        TextView info4 = (TextView)findViewById(R.id.info4);
        if(info4.getVisibility()==View.VISIBLE) {
            info4.setVisibility(View.GONE);
        }
        else {
            info4.setVisibility(View.VISIBLE);

        }    }
    public void btn5display(View view) {
        TextView info5 = (TextView)findViewById(R.id.info5);
        if(info5.getVisibility()==View.VISIBLE) {
            info5.setVisibility(View.GONE);
        }
        else {
            info5.setVisibility(View.VISIBLE);

        }    }




}
