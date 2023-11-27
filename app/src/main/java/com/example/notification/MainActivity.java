package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final int notifikasi = 1;
    public String chID = "ch_id";
    public String chName = "notif";
    Button btnNotifikasi;
    EditText etJudul, etPesan;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotifikasi = findViewById(R.id.btnNotifikasi);
        etJudul = findViewById(R.id.etJudul);
        etPesan = findViewById(R.id.etPesan);

        btnNotifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(), MainActivity.class);
                tampilNotifikasi(etJudul.getText().toString(),etPesan.getText().toString(), I);
            }
        });
    }

    private void tampilNotifikasi(String toString, String toString1, Intent i) {
        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, notifikasi, I, PendingIntent.FLAG_UPDATE_CURRENT);
    }
}