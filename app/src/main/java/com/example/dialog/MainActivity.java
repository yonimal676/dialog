package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
{

    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.BTN);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (v == show)
                {
                    openDialog();
                }

            }});


        
    }

    private void openDialog()
    {
        exampleDialog exampleDialog = new exampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"example dialog");
    }
}