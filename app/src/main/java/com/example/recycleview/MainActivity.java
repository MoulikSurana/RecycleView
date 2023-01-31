package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView cRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cRV=findViewById(R.id.cRV);

        ArrayList<Contact> contact=new ArrayList<Contact>();
        int i;
//        for ( i=1;i<=100;i++)
//        {String w=Integer.toString(i);}
            contact.add(new Contact("abc","moulik@gmail.com","https://id.pinterest.com/vannesacarlot/car-photos-gallery/"));
        contact.add(new Contact("Moulik","moulik@gmail.com","https://unsplash.com/s/photos/cars" ));
        contact.add(new Contact("Moulik","moulik@gmail.com","https://id.pinterest.com/vannesacarlot/car-photos-gallery/"));
        contact.add(new Contact("Moulik","moulik@gmail.com","https://id.pinterest.com/vannesacarlot/car-photos-gallery/"));

        ContAdap adapter =new ContAdap(this);
        adapter.setCon(contact);
        cRV.setAdapter(adapter);
//        cRV.setLayoutManager(new LinearLayoutManager(this));
        cRV.setLayoutManager(new GridLayoutManager(this,2));

    }
}