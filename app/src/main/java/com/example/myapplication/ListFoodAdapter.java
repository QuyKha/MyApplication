package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

public class ListFoodAdapter extends BaseAdapter {
    private Context context;
    private List<Food> listFood;
    private int layout;

    public ListFoodAdapter(Context context, List<Food> listFood, int layout) {
        this.context = context;
        this.listFood = listFood;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return listFood.size();
    }

    @Override
    public Object getItem(int position) {
        return listFood.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(layout, null);

        TextView title = convertView.findViewById(R.id.titleItemView);
        TextView des = convertView.findViewById(R.id.desItemView);
        TextView prices = convertView.findViewById(R.id.pricesItemView);
        ImageView img = convertView.findViewById(R.id.imageItemView);
        ImageButton button = convertView.findViewById(R.id.imageButtonItemView);

        title.setText(listFood.get(position).getTitle());
        des.setText(listFood.get(position).getDescription());
        prices.setText(listFood.get(position).getPrices());
        img.setImageResource(listFood.get(position).getImg());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailFoodActivity.class);
                intent.putExtra("food", (Serializable) listFood.get(position));
                context.startActivity(intent);


            }
        });
        
        return convertView;
    }
}
