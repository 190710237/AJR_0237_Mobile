package com.amadeusryanwijayasetiawan.ajr_0237;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.amadeusryanwijayasetiawan.ajr_0237.model.Promo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;


public class CustProfileFragment extends Fragment {

    private String nama="Levina Chrisa",email="levina@gmail.com", noHP="0817465807";
    private TextInputLayout etNama, etEmail, etNomorHP;
    private MaterialButton btnUpdate;


    public CustProfileFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cust_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
        etNama = view.findViewById(R.id.etNama);
        etEmail = view.findViewById(R.id.etEmail);
        etNomorHP = view.findViewById(R.id.etNomorHP);
        btnUpdate = view.findViewById(R.id.btnUpdate);

        etNama.getEditText().setText(nama);
        etEmail.getEditText().setText(email);
        etNomorHP.getEditText().setText(noHP);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = etNama.getEditText().getText().toString();
                email = etEmail.getEditText().getText().toString();
                noHP = etNomorHP.getEditText().getText().toString();
                Toast.makeText(getActivity().getApplicationContext(), "Berhasil Update data", Toast.LENGTH_SHORT).show();
            }
        });
    }
}