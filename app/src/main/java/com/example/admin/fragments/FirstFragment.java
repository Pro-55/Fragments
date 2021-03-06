package com.example.admin.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("lifecycle","onCreateView 1 invoked");
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("lifecycle","onViewCreated 1 invoked");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("lifecycle","onAttach 1 invoked");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart 1 invoked");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume 1 invoked");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause 1 invoked");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop 1 invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("lifecycle","onDestroyView 1 invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy 1 invoked");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("lifecycle","onDetach 1 invoked");
    }
}
