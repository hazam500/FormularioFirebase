package com.example.android.formulariofirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText edad;
    private EditText formaPago;
    private EditText latitud;
    private EditText longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText)findViewById(R.id.usuario);
        edad = (EditText)findViewById(R.id.edad);
        formaPago = (EditText)findViewById(R.id.formaPago);
        latitud = (EditText)findViewById(R.id.latitud);
        longitud = (EditText)findViewById(R.id.longitud);



    }

    public void enviarDatos(View view) {

        String usuarioDato = usuario.getText().toString();
        int edadDato = Integer.parseInt(edad.getText().toString());
        String formaPagoDato = formaPago.getText().toString();
        Double latitudDato = Double.parseDouble(latitud.getText().toString());
        Double longitudDato = Double.parseDouble(longitud.getText().toString());

        Usuario casoUsuario = new Usuario(usuarioDato, edadDato, formaPagoDato, latitudDato, longitudDato);

        Firebase.setAndroidContext(this);
        Firebase firebase = new Firebase("https://pruebacuestionario.firebaseio.com/");
        firebase.child("usuario").setValue(casoUsuario);



    }


}
