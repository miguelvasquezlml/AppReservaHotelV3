package com.mcabezas.appreservahotelv3.entidades;

import androidx.annotation.NonNull;

public class TipoHabitacion {
    private int tipHab_id;
    private String tipHab_habitacion;

    public TipoHabitacion(int tipHab_id, String tipHab_habitacion) {
        this.tipHab_id = tipHab_id;
        this.tipHab_habitacion = tipHab_habitacion;
    }

    public int getTipHab_id() {
        return tipHab_id;
    }

    public void setTipHab_id(int tipHab_id) {
        this.tipHab_id = tipHab_id;
    }

    public String getTipHab_habitacion() {
        return tipHab_habitacion;
    }

    public void setTipHab_habitacion(String tipHab_habitacion) {
        this.tipHab_habitacion = tipHab_habitacion;
    }

    @NonNull
    @Override
    public String toString() {
        return null;
    }
}
