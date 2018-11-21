package com.recycler.socra.recycler;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {


    private List<personas> personas;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layout;
    private int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_micon_round);

        personas = this.GetAllpersonas();
        recyclerView = findViewById(R.id.recycler_view);
        layout = new LinearLayoutManager(this);

        adapter = new adaptador(personas, R.layout.recycler_view, new adaptador.OnItemClickListener() {
            @Override
            public void OnItemClic(View view, int position) {

                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this,juanatr.class);
                    startActivity(intent);

                }
                if (position==1){
                    Intent intent = new Intent(MainActivity.this,daniatr.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(MainActivity.this,agusatr.class);
                    startActivity(intent);
                }

                if (position==3){
                    Intent intent = new Intent(MainActivity.this,emilioatr.class);
                    startActivity(intent);
                }

                if (position==4){
                    Intent intent = new Intent(MainActivity.this,fabianatr.class);
                    startActivity(intent);
                }

                if (position==5){
                    Intent intent = new Intent(MainActivity.this,javiatr.class);
                    startActivity(intent);
                }

                if (position==6){
                    Intent intent = new Intent(MainActivity.this,kiliatr.class);
                    startActivity(intent);
                }

                if (position==7){
                    Intent intent = new Intent(MainActivity.this,manuatr.class);
                    startActivity(intent);
                }

                if (position==8){
                    Intent intent = new Intent(MainActivity.this,narroatr.class);
                    startActivity(intent);
                }

                if (position==9){
                    Intent intent = new Intent(MainActivity.this,rafaatr.class);
                    startActivity(intent);
                }

                if (position==10){
                    Intent intent = new Intent(MainActivity.this,zeusatr.class);
                    startActivity(intent);
                }

                if (position==11){
                    Intent intent = new Intent(MainActivity.this,emiliatrr.class);
                    startActivity(intent);
                }

                if (position==12){
                    Intent intent = new Intent(MainActivity.this,manoloatr.class);
                    startActivity(intent);
                }

                if (position==13){
                    Intent intent = new Intent(MainActivity.this,luisatr.class);
                    startActivity(intent);
                }

                if (position==14){
                    Intent intent = new Intent(MainActivity.this,rocioatr.class);
                    startActivity(intent);
                }


            }
        }) ;


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layout);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);



    }



    private List<personas> GetAllpersonas(){
        return new ArrayList<personas>(){{
            add(new personas(R.drawable.juan,"Juan Antonio","El Iniesta del equipo. Destaca por su pase en largo y por multar sin compasión"));
            add(new personas(R.drawable.dani,"Dani Cánovas","El único que sabe. Destaca por su seguridad defensiva y por llorar fuerte"));
            add(new personas(R.drawable.agus,"Agustín","El guerrero. Destaca por su lucha y por sus bailes desenfrenados"));
            add(new personas(R.drawable.emi,"Emilio B","El médico del equipo. Destaca por su saque de banda y por tomar la tensión"));
            add(new personas(R.drawable.fabian,"Fabián","El francotirador. Destaca por su disparo y por romperse con facilidad"));
            add(new personas(R.drawable.javi,"Javier","El todoterreno. Destaca por implicación y su remate de cabeza"));
            add(new personas(R.drawable.kili,"Kílian","El Guti del equipo. Destaca por su zurda y por rus recortes rompecaderas "));
            add(new personas(R.drawable.manuel,"Manuel","La veterania. Destaca por su colocación y por subir fotos de cervezas al Facebook"));
            add(new personas(R.drawable.narro, "José Narro","El turco del equipo, destaca por su disparo colocado y por beber cerveza en el chiringuito"));
            add(new personas(R.drawable.rafa,"Rafa","El canterano. Destaca por su técnica y por ser el mas quemado del equipo"));
            add(new personas(R.drawable.zeus,"Zeus","La incógnita. Destaca por su olfato goleador y por reponer champus"));
            add(new personas(R.drawable.emili,"Emilio C","El Buffón Badalona. Destaca por sus reflejos y estirada" ));
            add(new personas(R.drawable.manolo,"Manolo","La zurda de oro. Destaca por su competitividad y por sus tigres picantes"));
            add(new personas(R.drawable.luis, "Luis", "El colegiado. Destaca por no haber cogido un pito en su vida ni saberse las reglas"));
            add(new personas(R.drawable.rocio, "Rocio","La fisioterapeuta. Fichaje de ultima hora que destaca por sus masajes y por fingir penaltis"));

        }};
    }


    }







