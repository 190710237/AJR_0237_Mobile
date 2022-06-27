package com.amadeusryanwijayasetiawan.ajr_0237;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class ManagerActivity extends AppCompatActivity {

    private TextInputLayout etBulan, etTahun;
    private MaterialButton btnLaporanTransaksi, btnLaporanCustomer, btnLaporanDriver, btnLaporanPerforma, btnLaporanMobil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        etBulan = findViewById(R.id.etBulan);
        etTahun = findViewById(R.id.etTahun);

        btnLaporanTransaksi = findViewById(R.id.btnLaporanTransaksi);
        btnLaporanCustomer = findViewById(R.id.btnLaporanCustomer);
        btnLaporanDriver = findViewById(R.id.btnLaporanDriver);
        btnLaporanPerforma = findViewById(R.id.btnLaporanPerforma);
        btnLaporanMobil = findViewById(R.id.btnLaporanMobil);

        //TODO : recheck IP address
        btnLaporanTransaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tahun = etTahun.getEditText().getText().toString().trim();
                String bulan = etBulan.getEditText().getText().toString().trim();
                if(tahun.equals("")||bulan.equals("")){
                    Toast.makeText(ManagerActivity.this, "Masukkan tahun dan bulan!", Toast.LENGTH_SHORT).show();
                } else{
                    Uri uri = Uri.parse("http://192.168.223.100:8081/ajr_0237/public/api/transaksis/laporan/" + tahun + '/' + bulan);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }

            }
        });

        btnLaporanCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tahun = etTahun.getEditText().getText().toString().trim();
                String bulan = etBulan.getEditText().getText().toString().trim();

                if(tahun.equals("")||bulan.equals("")){
                    Toast.makeText(ManagerActivity.this, "Masukkan tahun dan bulan!", Toast.LENGTH_SHORT).show();
                } else{
                    Uri uri = Uri.parse("http://192.168.223.100:8081/ajr_0237/public/api/transaksis/laporan-customer/" + tahun + '/' + bulan);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }

            }
        });

        btnLaporanDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tahun = etTahun.getEditText().getText().toString().trim();
                String bulan = etBulan.getEditText().getText().toString().trim();

                if(tahun.equals("")||bulan.equals("")){
                    Toast.makeText(ManagerActivity.this, "Masukkan tahun dan bulan!", Toast.LENGTH_SHORT).show();
                } else{
                    Uri uri = Uri.parse("http://192.168.223.100:8081/ajr_0237/public/api/transaksis/laporan-driver/" + tahun + '/' + bulan);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }

            }
        });

        btnLaporanPerforma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tahun = etTahun.getEditText().getText().toString().trim();
                String bulan = etBulan.getEditText().getText().toString().trim();

                if(tahun.equals("")||bulan.equals("")){
                    Toast.makeText(ManagerActivity.this, "Masukkan tahun dan bulan!", Toast.LENGTH_SHORT).show();
                } else{
                    Uri uri = Uri.parse("http://192.168.223.100:8081/ajr_0237/public/api/transaksis/laporan-performa/" + tahun + '/' + bulan);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }

            }
        });

        btnLaporanMobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tahun = etTahun.getEditText().getText().toString().trim();
                String bulan = etBulan.getEditText().getText().toString().trim();

                if(tahun.equals("")||bulan.equals("")){
                    Toast.makeText(ManagerActivity.this, "Masukkan tahun dan bulan!", Toast.LENGTH_SHORT).show();
                } else{
                    Uri uri = Uri.parse("http://192.168.223.100:8081/ajr_0237/public/api/transaksis/laporan-mobil/" + tahun + '/' + bulan);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            }
        });
    }
}