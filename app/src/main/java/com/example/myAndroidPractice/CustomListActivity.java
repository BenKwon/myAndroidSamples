package com.example.myAndroidPractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myAndroidPractice.CustomListAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import com.example.myAndroidPractice.Item;
public class CustomListActivity extends AppCompatActivity {
    private ListView ItemListView =null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        ListView custom = findViewById(R.id.custom_list_view);
        CustomListAdapter adapter = new CustomListAdapter(this, generateItemList());
        custom.setAdapter(adapter);
    }
    private ArrayList<Item> generateItemList(){
        String itemNames[] = getResources().getStringArray(R.array.items_name);
        String itemDescription[] = getResources().getStringArray(R.array.item_description);

        ArrayList<Item> list = new ArrayList<>();
        for(int i = 0 ; i < itemNames.length ;i++){
            list.add(new Item(itemNames[i],itemDescription[i]));
        }
        return list;
    }
}