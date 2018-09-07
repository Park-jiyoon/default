package org.androidtown.sksunny;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimePickerButton timePickerButton = (TimePickerButton) findViewById(R.id.btn_timepicker);
        timePickerButton.setTimeSetListener((TimePickerDialog.OnTimeSetListener) this);

    }
    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {

    }

}
