package com.heavendevelopment.strattaio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.applandeo.materialcalendarview.CalendarView;

public class NewBookingActivity extends AppCompatActivity {

    CalendarView mCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_reservation);


        mCalendarView = (CalendarView) findViewById(R.id.calendarView);


    }


}
