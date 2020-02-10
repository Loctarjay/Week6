package com.example.testworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity implements View.OnClickListener {

    private Button frontPage, services, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        frontPage = findViewById(R.id.FrontPage);
        frontPage.setOnClickListener(this);
        services = findViewById(R.id.Services);
        services.setOnClickListener(this);
        contact = findViewById(R.id.Contact);
        contact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.FrontPage:
                Intent frontPage = new Intent(this, MainActivity.class);
                startActivity(frontPage);
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
