package com.mcabezas.appreservahotelv3.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.mcabezas.appreservahotelv3.entidades.TipoHabitacion;
import com.mcabezas.appreservahotelv3.util.BaseDatos;

import java.util.ArrayList;
import java.util.List;

public class DAOTipoHabitacion {
    BaseDatos base;
    SQLiteDatabase db;
    Context context;
    public DAOTipoHabitacion(Context context){
        base=new BaseDatos(context);
        this.context=context;
    }

    public void abrirBD(){
        db=base.getWritableDatabase();
    }

    public List<TipoHabitacion> obtenerTipoHabitacion(){
        List<TipoHabitacion> listaTipoHabitacion = new ArrayList<>();
        try{
            Cursor c = db.rawQuery("SELECT * FROM tipoHabitacion",null);
            while (c.moveToNext()){
                listaTipoHabitacion.add(new TipoHabitacion(c.getInt(0),c.getString(1)));
            }
        }
        catch (Exception e){
            Log.d("==>",e.getMessage());
        }
        return  listaTipoHabitacion;
    }
}
