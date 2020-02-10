package com.example.testworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button aboutUs, services, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutUs = findViewById(R.id.AboutUs);
        aboutUs.setOnClickListener(this);
        services = findViewById(R.id.Services);
        services.setOnClickListener(this);
        contact = findViewById(R.id.Contact);
        contact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.AboutUs:
                Intent aboutUs = new Intent(this, AboutUs.class);
                startActivity(aboutUs);
                break;
            case R.id.Services:
                Intent services = new Intent(this, OurServices.class);
                startActivity(services);
                break;
            case R.id.Contact:
                Intent contact = new Intent(this, ContactInfo.class);
                startActivity(contact);
                break;
        }
    }
}
