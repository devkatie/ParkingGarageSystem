package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class ParkActivity extends AppCompatActivity {

    Button goBack, parkBtn;
    RadioButton carRB, truckRB, motorRB, hourlyRB, earlyBirdRB;
    EditText lPlate;
    String licensePlate;
    private Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);

        lPlate = findViewById(R.id.licensePlateEditText);
        licensePlate = lPlate.getText().toString();
        carRB = findViewById(R.id.carRB);
        truckRB = findViewById(R.id.truckRB);
        motorRB = findViewById(R.id.motorRB);
        hourlyRB = findViewById(R.id.hourlyRB);
        earlyBirdRB = findViewById(R.id.earlyBirdRB);
        parkBtn = findViewById(R.id.parkVehicleBtn);
        parkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(carRB.isChecked()) {
                    vehicle = new Car(licensePlate);
                } else if (truckRB.isChecked()) {
                    vehicle = new Truck(licensePlate);
                } else {
                    vehicle = new Motorcycle(licensePlate);
                }
                if(!SecondActivity.PS1.hasVehicle()) {
                    SecondActivity.PS1.park(vehicle);
                } else if (!SecondActivity.PS2.hasVehicle()) {
                    SecondActivity.PS2.park(vehicle);
                } else if(!SecondActivity.PS3.hasVehicle()){
                    SecondActivity.PS3.park(vehicle);
                }else if(!SecondActivity.PS4.hasVehicle()){
                    SecondActivity.PS4.park(vehicle);
                }else if(!SecondActivity.PS5.hasVehicle()){
                    SecondActivity.PS5.park(vehicle);
                }else if(!SecondActivity.PS6.hasVehicle()){
                    SecondActivity.PS6.park(vehicle);
                }else if(!SecondActivity.PS7.hasVehicle()){
                    SecondActivity.PS7.park(vehicle);
                }else if(!SecondActivity.PS8.hasVehicle()){
                    SecondActivity.PS8.park(vehicle);
                }else if(!SecondActivity.PS9.hasVehicle()){
                    SecondActivity.PS9.park(vehicle);
                }else if(!SecondActivity.PS10.hasVehicle()){
                    SecondActivity.PS10.park(vehicle);
                }else if(!SecondActivity.PS11.hasVehicle()){
                    SecondActivity.PS11.park(vehicle);
                }else if(!SecondActivity.PS12.hasVehicle()){
                    SecondActivity.PS12.park(vehicle);
                }else if(!SecondActivity.PS13.hasVehicle()){
                    SecondActivity.PS13.park(vehicle);
                }else if(!SecondActivity.PS14.hasVehicle()){
                    SecondActivity.PS14.park(vehicle);
                }else if(!SecondActivity.PS15.hasVehicle()){
                    SecondActivity.PS15.park(vehicle);
                }else if(!SecondActivity.PS16.hasVehicle()){
                    SecondActivity.PS16.park(vehicle);
                }else if(!SecondActivity.PS17.hasVehicle()){
                    SecondActivity.PS17.park(vehicle);
                }else if(!SecondActivity.PS18.hasVehicle()){
                    SecondActivity.PS18.park(vehicle);
                }else if(!SecondActivity.PS19.hasVehicle()){
                    SecondActivity.PS19.park(vehicle);
                }else if(!SecondActivity.PS20.hasVehicle()){
                    SecondActivity.PS20.park(vehicle);
                }else if(!SecondActivity.PS21.hasVehicle()){
                    SecondActivity.PS21.park(vehicle);
                }else if(!SecondActivity.PS22.hasVehicle()){
                    SecondActivity.PS22.park(vehicle);
                }else if(!SecondActivity.PS23.hasVehicle()){
                    SecondActivity.PS23.park(vehicle);
                }else if(!SecondActivity.PS24.hasVehicle()){
                    SecondActivity.PS24.park(vehicle);
                }else if(!SecondActivity.PS25.hasVehicle()){
                    SecondActivity.PS25.park(vehicle);
                }else if(!SecondActivity.PS26.hasVehicle()){
                    SecondActivity.PS26.park(vehicle);
                }
                finish();
            }
        });
        carRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                truckRB.setChecked(false);
                motorRB.setChecked(false);
            }
        });
        truckRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carRB.setChecked(false);
                motorRB.setChecked(false);
            }
        });
        motorRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carRB.setChecked(false);
                truckRB.setChecked(false);
            }
        });
        hourlyRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                earlyBirdRB.setChecked(false);
            }
        });
        earlyBirdRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hourlyRB.setChecked(false);
            }
        });

        goBack = (Button)findViewById(R.id.backToGarageBtn);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
