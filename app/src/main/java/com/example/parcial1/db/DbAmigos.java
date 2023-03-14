package com.example.parcial1.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbAmigos extends DbHelper{

    Context context;

    public DbAmigos(@Nullable Context context) {
        super(context);
        this.context = context;
    }
    public long insertarAmigos(String nombre, String apellido,String edad,String nacionalidad, String ubicacion){
        long id = 0;
        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();

            values.put("nombre", nombre);
            values.put("apellido", apellido);
            values.put("edad", edad);
            values.put("nacionalidad", nacionalidad);
            values.put("ubicacion", ubicacion);

            id = db.insert(TABLE_AMIGOS, null, values);
        }catch (Exception ex){
            ex.toString();
        }
        return id;
    }

}
