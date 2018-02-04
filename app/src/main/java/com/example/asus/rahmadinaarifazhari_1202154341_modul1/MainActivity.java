package com.example.asus.rahmadinaarifazhari_1202154341_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText a, b ;
    private Button x, y;
    private int hasil, total;
    private int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=(EditText) findViewById(R.id.textPil);
        b=(EditText) findViewById(R.id.textJum);

        x=(Button) findViewById(R.id.button1);
        y=(Button) findViewById(R.id.button2);

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String menu=a.getText().toString();
                String jumlah=b.getText().toString();
                hasil= Integer.parseInt(jumlah);
                total=hasil*50000;

                Intent hal2= new Intent(MainActivity.this,HasilMainActivity.class);
                hal2.putExtra("menu",menu);
                hal2.putExtra("jumlah",jumlah);
                hal2.putExtra("total",String.valueOf(total));
                hal2.putExtra("restoran","Eatbus");

                startActivity(hal2);

                if (total > uang){
                    Toast.makeText(MainActivity.this,"Jangan makan disini uang kamu tidak cukup",Toast.LENGTH_LONG).show();
                }
            }
        });

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String menu=a.getText().toString();
                String jumlah=b.getText().toString();
                hasil= Integer.parseInt(jumlah);
                total=hasil*50000;

                Intent hal2= new Intent(MainActivity.this,HasilMainActivity.class);
                hal2.putExtra("menu",menu);
                hal2.putExtra("jumlah",jumlah);
                hal2.putExtra("total",String.valueOf(total));
                hal2.putExtra("restoran","Abnormal");

                startActivity(hal2);
                if (total < uang){
                    Toast.makeText(MainActivity.this,"Kamu makan disnis saja",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
