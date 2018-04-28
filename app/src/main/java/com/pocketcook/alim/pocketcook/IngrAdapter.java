package com.pocketcook.alim.pocketcook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

public class IngrAdapter extends RecyclerView.Adapter<IngrAdapter.IngrViewHolder> {
    private Context mCtx;
    private List<Ingridient> ingrList;
    Ingridient ingridient;

    public IngrAdapter(Context mCtx, List<Ingridient> ingrList) {
        this.mCtx = mCtx;
        this.ingrList = ingrList;
    }

    @Override
    public IngrViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_ingr, null);
        return new IngrViewHolder(view);
    }

    @Override
    public void onBindViewHolder(IngrViewHolder holder, int position) {
        //getting the product of the specified position
        ingridient = ingrList.get(position);

        //binding the data with the viewholder views
//        holder.textViewTitle.setText(ingridient.getNameOfIngridient());
//        holder.count.setText(ingridient.toString());
//        holder.unit.setText(ingridient.getUnit());
    }

    @Override
    public int getItemCount() {
        return ingrList.size();
    }

    class IngrViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        TextView count;
        TextView unit;


        public IngrViewHolder(View itemView) {
            super(itemView);

//            textViewTitle = itemView.findViewById(R.id.textViewTitleIngr);
//            count = itemView.findViewById(R.id.count);
//            unit = itemView.findViewById(R.id.unit);
        }
    }
}
