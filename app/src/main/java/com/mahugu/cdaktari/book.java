package com.mahugu.cdaktari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class book extends AppCompatActivity {
    private Button mbookNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        mbookNow = (Button) findViewById(R.id.bookNow);
        mbookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(book.this, "Successfully Booked!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
