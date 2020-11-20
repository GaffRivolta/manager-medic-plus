package ar.com.example.managermedicplus.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import ar.com.example.managermedicplus.R;
import ar.com.example.managermedicplus.entidades.Medicamento;

public class AdaptadorMedicamento extends RecyclerView.Adapter<AdaptadorMedicamento.ViewHolderMedicamento> {

    Context miContexto;
    ArrayList<Medicamento> listaMedicamento;

    public AdaptadorMedicamento(Context miContexto, ArrayList<Medicamento> listaMedicamento) {
        this.miContexto = miContexto;
        this.listaMedicamento = listaMedicamento;
    }

    @NonNull
    @Override
    public ViewHolderMedicamento onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_medicamento,null,false);
        return new ViewHolderMedicamento(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMedicamento holder, int position) {
//        holder.asignarMedicamentos(listaMedicamento.get(position));

        Medicamento medicamento = listaMedicamento.get(position);
        Glide.with(miContexto)
                .load(medicamento.getFoto())
                .centerCrop()
                .into(holder.imagenMedicamento);

        holder.nombreMedicamento.setText(medicamento.getNombre());

    }

    @Override
    public int getItemCount() {
        return listaMedicamento.size();
    }

    public class ViewHolderMedicamento extends RecyclerView.ViewHolder {

        ImageView imagenMedicamento;
        TextView nombreMedicamento;

        public ViewHolderMedicamento(@NonNull View itemView) {
            super(itemView);

            imagenMedicamento = itemView.findViewById(R.id.imageViewItemMedicamento);
            nombreMedicamento = itemView.findViewById(R.id.textViewNombreItemMedicamento);
        }

//        public void asignarMedicamentos(Medicamento medicamento) {
//            //imagenMedicamento.setImageURI(medicamento.getFoto());
//
//            Glide.with(miContexto)
//                    .load(medicamento.getFoto())
//                    .into(holder.imageView);
//
//            nombreMedicamento.setText(medicamento.getNombre());
//        }
    }
}
