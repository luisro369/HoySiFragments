package com.luisro00005513.hoysifragments;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public abstract class RecyclerViewAdapterAccounts extends RecyclerView.Adapter<RecyclerViewAdapterAccounts.ViewHolder> {

    private ArrayList<Account> accounts;

    public RecyclerViewAdapterAccounts(ArrayList<Account>accounts){this.accounts= accounts;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_accounts, parent, false);
       return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position){
        final Account account = accounts.get(position);

        holder.name.setText(account.getName());
        holder.initial.setText(account.getInitial());

        holder.moneyin.setText(account.getMoneyin());
        holder.moneyoff.setText(account.getMoneyoff());


    }

    @Override
    public int getItemCount(){return accounts.size();}

    public abstract void OnViewClick(View v, int pos);

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView initial;
        TextView moneyin;
        TextView moneyoff;

        public ViewHolder(View itemView){
            super(itemView);
            name= itemView.findViewById(R.id.accountName);
            initial= itemView.findViewById(R.id.initialAmount);
            moneyin = itemView.findViewById(R.id.moneyIn);
            moneyoff = itemView.findViewById(R.id.moneyOff);
        }
    }





}
