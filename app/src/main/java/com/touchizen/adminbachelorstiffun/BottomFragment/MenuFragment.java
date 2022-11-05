package com.touchizen.adminbachelorstiffun.BottomFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.touchizen.adminbachelorstiffun.AllMenuActivity.AddMenuActivity;
import com.touchizen.adminbachelorstiffun.AllMenuActivity.SetTodaysMenuActivity;
import com.touchizen.adminbachelorstiffun.AllMenuActivity.ShowAllMenuActivity;
import com.touchizen.adminbachelorstiffun.AllMenuFragment.AddMenuFragment;
import com.touchizen.adminbachelorstiffun.AllMenuFragment.SetTodaysMenuFragment;
import com.touchizen.adminbachelorstiffun.AllMenuFragment.ShowAllMenuFragment;
import com.touchizen.adminbachelorstiffun.R;

public class MenuFragment extends Fragment  implements BottomNavigationView.OnNavigationItemSelectedListener  {

    //private CardView setTodaysMenu,addMenu,showAllMenu;
    private BottomNavigationView bottomNavigationView;


    public MenuFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_menu, container, false);

        bottomNavigationView = view.findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.top_set_menu);


//        setTodaysMenu = view.findViewById(R.id.setTodaysMenu);
//        addMenu = view.findViewById(R.id.addMenu);
//        showAllMenu = view.findViewById(R.id.showAllMenu);
//
//        setTodaysMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent intent= new Intent(view.getContext(), SetTodaysMenuActivity.class);
////                view.getContext().startActivity(intent);
//                startActivity(new Intent(getActivity(), SetTodaysMenuActivity.class));
//            }
//        });
//
//        addMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getActivity(), AddMenuActivity.class));
//            }
//        });
//
//        showAllMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getActivity(), ShowAllMenuActivity.class));
//            }
//        });

        return view;

    }

    AddMenuFragment addMenuFragment = new AddMenuFragment();
    SetTodaysMenuFragment setTodaysMenuFragment = new SetTodaysMenuFragment();
    ShowAllMenuFragment showAllMenuFragment = new ShowAllMenuFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.top_set_menu:
                getParentFragmentManager().beginTransaction().replace(R.id.flFragment, setTodaysMenuFragment).commit();
                return true;

            case R.id.top_add_menu:
                getParentFragmentManager().beginTransaction().replace(R.id.flFragment, addMenuFragment).commit();
                return true;

            case R.id.top_show_menu:
                getParentFragmentManager().beginTransaction().replace(R.id.flFragment, showAllMenuFragment).commit();
                return true;
        }
        return false;
    }
}