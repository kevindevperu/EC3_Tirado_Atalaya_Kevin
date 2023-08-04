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

    private List<Platillo> platillo;

    public RVResumeAdapter(List<Platillo> platillo){
        this.platillo = platillo;
    }

    @NonNull
    @Override
    public ResumeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPlatilloResumeBinding binding = ItemPlatilloResumeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ResumeVH(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ResumeVH holder, int position) {
        holder.bind(platillo.get(position));
    }

    @Override
    public int getItemCount() {

        return platillo.size();
    }

    class ResumeVH extends RecyclerView.ViewHolder{
        private ItemPlatilloResumeBinding binding;

        public ResumeVH(ItemPlatilloResumeBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Platillo platillo) {
            binding.txtName.setText(platillo.getName());

            if (platillo instanceof Postre && !isEmpty(((Postre) platillo).getDescripcion())) {
                binding.txtDescripcion.setVisibility(View.VISIBLE);
                binding.txtDescripcion.setText(((Postre) platillo).getDescripcion());
            } else if (platillo instanceof PlatoPrincipal && !isEmpty(((PlatoPrincipal) platillo).getDescripcion())) {
                binding.txtDescripcion.setVisibility(View.VISIBLE);
                binding.txtDescripcion.setText(((PlatoPrincipal) platillo).getDescripcion());
            } else {
                binding.txtDescripcion.setVisibility(View.GONE);
            }

            ImageLoader imageLoader = Coil.imageLoader(binding.getRoot().getContext());
            ImageRequest request = new ImageRequest.Builder(binding.getRoot().getContext())
                    .data(platillo.getImgUrl())
                    .crossfade(true)
                    .target(binding.imgPlatillo)
                    .build();
            imageLoader.enqueue(request);
        }

        private boolean isEmpty(String str) {
            return str == null || str.trim().isEmpty();
        }
    }
}