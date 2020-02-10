package com.example.testworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OurServices extends AppCompatActivity implements View.OnClickListener  {

    private Button frontPage, aboutUs, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service);

        frontPage = findViewById(R.id.FrontPage);
        frontPage.setOnClickListener(this);
        aboutUs = findViewById(R.id.AboutUs);
        aboutUs.setOnClickListener(this);
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
            case R.id.AboutUs:
                Intent services = new Intent(this, AboutUs.class);
                startActivity(services);
                break;
            case R.id.Contact:
                Intent contact = new Intent(this, ContactInfo.class);
                startActivity(contact);
                break;
        }
    }
}
