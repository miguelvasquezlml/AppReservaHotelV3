package com.mcabezas.appreservahotelv3.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos  extends SQLiteOpenHelper {
    public BaseDatos(Context context){
        super(context,"hoteles.db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String query="CREATE TABLE tipoHabitacion("+
                "tipHab_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "tipHab_habitacion TEXT NOT NULL)";
        db.execSQL(query);

        query ="INSERT INTO tipoHabitacion VALUES(NULL,'Suit');";
        db.execSQL(query);
        query ="INSERT INTO tipoHabitacion VALUES(NULL,'Matrimonial');";
        db.execSQL(query);
        query ="INSERT INTO tipoHabitacion VALUES(NULL,'Personal');";
        db.execSQL(query);
        query ="INSERT INTO tipoHabitacion VALUES(NULL,'Doble');";
        db.execSQL(query);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
