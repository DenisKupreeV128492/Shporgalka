package com.example.fooltbalclubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Chelsey(View view) {
        Intent ЧелсиIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chelseafc.com/en"));
        startActivity(ЧелсиIntent);
    }

        public void RealMadrid(View view) {
            Intent РеалМадридIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.realmadrid.com/en"));
            startActivity(РеалМадридIntent);
    }
    public void CSKA(View view) {
        Intent ЦСКАIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pfc-cska.com/"));
        startActivity(ЦСКАIntent);
    }
    public void Barselona(View view) {
        Intent БарселонаIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fcbarcelona.com/"));
        startActivity(БарселонаIntent);
    }
    public void Spartak(View view) {
        Intent СпартакIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://spartak.com/"));
        startActivity(СпартакIntent);
    }
    public void PSG(View view) {
        Intent ПСЖIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://psg.fr/"));
        startActivity(ПСЖIntent);
    }
}