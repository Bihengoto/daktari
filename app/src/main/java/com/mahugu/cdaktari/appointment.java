package com.mahugu.cdaktari;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class appointment extends AppCompatActivity implements View.OnClickListener {
    private TextView mLocationTextView;
    private ListView mListView;
    @BindView(R.id.nextButtonBook)
    Button mNext;


    private String[] patient = new String[]{"Dennis Walter - Dr. Alex Wilson", "Cynthia Chris - Dr Hass Steve"};

    private String[] dates = new String[]{"Monday 15th May 2019", "Friday 18th May 2019"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        mListView = (ListView) findViewById(R.id.listView);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        ButterKnife.bind(this);


        MyAppointmentArrayAdapter adapter = new MyAppointmentArrayAdapter(this, android.R.layout.simple_list_item_1, patient, dates);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String restaurant = ((TextView) view).getText().toString();
                Toast.makeText(appointment.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Patient " + location + "...\n Here are the list of patients with the respective doctors and date of appointment:");

        mNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == mNext) {
            Intent intentBook = new Intent(appointment.this, book.class);
            startActivity(intentBook);
        }

    }
}