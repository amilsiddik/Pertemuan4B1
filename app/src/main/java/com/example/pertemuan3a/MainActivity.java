package com.example.pertemuan3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        EditText editText = (EditText) findViewById(R.id.coba_isi);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        //Intent intent = new Intent();
        //intent.setAction(Intent.ACTION_SEND);
        //EditText editText = (EditText) findViewById(R.id.coba_isi);
        //String message = editText.getText().toString();
        //intent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(intent);
    }

}