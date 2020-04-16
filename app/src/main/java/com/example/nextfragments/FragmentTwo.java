package com.example.nextfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentTwo extends Fragment {

    FragmentTwo frOne;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two, container,false);
        //
        // Attach click event
        button = v.findViewById(R.id.btn_two);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBackToFragOne();
            }
        });
        //
        return v;
    }

    private void goBackToFragOne(){
        frOne = new FragmentTwo();
        getActivity().setTitle("Fragment Two");
        getActivity().getSupportFragmentManager().popBackStack();
    }

}
