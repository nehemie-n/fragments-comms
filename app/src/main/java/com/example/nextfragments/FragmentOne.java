package com.example.nextfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    FragmentTwo frTwo;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one, container, false);
        //
        // Attach click event
        button = v.findViewById(R.id.btn_one);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFragTwo();
            }
        });
        //
        return v;
    }


    public void goToFragTwo(){
        // Replace with fragment one
        frTwo = new FragmentTwo();
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.frag_h, frTwo)
                .addToBackStack(null)
                .commit();
        getActivity().setTitle("Fragment One");
    }
}
