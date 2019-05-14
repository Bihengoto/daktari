package com.mahugu.cdaktari;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

;import butterknife.BindView;
import butterknife.ButterKnife;

public class authenticate extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.nextButtonAuth) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticate);
        ButterKnife.bind(this);

        mFindRestaurantsButton.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
                if(v == mFindRestaurantsButton){
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(authenticate.this, appointment.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        }
}

