package com.example.nextfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentOne frOne = new FragmentOne();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Replace with fragment one
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frag_h, frOne)
                .addToBackStack(null)
                .commit();
    }
}
