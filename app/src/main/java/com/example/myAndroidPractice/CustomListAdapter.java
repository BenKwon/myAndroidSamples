package com.example.myAndroidPractice;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item> items;
    public CustomListAdapter(Context context, ArrayList<Item> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_list_view_row_items,parent, false);
        }
        Item currentItem =(Item) getItem(position);
        ImageView imageViewItemMsg = (ImageView) convertView.findViewById(R.id.msg);
        ImageView imageViewItemCall = (ImageView) convertView.findViewById(R.id.call);
        TextView textViewItemName =(TextView) convertView.findViewById(R.id.text_view_item_name);
        TextView textViewItemDescription = (TextView) convertView.findViewById(R.id.text_view_item_phone);

        imageViewItemMsg.setImageDrawable(currentItem.getMsgImage());
        imageViewItemCall.setImageDrawable(currentItem.getCallImage());
        textViewItemName.setText(currentItem.getItemName());
        textViewItemDescription.setText(currentItem.getItemDescription());
        return convertView;
    }
}
