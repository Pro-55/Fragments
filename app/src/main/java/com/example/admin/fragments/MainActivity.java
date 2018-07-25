package com.example.admin.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fragmentOne, fragmentTwo, fragmentThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOne = findViewById(R.id.fragmentOne);
        fragmentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fManager = getSupportFragmentManager();
                FragmentTransaction fTransaction = fManager.beginTransaction();
                FirstFragment firstFragment = new FirstFragment();
                fTransaction.replace(R.id.fragmentContainer, firstFragment);
                fTransaction.addToBackStack(null);
                fTransaction.commit();
            }
        });

        fragmentTwo = findViewById(R.id.fragmentTwo);
        fragmentTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fManager = getSupportFragmentManager();
                FragmentTransaction fTransaction = fManager.beginTransaction();
                SecondFragment secondFragment = new SecondFragment();
                fTransaction.replace(R.id.fragmentContainer, secondFragment);
                fTransaction.addToBackStack(null);
                fTransaction.commit();
            }
        });

        fragmentThree = findViewById(R.id.fragmentThree);
        fragmentThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fManager = getSupportFragmentManager();
                FragmentTransaction fTransaction = fManager.beginTransaction();

                ThirdFragment thirdFragment = new ThirdFragment();
                fTransaction.replace(R.id.fragmentContainer, thirdFragment);
                fTransaction.addToBackStack(null);
                fTransaction.commit();
            }
        });
    }

}
