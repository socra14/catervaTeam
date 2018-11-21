package com.recycler.socra.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by socra on 13/06/2018.
 */

public class adaptador extends RecyclerView.Adapter<adaptador.ViewHolder> {

    private List<personas> personas;
    private int layout;
    private OnItemClickListener onItemClickListener;

    public adaptador(List<personas> personas,int layout, OnItemClickListener onItemClickListener){
        this.personas=personas;
        this.layout=layout;
        this.onItemClickListener= onItemClickListener;
    }

    @NonNull
    @Override
    public adaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        ViewHolder vh= new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull adaptador.ViewHolder holder, int position) {
     holder.bind(personas.get(position));

    }


    @Override
    public int getItemCount() {
        return personas.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView nombre;
        public ImageView foto;
        public TextView descripcion;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre= itemView.findViewById(R.id.nombre);
            foto = itemView.findViewById(R.id.foto);
            descripcion = itemView.findViewById(R.id.descripcion);

            nombre.setOnClickListener(this);
            foto.setOnClickListener(this);
            descripcion.setOnClickListener(this);

        }

        public void bind(personas personas){
            nombre.setText(personas.getNombre());


            foto.setImageResource(personas.getFotos());
            descripcion.setText(personas.getDescripcion());



        }


        @Override
        public void onClick(View view) {
            onItemClickListener.OnItemClic(itemView, getAdapterPosition());

        }


    }




    public interface OnItemClickListener {
        void OnItemClic(View view, int position );


    }
}
