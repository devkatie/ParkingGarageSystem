package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    Button ratesBtn, parkBtn, unparkBtn;
    ImageButton spot1, spot2, spot3, spot4, spot5, spot6, spot7, spot8, spot9, spot10;
    ImageButton spot11, spot12, spot13, spot14, spot15, spot16, spot17, spot18, spot19;
    ImageButton spot20, spot21, spot22, spot23, spot24, spot25, spot26;
    public static final ParkingSpot PS1 = new ParkingSpot();
    public static final ParkingSpot PS2 = new ParkingSpot();
    public static final ParkingSpot PS3 = new ParkingSpot();
    public static final ParkingSpot PS4 = new ParkingSpot();
    public static final ParkingSpot PS5 = new ParkingSpot();
    public static final ParkingSpot PS6 = new ParkingSpot();
    public static final ParkingSpot PS7 = new ParkingSpot();
    public static final ParkingSpot PS8 = new ParkingSpot();
    public static final ParkingSpot PS9 = new ParkingSpot();
    public static final ParkingSpot PS10 = new ParkingSpot();
    public static final ParkingSpot PS11 = new ParkingSpot();
    public static final ParkingSpot PS12 = new ParkingSpot();
    public static final ParkingSpot PS13 = new ParkingSpot();
    public static final ParkingSpot PS14 = new ParkingSpot();
    public static final ParkingSpot PS15 = new ParkingSpot();
    public static final ParkingSpot PS16 = new ParkingSpot();
    public static final ParkingSpot PS17 = new ParkingSpot();
    public static final ParkingSpot PS18 = new ParkingSpot();
    public static final ParkingSpot PS19 = new ParkingSpot();
    public static final ParkingSpot PS20 = new ParkingSpot();
    public static final ParkingSpot PS21 = new ParkingSpot();
    public static final ParkingSpot PS22 = new ParkingSpot();
    public static final ParkingSpot PS23 = new ParkingSpot();
    public static final ParkingSpot PS24 = new ParkingSpot();
    public static final ParkingSpot PS25 = new ParkingSpot();
    public static final ParkingSpot PS26 = new ParkingSpot();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ratesBtn = findViewById(R.id.paymentBtn);
        ratesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "EARLY BIRD RATES:\n" +
                        "Truck: $40.00\nCar: $20.00\nMotorcycle: $10.00" +
                        "\n\n\nHOURLY RATES\n" +
                        "Truck: $5.00\nCar: $2.50\nMotorcycle: $1.00", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        unparkBtn = findViewById(R.id.unParkBtn);
        unparkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, UnParkActivity.class));
            }
        });

        parkBtn = findViewById(R.id.parkBtn);
        parkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(SecondActivity.this, ParkActivity.class));
                Intent intent = new Intent(SecondActivity.this, ParkActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_CODE);
            }
        });

        spot1 = findViewById(R.id.spotOne);
        spot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 1\n\n" + PS1.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot2 = findViewById(R.id.spotTwo);
        spot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 2\n\n" + PS2.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot3 = findViewById(R.id.spotThree);
        spot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 3\n\n" + PS3.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot4 = findViewById(R.id.spotFour);
        spot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 4\n\n" + PS4.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot5 = findViewById(R.id.spotFive);
        spot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 5\n\n" + PS5.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot6 = findViewById(R.id.spotSix);
        spot6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 6\n\n" + PS6.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot7 = findViewById(R.id.spotSeven);
        spot7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 7\n\n" + PS7.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot8 = findViewById(R.id.spotEight);
        spot8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 8\n\n" + PS8.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot9 = findViewById(R.id.spotNine);
        spot9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 9\n\n" + PS9.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot10 = findViewById(R.id.spotTen);
        spot10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 10\n\n" + PS10.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot11 = findViewById(R.id.spotEleven);
        spot11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 11\n\n" + PS11.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot12 = findViewById(R.id.spotThirteen);
        spot12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 12\n\n" + PS12.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot13 = findViewById(R.id.spotFourteen);
        spot13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 13\n\n" + PS13.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot14 = findViewById(R.id.spotFifteen);
        spot14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 14\n\n" + PS14.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot15 = findViewById(R.id.spotSixteen);
        spot15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 15\n\n" + PS15.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot16 = findViewById(R.id.spotEighteen);
        spot16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 16\n\n" + PS16.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot17 = findViewById(R.id.spotNineteen);
        spot17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 17\n\n" + PS17.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot18 = findViewById(R.id.spotTwenty);
        spot18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 18\n\n" + PS18.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot19 = findViewById(R.id.spotTwentyOne);
        spot19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 19\n\n" + PS19.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot20 = findViewById(R.id.spotTwentyTwo);
        spot20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 20\n\n" + PS20.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot21 = findViewById(R.id.spotTwentyThree);
        spot21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 21\n\n" + PS21.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot22 = findViewById(R.id.spotTwentyFour);
        spot22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 22\n\n" + PS22.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot23 = findViewById(R.id.spotTwentyFive);
        spot23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 23\n\n" + PS23.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot24 = findViewById(R.id.spotTwentySix);
        spot24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 24\n\n" + PS24.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot25 = findViewById(R.id.spotTwentySeven);
        spot25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 25\n\n" + PS25.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        spot26 = findViewById(R.id.spotTwentyEight);
        spot26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "SPOT 26\n\n" + PS26.spotDetails() + "", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

}
