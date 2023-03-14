package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.parcial1.db.DbAmigos;
import com.example.parcial1.entidades.Amigos;

import java.util.ArrayList;

public class Registros extends AppCompatActivity {

    RecyclerView listaAmigos;
    ArrayList<Amigos> listaArrayAmigos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaAmigos = findViewById(R.id.listaAmigos);

        listaAmigos.setLayoutManager(new LinearLayoutManager(this));
        DbAmigos dbAmigos = new DbAmigos(NuevoActivity.this);

        listaArrayAmigos = new ArrayList<>();



    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menuNuevo:
                nuevoRegistro();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void nuevoRegistro(){
        Intent intent = new Intent(this,NuevoActivity.class);
        startActivity(intent);
    }
}