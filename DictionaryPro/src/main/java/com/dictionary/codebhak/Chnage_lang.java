package com.dictionary.codebhak;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chnage_lang extends AppCompatActivity {

    ListView listView;
    String[] mobileArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chnage_lang);
        // get action bar
        ActionBar actionBar = getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView = (ListView) findViewById(R.id.mobile_list);
        mobileArray = getResources().getStringArray(R.array.lang);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mobileArray);
        listView.setAdapter(adapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
           {

               if (position == 0)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_Kolhapur.class);
                   startActivity(intent);
               }
               else if (position == 1)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_mumbai.class);
                   startActivity(intent);
               }
               else if (position == 2)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_pune.class);
                   startActivity(intent);
               }
               else if (position == 3)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_jalgaon.class);
                   startActivity(intent);
               }
               else if (position == 4)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_nasik.class);
                   startActivity(intent);
               }

               else if (position == 5)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_amravati.class);
                   startActivity(intent);
               }
               else if (position == 6)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_yatmal.class);
                   startActivity(intent);
               }
               else if (position == 7)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_Dhule.class);
                   startActivity(intent);
               }
               else if (position == 8)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_Nagpur.class);
                   startActivity(intent);
               }
               else if (position == 9)
               {
                   Intent intent = new Intent(Chnage_lang.this,Marathi_Thane.class);
                   startActivity(intent);
               }

           }
       });


    }
}
