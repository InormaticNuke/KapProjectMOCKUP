package com.example.testprojectone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = (EditText) findViewById(R.id.usertext);
        edtPass = (EditText) findViewById(R.id.passtext);
    }

    protected void onClickDataLog(View view){
        Intent intent = new Intent (this, selector.class);
        startActivity(intent);
    }

    public void Acceder(View view){
        String username = user.getText().toString().trim();
        String password = pass.getText().toString().trim();

        if(username.equals("")){
            Toast.makeText(this, "Ingrese el usuario", Toast.LENGTH_LONG).show();
            return;
        }
        if (password.equals("")){
            Toast.makeText(this, "Ingrese la contraseña ", Toast.LENGTH_LONG).show();
            return;
        }

        //Validacion de Credenciales
        if(username.equals("Admin") && password.equals("1234")){
            Intent intent = new Intent(this, selector.class);
            startActivity(intent);
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_LONG).show();
            return;
        }else{
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_LONG).show();
        }
    }
}