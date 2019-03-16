package com.example.convertsdistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private RadioButton radioo, radio1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        radioo = (RadioButton) findViewById(R.id.radio0);
        radio1 = (RadioButton) findViewById(R.id.radio1);

    }

    protected double convertKilometreTomile(double kilometre) {
        return (kilometre * 0.621371);
    }

    protected double convertMileToKilometre(double mile) {
        return (mile * 1.609344);
    }

    protected void button1Click(View view) {
        if (editText1.getText().length() == 0) {
            Toast.makeText(this, getString(R.string.specify_value), Toast.LENGTH_LONG).show();
            return;
        }

        double value = Double.parseDouble(editText1.getText().toString());

        if (radioo.isChecked()) {
            editText1.setText(String.format("%2f", convertMileToKilometre(value)));


            radioo.setChecked(false);
            radio1.setChecked(true);
        } else {
            editText1.setText(String.format("%2f", convertKilometreTomile(value)));

            radioo.setChecked(true);
            radio1.setChecked(false);
        }
    }
}
