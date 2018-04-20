package com.dut.kuypey1809.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBook;
    ArrayList<ListBook> arrayList;
    ListBookAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new ListBookAdapter(this, R.layout.flow_list_book, arrayList);
        lvBook.setAdapter(adapter);

    }

    private void AnhXa() {
        lvBook = (ListView) findViewById(R.id.listviewBook);
        arrayList = new ArrayList<>();

        arrayList.add(new ListBook("Book 1", "Coders At Work", R.drawable.capture));
        arrayList.add(new ListBook("Book 2", "Code Complete", R.drawable.capture1));
        arrayList.add(new ListBook("Book 3", "The Mythical Man-Month", R.drawable.capture2));
        arrayList.add(new ListBook("Book 4", "Dont Make Me Think", R.drawable.capture3));
        arrayList.add(new ListBook("Book 5", "The Pragmatic Programer", R.drawable.capture4));
        arrayList.add(new ListBook("Book 6", "Clean Code", R.drawable.capture5));
        arrayList.add(new ListBook("Book 7", "Programming Pearls", R.drawable.capture7));
    }
}
