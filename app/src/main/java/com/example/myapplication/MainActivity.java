package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationg.AnimalAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnimal;
    private ArrayList<String> animallist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rvAnimal = findViewById(R.id.rv_animal);
        loadData();

        AnimalAdapter adapter = new AnimalAdapter(animallist);
        rvAnimal.setAdapter(adapter);

    }


    private void loadData() {
        animallist.add("Сабака");
        animallist.add("Банда");
        animallist.add("кошка");
        animallist.add("Хомяк");
        animallist.add("Лиса");
        animallist.add("Белки");
        animallist.add("Ёжек");
        animallist.add("Лев");
        animallist.add("Орёл");
        animallist.add("Тигр");
        animallist.add("Медведь");
        animallist.add("курится");
        animallist.add("Лягушка");
        animallist.add("Ястриб");
        animallist.add("Сурок");
        animallist.add("Гибард");
    }
}