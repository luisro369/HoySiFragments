package com.luisro00005513.hoysifragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentAccounts extends AppCompatActivity {
    List<Account> accountList;
    RecyclerView recyclerView;
    AccountAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_accounts);

        accountList= fillList();

        recyclerView= findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        adapter = new AccountAdapter(this , accountList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }



    private ArrayList<Account> fillList(){

        ArrayList<Account>l = new ArrayList<>();
        l.add(new Account(1,"Cuenta 1"));
        l.add(new Account(2,"Cuenta 2"));
        l.add(new Account(3,"Cuenta 3"));


        return l;
    }


}
