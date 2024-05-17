package com.geeks.lesson3_month3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> flowersList = new ArrayList<>();
    private RecyclerView rvFlowers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvFlowers = findViewById(R.id.rv_flowers);
        flowersList.add("Пионы");
        flowersList.add("Розы");
        flowersList.add("Ранункулюсы");
        flowersList.add("Тюльпаны");
        flowersList.add("Нарциссы");
        flowersList.add("Гортензии");
        flowersList.add("Лилии");
        flowersList.add("Эустомы");
        flowersList.add("Гипсофилы");
        flowersList.add("Ромашки");
        flowersList.add("Гвоздики");
        flowersList.add("Герберы");

        FlowersAdapter adapter = new FlowersAdapter(flowersList);
        rvFlowers.setAdapter(adapter);
    }
}