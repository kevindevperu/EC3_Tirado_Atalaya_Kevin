package com.kevin.evaluacioncontinua03.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kevin.evaluacioncontinua03.databinding.ItemPlatilloResumeBinding;
import com.kevin.evaluacioncontinua03.model.Platillo;
import com.kevin.evaluacioncontinua03.model.PlatoPrincipal;
import com.kevin.evaluacioncontinua03.model.Postre;
import com.kevin.evaluacioncontinua03.R;
import java.util.List;

import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;

public class RVResumeAdapter extends RecyclerView.Adapter<RVResumeAdapter.ResumeVH> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvresume_adapter);
    }
}