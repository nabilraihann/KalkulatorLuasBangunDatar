package com.example.kalkulatorluasbangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPersegi;
    private Button btnPersegiPanjang;
    private Button btnSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnPersegi = (Button) findViewById(R.id.btn_persegi);
        btnPersegi.setOnClickListener(this);

        btnPersegiPanjang = (Button) findViewById(R.id.btn_persegi_panjang);
        btnPersegiPanjang.setOnClickListener(this);

        btnSegitiga = (Button) findViewById(R.id.btn_segitiga);
        btnSegitiga.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_persegi:
                Intent gantiSlide = new Intent(MenuActivity.this, PersegiActivity.class);
                startActivity(gantiSlide);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_persegi_panjang:
                Intent gantiSlide = new Intent(MenuActivity.this, PersegiActivity.class);

                startActivity((gantiSlide));

                break;
        }
    }
}
