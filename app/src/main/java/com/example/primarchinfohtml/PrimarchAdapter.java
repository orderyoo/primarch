package com.example.primarchinfohtml;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class PrimarchAdapter extends ArrayAdapter<String[]> {
    private final Context context;
    private final String[][] primarchs;
    int text_red, text_green, text_blue;
    int background_red, background_green, background_blue;
    public PrimarchAdapter(Context context, int resource, String[][] primarchs, int[] text_color, int[] bg_color) {
        super(context, resource);
        this.context = context;
        this.primarchs = primarchs;
        text_red = text_color[0];
        text_green = text_color[1];
        text_blue = text_color[2];
        background_red   = bg_color[0];
        background_green = bg_color[1];
        background_blue  = bg_color[2];
    }

    @Override
    public int getCount() {
        return primarchs.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View view = inflater.inflate(android.R.layout.simple_expandable_list_item_1, parent, false);
            TextView textView = view.findViewById(android.R.id.text1);
            textView.setTextColor(Color.rgb(text_red, text_green, text_blue));
            textView.setBackgroundColor(Color.argb(90,background_red, background_green, background_blue));
            textView.setTextSize(20);
            textView.setText(primarchs[position][0]);

            return view;
    }

    @Override
    public String[] getItem(int position) {
        return primarchs[position];
    }
}
