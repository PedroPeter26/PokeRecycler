package com.example.pokerecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pokerecycler.Adapter.PikachuAdapter;
import com.example.pokerecycler.Models.Chapete;
import com.example.pokerecycler.Models.Pikachu;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Pikachu> pikachus = new ArrayList<>();
            pikachus.add(new Pikachu(new Chapete("Naranja"), new Chapete("Rojo")));
            pikachus.add(new Pikachu(new Chapete("Rojo"), new Chapete("Rojo")));

            rc.findViewById(R.id.rc);
            rc.setAdapter(new PikachuAdapter(pikachus));
            rc.setLayoutManager(new LinearLayoutManager(this));
            rc.setHasFixedSize(true);
    }
}