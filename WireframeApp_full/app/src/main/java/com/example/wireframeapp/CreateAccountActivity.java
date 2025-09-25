package com.example.wireframeapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {
    EditText etFullName, etEmailCreate, etPassCreate, etPassConfirm;
    Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        etFullName = findViewById(R.id.etFullName);
        etEmailCreate = findViewById(R.id.etEmailCreate);
        etPassCreate = findViewById(R.id.etPassCreate);
        etPassConfirm = findViewById(R.id.etPassConfirm);
        btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(v -> {
            String name = etFullName.getText().toString().trim();
            String email = etEmailCreate.getText().toString().trim();
            String p1 = etPassCreate.getText().toString();
            String p2 = etPassConfirm.getText().toString();

            if(name.isEmpty() || email.isEmpty() || p1.isEmpty()){
                Toast.makeText(this,"Fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }
            if(!p1.equals(p2)){
                Toast.makeText(this,"Passwords do not match", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this,"Account created (demo)", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
