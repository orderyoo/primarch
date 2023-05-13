package com.example.primarchinfohtml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[][] primarchs = {
            {"Лев Эль'Джонсон", "Primarch1"},
            {"Неизвестен ¯\\_(ツ)_/¯", "Primarch2"},
            {"Фулгрим", "Primarch3"},
            {"Пертурабо", "Primarch4"},
            {"Джагатай Хан", "Primarch5"},
            {"Леман Русс", "Primarch6"},
            {"Рогал Дорн", "Primarch7"},
            {"Конрад Кёрз", "Primarch8"},
            {"Сангвиний", "Primarch9"},
            {"Феррус Манус", "Primarch10"},
            {"Неизвестен ¯\\_(ツ)_/¯", "Primarch11"},
            {"Ангрон", "Primarch12"},
            {"Робаут Жиллиман", "Primarch13"},
            {"Мортарион", "Primarch14"},
            {"Магнус Красный", "Primarch15"},
            {"Хорус Люпекаль", "Primarch16"},
            {"Лоргар Аврелиан", "Primarch17"},
            {"Вулкан", "Primarch18"},
            {"Корвус Коракс", "Primarch19"},
            {"Альфарий Омегон", "Primarch20"}
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView primarchList = findViewById(R.id.listPrimarch);

        int[] text_color = {255, 255, 255};
        int[] background_color = {50, 1, 25};

        PrimarchAdapter adapter = new PrimarchAdapter(this, android.R.layout.simple_expandable_list_item_1, primarchs, text_color, background_color);
        primarchList.setAdapter(adapter);

        primarchList.setOnItemLongClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this, NothingHere.class);
            startActivity(intent);
            return false;
        });

        primarchList.setOnItemClickListener((parent, v, position, id) -> {
            String[] selectedItem = (String[]) parent.getItemAtPosition(position);
            String description = selectedItem[1];
            Intent intent = new Intent(MainActivity.this, HtmlActivity.class);
            intent.putExtra("description", description);
            startActivity(intent);
        });
    }
}