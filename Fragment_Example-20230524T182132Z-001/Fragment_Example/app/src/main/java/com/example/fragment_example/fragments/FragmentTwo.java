package com.example.fragment_example.fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fragment_example.R;

import java.util.zip.Inflater;

public class FragmentTwo extends Fragment {
    TextView resultText;
    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        resultText = view.findViewById(R.id.resultText);
        return view;
    }

    public void updateTextField(String newText){
        resultText.setText("Hello " +newText);
    }

}