package com.kevin.evaluacioncontinua03.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.kevin.evaluacioncontinua03.R;
import com.kevin.evaluacioncontinua03.databinding.FragmentHomeBinding;
import com.kevin.evaluacioncontinua03.model.Platillo;
import com.kevin.evaluacioncontinua03.model.PlatoPrincipal;
import com.kevin.evaluacioncontinua03.model.Postre;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        RVResumeAdapter adapter  = new RVResumeAdapter(getData());
        binding.rvPlatoResume.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        binding.rvPlatoResume.setLayoutManager(layoutManager);
    }

    private List<Platillo> getData(){
        List<Platillo> platillo = new ArrayList<>();
        platillo.add(new PlatoPrincipal("Lomo saltado", "https://buenazo.cronosmedia.glr.pe/original/2022/06/20/62aea00d119a8801813a563b.jpg", "Plato con Carne y Papas"));
        platillo.add(new PlatoPrincipal("Arroz con Pollo", "https://comeperuano.b-cdn.net/wp-content/uploads/2022/07/receta-de-arroz-con-pollo.jpg", "Viene con Papa a la Huancaina"));
        platillo.add(new PlatoPrincipal("Tallarin Rojo", "https://elcomercio.pe/resizer/c-a5HfyhpXUtirIx5R290y5Io98=/980x528/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/2XAQHTATIVBUVGNMF737X6SV4E.jpg", "Platon con Crema"));
        platillo.add(new Postre("Pudin", "https://images.hola.com/imagenes/cocina/recetas/20201107178784/pudin-de-vainilla-y-caramelo/0-886-694/pudin-adobe-t.jpg","Postres bien Dulce"));
        platillo.add(new Postre("Picarones", "https://www.peru.travel/Contenido/General/Imagen/es/301/1.1/picarones.jpg","Viene bañado en miel "));
        platillo.add(new Postre("Alfajores", "https://444d1936e2.cbaul-cdnwnd.com/70a187c99bf664e524fb9222753e090e/system_preview_detail_200000349-c5cefc6c56-public/alfajores-peruanos-de-el-alfajor.jpg","Viene con mermelada"));
        return platillo;
    }
}