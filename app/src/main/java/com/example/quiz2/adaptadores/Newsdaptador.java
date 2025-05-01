package com.example.quiz2.adaptadores;

import androidx.recyclerview.widget.RecyclerView;

import com.example.quiz2.R;
import com.example.quiz2.noticia.News;
import com.squareup.picasso.Picasso;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Newsdaptador extends RecyclerView.Adapter<Newsdaptador.ViewHolder> {
    private List<News> datos;
    public Newsdaptador(List<News> listNoticias) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public Newsdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Newsdaptador.ViewHolder holder, int position) {
        News dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() { return datos.size();}


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_news, txt_descripcion;
        ImageView img_news;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_news= itemView.findViewById(R.id.txt_news);
            txt_descripcion= itemView.findViewById(R.id.txt_descripcion);
            img_news= itemView.findViewById(R.id.img_news);
        }
        public void bind(News dato){
            txt_news.setText(dato.getNombre());
            txt_descripcion.setText(dato.getCurso());
            //libreria de imagen
            Picasso.get().load(dato.getImagen()).into(img_news);

        }
    }
}
