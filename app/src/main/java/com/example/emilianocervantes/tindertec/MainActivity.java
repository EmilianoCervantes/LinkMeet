package com.example.emilianocervantes.tindertec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText correo, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo = (EditText)findViewById(R.id.userEmail);
        contrasena = (EditText)findViewById(R.id.userPassword);
    }

    public void iniciarSesion(View view){

    }

    public void irRegistrarse(View view){
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
        finish();
    }
}
