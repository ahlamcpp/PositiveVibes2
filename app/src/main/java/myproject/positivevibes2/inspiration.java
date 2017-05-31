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

import io.paperdb.Paper;


public class inspiration extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiration);
        Paper.init(this);
        String[] items={"Keep your eyes on the stars and your feet on the ground.",
                "Be who you are and say what you feel, because those who mind don't matter and those who matter don't mind.",
                "This too, shall pass.",
                "The only person you should try to be better than is the person you were yesterday.",
                "Never be bullied into silence. Never allow yourself to be made a victim. Accept no one's definition of your life; define yourself.",
                "Faith is the art of holding on to things your reason has once accepted, in spite of your changing moods.",
                "A man who flies from his fear may find that he has only taken a shortcut to meet it.",
                "Life's too mysterious to take too serious.",
                "No one can make you feel inferior without your consent.",
                "The woman who follows the crowd will usually go no further than the crowd. The woman who walks alone is likely to find herself in places no one has been before.",
                "You can't go around building a better world for people. Only people can build a better world for people. Otherwise it's just a cage.",
                "There isn't a way things should be. There's just what happens, and what we do.",
                "It's not about how hard you can hit; it's about how hard you can get hit and keep moving forward.",

                "If you want to go fast, go alone. If you want to go far, go together.",
                "It's OK to not be OK, as long as you don't stay that way.",
                "I can be changed by what happens to me but I refuse to be reduced by it.",
                "Believe you can and you're halfway there.",
                "May I never be complete. May I never be content. May I never be perfect.",
                "Nothing in life is to be feared; it is only to be understood. Now is the time to understand more so that we may fear less.",





        };


        itemList = Paper.book().read("itemsin");
        if(itemList==null){
            itemList=new ArrayList<String>(Arrays.asList(items));
        }

        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView8);
        listV.setAdapter(adapter);
        editText=(EditText)findViewById(R.id.txtInput);
        Button btAdd=(Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem=editText.getText().toString();
                // add new item to arraylist
                itemList.add(newItem);
                Paper.book().write("itemsin", itemList);
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

public class inspiration extends AppCompatActivity {


    private ListView mainListView8;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiration);

        // Find the ListView resource.
        mainListView8 = (ListView) findViewById(R.id.mainListView8);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"Keep your eyes on the stars and your feet on the ground.",
                "Be who you are and say what you feel, because those who mind don't matter and those who matter don't mind.",
                "This too, shall pass.",
                "The only person you should try to be better than is the person you were yesterday.",
                "Never be bullied into silence. Never allow yourself to be made a victim. Accept no one's definition of your life; define yourself.",
                "Faith is the art of holding on to things your reason has once accepted, in spite of your changing moods.",
                "A man who flies from his fear may find that he has only taken a shortcut to meet it.",
                "Life's too mysterious to take too serious.",
                "No one can make you feel inferior without your consent.",
                "The woman who follows the crowd will usually go no further than the crowd. The woman who walks alone is likely to find herself in places no one has been before.",
                "You can't go around building a better world for people. Only people can build a better world for people. Otherwise it's just a cage.",
                "There isn't a way things should be. There's just what happens, and what we do.",
                "It's not about how hard you can hit; it's about how hard you can get hit and keep moving forward.",

                "If you want to go fast, go alone. If you want to go far, go together.",
                "It's OK to not be OK, as long as you don't stay that way.",
                "I can be changed by what happens to me but I refuse to be reduced by it.",
                "Believe you can and you're halfway there.",
                "May I never be complete. May I never be content. May I never be perfect.",
                "Nothing in life is to be feared; it is only to be understood. Now is the time to understand more so that we may fear less.",





        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Add more posVibes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.

        listAdapter.add("Those who don't believe in magic will never find it.");
        listAdapter.add("There is no elevator to success — you have to take the stairs.");
        listAdapter.add("Plant your garden and decorate your own soul, instead of waiting for someone to bring you flowers.");
        listAdapter.add("It does not do to dwell on dreams and forget to live.");

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView8.setAdapter(listAdapter);
    }
}
*/
