package com.example.janko.myapplication;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.janko.myapplication.model.WeatherData;

/**
 * Created by JankoHP on 12.5.2016.
 */
public class CitiesAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    private WeatherData[] items;

    public CitiesAdapter(Context context) {
       inflater = LayoutInflater.from(context);
    }

    public void setItmems(WeatherData[] items) {
        this.items = items;
        notifyDataSetChanged();
    }

    // koliko vrstic ima tretnutn n vrstci
    @Override
    public int getCount() {
        if(items == null){
            return 0;
        }else {
            return items.length;
        }

    }
    // pridobi element ki ga zelimo prikazat
    @Override
    public WeatherData getItem(int position) {
        return items[position];
    }
    // urejanje po id-ju
    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    // kaj naj se uporabniku generira pri pos vstici
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) {
            view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);

        }

        WeatherData item = getItem(position);
        TextView textView = (TextView) view.findViewById(android.R.id.text1);
        textView.setText(item.getName());
        return view;


    }
}
