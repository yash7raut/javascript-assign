package com.example.fragment_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.fragment_example.fragments.FragmentOne;
import com.example.fragment_example.fragments.FragmentTwo;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onFragmentInteraction(String userContent) {
        FragmentTwo fragmentTwo =
                (FragmentTwo)
                        getSupportFragmentManager().findFragmentById(R.id.fragment2);
        fragmentTwo.updateTextField(userContent);
    }
}