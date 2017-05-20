package myproject.positivevibes2;





import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;



import android.support.v7.app.ActionBarActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;


public class MoreSuccessful extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_successful);
        String[] items={"Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do.",
                "Put your heart, mind, and soul into even your smallest acts. This is the secret of success.",
                "There are no secrets to success. It is the result of preparation, hard work, and learning from failure.",
                "Your positive action combined with positive thinking results in success.",
                "Success is not final, failure is not fatal: it is the courage to continue that counts.",
                " Education is the key to success in life, and teachers make a lasting impact in the lives of their students.",
                "Success is not a good teacher, failure makes you humble.",
                " Success is a science; if you have the conditions, you get the result.",
                "He has achieved success who has worked well, laughed often, and loved much.",
                "There is simply no substitute for hard work when it comes to achieving success.",
                "Success is a lousy teacher. It seduces smart people into thinking they can't lose.",
                "The road to success is always under construction.",
                "There is simply no substitute for hard work when it comes to achieving success.",
                " Success is how high you bounce when you hit bottom.",
                "My success isn't a result of arrogance - it's a result of belief.",
                "Success comes from knowing that you did your best to become the best that you are capable of becoming."




        };
        itemList=new ArrayList<String>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView3);
        listV.setAdapter(adapter);
        editText=(EditText)findViewById(R.id.txtInput);
        Button btAdd=(Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem=editText.getText().toString();
                // add new item to arraylist
                itemList.add(newItem);
                // notify listview of data changed
                adapter.notifyDataSetChanged();

            }

        });

    }

}



/*


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MoreSuccessful extends AppCompatActivity {





    private ListView mainListView3;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_successful);

        // Find the ListView resource.
        mainListView3 = (ListView) findViewById(R.id.mainListView3);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do.",
                "Put your heart, mind, and soul into even your smallest acts. This is the secret of success.",
                "There are no secrets to success. It is the result of preparation, hard work, and learning from failure.",
                "Your positive action combined with positive thinking results in success.",
                "Success is not final, failure is not fatal: it is the courage to continue that counts.",
                " Education is the key to success in life, and teachers make a lasting impact in the lives of their students.",
                "Success is not a good teacher, failure makes you humble.",
                " Success is a science; if you have the conditions, you get the result.",
                "He has achieved success who has worked well, laughed often, and loved much.",
                "There is simply no substitute for hard work when it comes to achieving success.",
                "Success is a lousy teacher. It seduces smart people into thinking they can't lose.",
                "The road to success is always under construction.",
                "There is simply no substitute for hard work when it comes to achieving success.",
                " Success is how high you bounce when you hit bottom.",
                "My success isn't a result of arrogance - it's a result of belief.",
                "Success comes from knowing that you did your best to become the best that you are capable of becoming."





        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Add more posVibes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.

        listAdapter.add("Try to look at your weakness and convert it into your strength. That's success.");
        listAdapter.add("Success is simple. Do what's right, the right way, at the right time.");
        listAdapter.add("Success is not a function of the size of your title but the richness of your contribution");
        listAdapter.add("There is little success where there is little laughter.");

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView3.setAdapter(listAdapter);
    }
}


*/
