package com.touchizen.adminbachelorstiffun.AllMenuFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.touchizen.adminbachelorstiffun.R;


public class SetTodaysMenuFragment extends Fragment {


    public SetTodaysMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_set_todays_menu, container, false);

//        Spinner spinnerMenu=view.findViewById(R.id.spinner_menu);
//
//        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(getContext(), R.array.setMenuDropDown, android.R.layout.simple_spinner_item);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
//
//        spinnerMenu.setAdapter(adapter);

        return view;
    }
}