package com.bulana.pickerfordate;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bulana.pickerfordate.constant.Constant;

public class MainActivity extends AppCompatActivity {
    private TextView dateTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateTextView = findViewById(R.id.textView);
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+Constant.ONE);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string + Constant.FORWARD_SLASH + day_string + Constant.FORWARD_SLASH + year_string);
        dateTextView.setText(dateMessage);
        Toast.makeText(this, "Date: " + dateMessage, Toast.LENGTH_SHORT).show();
    }
}
