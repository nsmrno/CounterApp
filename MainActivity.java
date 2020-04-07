package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int num = 0;
    Button mButton ;
    Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView count = findViewById(R.id.textView);

        mButton = findViewById(R.id.button);
        mButton2 = findViewById(R.id.button2);


        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                num++;
                count.setText(String.valueOf(num));
            }
        });


        mButton2.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            num = 0;
            count.setText(String.valueOf(num));
    }
});

        }


}
