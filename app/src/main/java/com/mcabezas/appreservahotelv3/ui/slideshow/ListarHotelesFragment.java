package com.mcabezas.appreservahotelv3.ui.slideshow;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mcabezas.appreservahotelv3.R;
import com.mcabezas.appreservahotelv3.databinding.FragmentListarHotelesBinding;

public class ListarHotelesFragment extends Fragment {

    private FragmentListarHotelesBinding binding;

    public ListarHotelesFragment() {
        // Required empty public constructor
    }

   public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

       // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_listar_hoteles, container, false);

       // Get the arguments
       Bundle bundle = getArguments();

       if (bundle != null) {
           String destino = bundle.getString("destino");
           String fechaInicio = bundle.getString("fechaInicio");
           String fechaFin = bundle.getString("fechaFin");
           String tipoHabitacion = bundle.getString("tipoHabitacion");

       }

       return view;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}