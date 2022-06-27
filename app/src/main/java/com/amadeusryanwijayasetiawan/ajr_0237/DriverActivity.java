package com.amadeusryanwijayasetiawan.ajr_0237;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class DriverActivity extends AppCompatActivity {
    private String nama="Glen Setiawan",email="glens@gmail.com";
    private TextInputLayout etNama, etEmail;
    private MaterialButton btnUpdate;
    private String status="Tidak Tersedia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        etNama = findViewById(R.id.etNama);
        etEmail = findViewById(R.id.etEmail);

        etNama.getEditText().setText(nama);

        etEmail.getEditText().setText(email);

        btnUpdate = findViewById(R.id.btnUpdate);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = etNama.getEditText().getText().toString();
                email = etEmail.getEditText().getText().toString();
                Toast.makeText(DriverActivity.this, "Berhasil Update data", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onRadioButtonClicked(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_available:
                if (checked)
                    status = "Tersedia";
                    break;
            case R.id.radio_unavailable:
                if (checked)
                    status = "Tidak Tersedia";
                    break;
        }
    }
}