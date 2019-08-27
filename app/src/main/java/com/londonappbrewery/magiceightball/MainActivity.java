package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      final   ImageView theBall = (ImageView) findViewById(R.id.ballImage);
        TextView theTitle = (TextView) findViewById(R.id.titleText);
        Button askButton = (Button) findViewById(R.id.askButton);

       final int[] ballImages = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomObjec = new Random();
                int number = randomObjec.nextInt(5);

                Log.i("theNumber",number+"");

                theBall.setImageResource(ballImages[number]);




            }
        });
    }
}
