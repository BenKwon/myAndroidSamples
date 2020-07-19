package com.example.myAndroidPractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import com.example.myAndroidPractice.CustomListAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import com.example.myAndroidPractice.Item;
public class CustomListActivity extends AppCompatActivity {
    private ListView ItemListView =null ;
    CustomListAdapter adapter;
    ListView custom;
    ArrayList<Item> item_lists = new ArrayList<Item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        custom = findViewById(R.id.custom_list_view);

        item_lists = generateItemList();
        adapter = new CustomListAdapter(this, item_lists);
        custom.setAdapter(adapter);

        EditText editTextFilter = (EditText)findViewById(R.id.search_phone);
        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String search_text = editTextFilter.getText().toString();
                show_search_result(search_text);
            }
        });
    }
    public void show_search_result(String search_text){
        item_lists.clear();
        if(search_text.length() == 0){
            item_lists.addAll(generateItemList());
        }
        else{
            for(int i = 0;i < generateItemList().size(); i++)
            {
                if (generateItemList().get(i).getItemName().toLowerCase().contains(search_text.toLowerCase()))
                {
                    item_lists.add(generateItemList().get(i));
                }
          /*      if (generateItemList().get(i).getItemDescription().toLowerCase().contains(search_text))
                {
                    item_lists.add(generateItemList().get(i));
                }*/
            }
        }
        adapter.notifyDataSetChanged();
    }

    private ArrayList<Item> generateItemList(){
        String itemNames[] = getResources().getStringArray(R.array.items_name);
        String itemDescription[] = getResources().getStringArray(R.array.item_phone);

        ArrayList<Item> list = new ArrayList<>();
        for(int i = 0 ; i < itemNames.length ;i++){
            list.add(new Item(itemNames[i],itemDescription[i], ContextCompat.getDrawable(this, R.drawable.msg),
                    ContextCompat.getDrawable(this, R.drawable.call)));
        }
        return list;
    }
}