package com.example.uygulamadeneme1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,TextView.OnEditorActionListener{
    TextView tv;
    TextView tvkarakteroz;
    int sayaç=0;
    Button bSaldır;
    Button bYemek;
    karakter k;
    EditText isim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.cevap);
        tvkarakteroz= (TextView) findViewById(R.id.bilmece);

        Button bUyu = (Button) findViewById(R.id.uyu);
        bYemek=(Button) findViewById(R.id.yemek);
        bSaldır=(Button) findViewById(R.id.saldır);

        bSaldır.setOnClickListener(this);
        bYemek.setOnClickListener(this);
        //instead of using this it can be implemented like down below
        bUyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(k.uyumak());
            }
        }

        );
        k = new karakter();
        k.hareketSayisi= 10;
        k.kilo=10;
        k.saldiricGucu=100;
        tvkarakteroz.setText(k.toString());
        tv.setText("oyuna hoş geldiniz, lütfen bir eylem seçin");

        isim=(EditText) findViewById(R.id.editTextText2);
        isim.setOnEditorActionListener(this);
    }

    @Override
    public boolean onEditorAction(TextView tv2, int x, KeyEvent ke){
        tv.setText("Karakterin ismi " + isim.getText() + " olarak atandı.");
        k.isim=(String)isim.getText().toString();
        isim.setVisibility(View.INVISIBLE);
        tvkarakteroz.setText(k.toString());
        tvkarakteroz.setVisibility(View.VISIBLE);
        return true;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==bSaldır.getId())
            tv.setText(k.savas());
        else if (v.getId()==bYemek.getId())
            tv.setText(k.yemek());
        tvkarakteroz.setText(k.toString());
    }

}