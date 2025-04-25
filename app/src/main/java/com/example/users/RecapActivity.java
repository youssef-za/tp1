package com.example.users;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recap);

        TextView recapTextView = findViewById(R.id.recapTextView);

        Intent intent = getIntent();
        String nomPrenom = intent.getStringExtra("nomPrenom");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        String adresse = intent.getStringExtra("adresse");
        String ville = intent.getStringExtra("ville");

        String recap = "Nom : " + nomPrenom + "\n" +
                "Email : " + email + "\n" +
                "Phone : " + phone + "\n" +
                "Adresse : " + adresse + "\n" +
                "Ville : " + ville;

        recapTextView.setText(recap);
    }
}
