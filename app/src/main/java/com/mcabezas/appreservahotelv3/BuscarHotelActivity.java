package com.mcabezas.appreservahotelv3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.mcabezas.appreservahotelv3.DAO.DAOTipoHabitacion;
import com.mcabezas.appreservahotelv3.entidades.TipoHabitacion;

import java.util.ArrayList;
import java.util.List;

public class BuscarHotelActivity extends AppCompatActivity {
    /*Spinner spTipoHabitacion;
    DAOTipoHabitacion daoTipoHabitacion= new DAOTipoHabitacion(this);
    List<TipoHabitacion> listaTipoHabitaciones=new ArrayList<>();*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Fragment fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);*/
        /*assignarReferencias();*/
    }
    /*private void assignarReferencias(){
        spTipoHabitacion=findViewById(R.id.spTipoHabitacion);
    }
    private void cargarTipoHabitaciones(){
        daoTipoHabitacion.abrirBD();
        daoTipoHabitacion.obtenerTipoHabitacion();
        ArrayAdapter<TipoHabitacion>adaptador= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,listaTipoHabitaciones);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTipoHabitacion.setAdapter(adaptador);
    }*/
}
