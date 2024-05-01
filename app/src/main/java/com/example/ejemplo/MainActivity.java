package com.example.ejemplo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;


import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String tag = "Mi Ejemplo";
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //---Navegador---
        b1 =findViewById(R.id.btn_webBrowser);
        b1.setOnClickListener(new View.OnClickListener(){
        public void onClick(View arg0){
                Intent i = new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("http://www.amazon.com"));
                startActivity(i);
            }
        });
        //---Hacer Llamadas----
        b2 =findViewById(R.id.btn_makecalls);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                        Uri.parse("tel: 1234567"));
                startActivity(i);
            }
        });
        //Abrir Actividad
        b3 =findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){lanzarAcercaDe();}
        });
    }
    public void lanzarAcercaDe(){
        //Una forma sin modificar manifest
        Intent i = new Intent(this,AcercaDe.class);
        startActivity(i);
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(tag, "En el evento onStart");
        CharSequence texto = "En el evento onStart";
        int dur = Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(this,texto,dur);
        toast.show();
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(tag, "En el evento onStart");
        CharSequence texto = "En el evento onRestart";
        int dur = Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(this,texto,dur);
        toast.show();
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(tag, "En el evento onPause");
        CharSequence texto = "En el evento onPause";
        int dur = Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(this,texto,dur);
        toast.show();
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(tag, "En el evento onStop");
        CharSequence texto = "En el evento onStop";
        int dur = Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(this,texto,dur);
        toast.show();
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(tag, "En el evento onResume");
        CharSequence texto = "En el evento onResume";
        int dur = Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(this,texto,dur);
        toast.show();
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(tag, "En el evento onDestroy");
        CharSequence texto = "En el evento onDestroy";
        int dur = Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(this,texto,dur);
        toast.show();
    }
}