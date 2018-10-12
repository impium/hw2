package com.example.brendon.hw2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    //public Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Date date;
    final Handler handler = new Handler();
        final Model model = new Model();
        date = model.getDate();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text;
        text = findViewById(R.id.date);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String today = df.format(date);
        text.setText(today);


        Button changeDay = findViewById(R.id.changeDay);

        System.out.println(model.getDay());

        changeDay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                model.setDay(model.getDay()+1);

                System.out.println(model.getDay());
                System.out.println(model.getDate());
            }
        });


        Button changeMonth = findViewById(R.id.ChangeMonth);



        changeMonth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                model.setMonth(model.getMonth()+1);



            }
        });
        Button changeYear = findViewById(R.id.ChangeYear);



        changeYear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                model.setYear(model.getYear()+1);



            }
        });

// Define the code block to be executed
            Runnable runnableCode = new Runnable() {
            @Override
            public void run() {
                // Do something here on the main thread
                TextView text;
                text = findViewById(R.id.date);
                System.out.println("INNNN");
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                String today = df.format(model.getDate());
                text.setText(today);

                handler.postDelayed(this, 2000);
            }
        };
// Start the initial runnable task by posting through the handler
        handler.post(runnableCode);
    }
}


