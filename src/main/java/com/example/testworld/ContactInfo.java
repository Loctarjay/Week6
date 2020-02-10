package com.example.testworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ContactInfo extends AppCompatActivity implements View.OnClickListener  {

    private Button frontPage, services, aboutUs;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        frontPage = findViewById(R.id.FrontPage);
        frontPage.setOnClickListener(this);
        aboutUs = findViewById(R.id.AboutUs);
        aboutUs.setOnClickListener(this);
        services = findViewById(R.id.Services);
        services.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.FrontPage:
                Intent frontPage = new Intent(this, MainActivity.class);
                startActivity(frontPage);
                break;
            case R.id.AboutUs:
                Intent contact = new Intent(this, AboutUs.class);
                startActivity(contact);
                break;
            case R.id.Services:
                Intent services = new Intent(this, OurServices.class);
                startActivity(services);
                break;
        }
    }
}
