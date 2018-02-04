package com.example.asus.rahmadinaarifazhari_1202154341_modul1;

import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilMainActivity extends AppCompatActivity {
    private TextView a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_main);

        a=(TextView) findViewById(R.id.textMenu);
        b=(TextView) findViewById(R.id.textPorsi);
        c=(TextView) findViewById(R.id.textHarga);
        d=(TextView) findViewById(R.id.restoran);

        Intent pil1 = getIntent();

        String liatMenu = pil1.getStringExtra("menu");
        String liatPorsi = pil1.getStringExtra("jumlah");
        String liatHarga= pil1.getStringExtra("total");
        String liatRestoran = pil1.getStringExtra("restoran");

        a.setText(liatMenu);
        b.setText(liatPorsi);
        c.setText(liatHarga);
        d.setText(liatRestoran);


    }
}
