package com.vsga.nameviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edName;
    private TextView showName;
    private Button showBtn;
    private String getName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.etName);
        showName = findViewById(R.id.txtName);
        showBtn = findViewById(R.id.btnShow);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getName = edName.getText().toString();

                if (getName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Masukan nama Anda terlebih dahulu.", Toast.LENGTH_SHORT).show();
                }else{
                showName.setText("Nama Anda: " + getName);
                }
            }
        });

    }
}