package com.afifhalim.halimafifhusfi_1202151234_modul3;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;



public class SplashScreen extends AppCompatActivity {

    private int SplashInterval = 3000; // kecepatan perpindahan 3 detik

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_screen);

//      Menghinlangkan head atau navigasi pada SplashScreen Activity

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,

                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {

                //berpindah dari splashscreen ke menulist utama

                startActivity(new Intent(SplashScreen.this, MainActivity.class));

                //menampilkan toast

                Toast.makeText(SplashScreen.this, "Selamat Datang", Toast.LENGTH_SHORT).show();

                finish();

            }

        },SplashInterval);

    }

}
