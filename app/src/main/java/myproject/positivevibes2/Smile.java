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


public class Smile extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smile);
        Paper.init(this);
        String[] items={" Smile in the mirror. Do that every morning and you'll start to see a big difference in your life.",
                "Share your smile with the world. It's a symbol of friendship and peace.",
                "Never frown because you never know who is falling in love with your smile.",
                "Keep smiling… It makes people wonder what you’ve been up to.",
                "I smile not for that I am happy, but sometimes I smile to hide sadness.",
                " One smile can’t change the world, but your smile changes mine.",
                "I keep my head held high and smile, because there are people who will kill to see me fall.",
                " You walk through life much easier with a smile on your face.",
                "A smiling face is a beautiful face. A smiling heart is a happy heart.",
                "I smile because I have no idea what’s going on.",
                "Worry less. Smile more. Listen carefully. Take responsibility. Accept what you can’t change.Embrace the lessons. Love your life. Today.",
                "Smiling makes people feel good and positive, conveying a sense of good-will, rapport and trust.",
                "Smiling speaks to people charmingly without saying a word.",
                " Be someone else’s sunshine. Be the reason someone smiles today.",
                "Smile.. And the world will smile at you..", "A smile is an inexpensive way to change your looks.",


        };
        itemList=new ArrayList<String>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView4);
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

public class Smile extends AppCompatActivity {




    private ListView mainListView4;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smile);

        // Find the ListView resource.
        mainListView4 = (ListView) findViewById(R.id.mainListView4);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{" Smile in the mirror. Do that every morning and you'll start to see a big difference in your life.",
                "Share your smile with the world. It's a symbol of friendship and peace.",
                "Never frown because you never know who is falling in love with your smile.",
                "Keep smiling… It makes people wonder what you’ve been up to.",
                "I smile not for that I am happy, but sometimes I smile to hide sadness.",
                " One smile can’t change the world, but your smile changes mine.",
                "I keep my head held high and smile, because there are people who will kill to see me fall.",
                " You walk through life much easier with a smile on your face.",
                "A smiling face is a beautiful face. A smiling heart is a happy heart.",
                "I smile because I have no idea what’s going on.",
                "Worry less. Smile more. Listen carefully. Take responsibility. Accept what you can’t change.Embrace the lessons. Love your life. Today.",
                "Smiling makes people feel good and positive, conveying a sense of good-will, rapport and trust.",
                "Smiling speaks to people charmingly without saying a word.",
                " Be someone else’s sunshine. Be the reason someone smiles today.",
                "Smile.. And the world will smile at you..", "A smile is an inexpensive way to change your looks.",





        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Add more posVibes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.

        listAdapter.add("Smiling does not always mean you are completely happy, sometimes it means you want to avoid sadness.");
        listAdapter.add("Always smile even if its a sad smile because sadder than a sad smile is the saddness of not knowing how to smile.");
        listAdapter.add("Smile at everyone, you never know who’s an angel.");
        listAdapter.add("Smile its not about you, its about who it helps!");

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView4.setAdapter(listAdapter);
    }
}

*/
