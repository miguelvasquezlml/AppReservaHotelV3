package com.mcabezas.appreservahotelv3.ui.buscarhotel;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import com.mcabezas.appreservahotelv3.R;
import com.mcabezas.appreservahotelv3.databinding.FragmentBuscarHotelBinding;
import com.mcabezas.appreservahotelv3.ui.slideshow.ListarHotelesFragment;

public class BuscarHotelFragment extends Fragment {

    private FragmentBuscarHotelBinding binding;
    private EditText txtdDestino, txtFechaInicio, txtFechaFin;
    private Spinner spTipoHabitacion;
    private Button btnBuscarHotel;

    public BuscarHotelFragment() {
        // Required empty public constructor
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View buscarHotel = inflater.inflate(R.layout.fragment_buscar_hotel, container, false);

        txtdDestino = buscarHotel.findViewById(R.id.txtdDestino);
        txtFechaInicio = buscarHotel.findViewById(R.id.txtFechaInicio);
        txtFechaFin = buscarHotel.findViewById(R.id.txtFechaFin);
        spTipoHabitacion = buscarHotel.findViewById(R.id.spTipoHabitacion);

        btnBuscarHotel = buscarHotel.findViewById(R.id.btnBuscarHotel);
        btnBuscarHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                String destino = txtdDestino.getText().toString();
                String fechaInicio = txtFechaInicio.getText().toString();
                String fechaFin = txtFechaFin.getText().toString();
                String tipoHabitacion = spTipoHabitacion.getSelectedItem().toString();
                 */
                String destino = "destino de prueba";
                String fechaInicio = "fechaInicio de prueba";
                String fechaFin = "fechaFin de prueba";
                String tipoHabitacion = "tipoHabitacion de prueba";

                ListarHotelesFragment listarHotelesFragment = new ListarHotelesFragment();

                // Crear un Bundle para pasar los datos
                Bundle bundle = new Bundle();
                bundle.putString("destino", destino);
                bundle.putString("fechaInicio", fechaInicio);
                bundle.putString("fechaFin", fechaFin);
                bundle.putString("tipoHabitacion", tipoHabitacion);
                listarHotelesFragment.setArguments(bundle);

                Log.d("===>>>", String.valueOf(bundle));

                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, listarHotelesFragment); // Reemplaza el fragmento actual con el nuevo
                transaction.addToBackStack(null); // Añade la transacción a la pila para que el usuario pueda retroceder
                transaction.commit(); // Realiza la transacción

            }
        });

        return buscarHotel;
    }

       @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}