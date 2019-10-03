package com.example.szamologep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int szam1;
    private int szam2;
    private int eredmeny;
    Button gomb1,gomb2,gomb3,gomb4,gomb5,gomb6,gomb7,gomb8,gomb9,gombC,gomb0,gombEgyenlo,gombPlussz,gombMinusz,gombSzor;
    TextView txtKiir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
}
