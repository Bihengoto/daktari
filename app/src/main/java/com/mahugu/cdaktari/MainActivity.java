package com.mahugu.cdaktari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    @BindView(R.id.nextButton) Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

       mNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mNext){
            Intent intent = new Intent(MainActivity.this,authenticate.class);
            startActivity(intent);
        }
    }
}
