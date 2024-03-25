package com.example.deposerannonce;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AffichageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);

        // Récupérer les données saisies dans le formulaire
        String category = getIntent().getStringExtra("category");
        String sector = getIntent().getStringExtra("sector");
        String city = getIntent().getStringExtra("city");

        // Afficher les données dans les TextViews de l'activité AffichageActivity
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView categoryTextView = findViewById(R.id.textViewCategory);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView sectorTextView = findViewById(R.id.textViewSector);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView cityTextView = findViewById(R.id.textViewCity);

        categoryTextView.setText("Category: " + category);
        sectorTextView.setText("Sector: " + sector);
        cityTextView.setText("City: " + city);
    }
}
