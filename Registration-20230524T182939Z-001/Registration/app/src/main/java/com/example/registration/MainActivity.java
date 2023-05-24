package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button clickButton1,clickButton2;
    private RadioGroup rgGender;
    private RadioButton rbGender;
    private EditText textField;
    private Spinner subjects;
    private CheckBox terms;
    String[] subject = { "C", "Data structures",
            "Android Dev", "Algorithms",
            "DSA with java", "OS" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initResources();
    }
    private void initResources(){
        rgGender = findViewById(R.id.rg_gender);
        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(checkedId);
                boolean isChecked = checkedRadioButton.isChecked();
                if (isChecked)
                {
                    Toast.makeText(getApplicationContext(), "Checked:" + checkedRadioButton.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        terms = findViewById(R.id.cb_terms);
        terms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    terms.setTextColor(getResources().getColor(R.color.green));
                }else {
                    terms.setTextColor(getResources().getColor(R.color.red));
                }
            }
        });




        subjects = findViewById(R.id.sp_subjects);

        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                subject);
        ad.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);
        subjects.setAdapter(ad);

        clickButton1 = findViewById(R.id.btn_1);
        clickButton1.setOnClickListener(this);
        clickButton2 = findViewById(R.id.btn_2);
        clickButton2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_1){

        }else if(v.getId() == R.id.btn_2){
            Toast.makeText(this,"Dialog Button Click",Toast.LENGTH_SHORT).show();
        }
    }

}