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


public class Honesty extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honesty);
        Paper.init(this);
        String[] items={"Honesty is the best policy. when there is money in it.",
                "Honesty is the fastest way to prevent a mistake from turning into a failure.",
                "Integrity is telling myself the truth. And honesty is telling the truth to other people.",
                "Honesty is the most single most important factor having a direct bearing on the final success of an individual, corporation, or product.",
                "As you grew, we encouraged you to be open and direct. As you leave, never lose your honesty with those whom you speak.",
                "Don't pretend to be something you aren't.",
                "I’m just honest, I like that I don’t have to worry about what I say. I really don’t have the time or energy to pretend and I don’t want to live that way.",
                "Honesty and integrity are absolutely essential for success in life – all areas of life. The really good news is that anyone can develop both honesty and integrity.",
                "Honesty is the first chapter in the book of wisdom.",
                "People are illogical, unreasonable, and self-centered.Love them anyway.",
                "If you do good, people will accuse you of selfish ulterior motives. Do good anyway.",

                "If you are successful, you will win false friends and true enemies. Succeed anyway.",

                "The good you do today will be forgotten tomorrow. Do good anyway.",

                "Honesty and frankness make you vulnerable. Be honest and frank anyway.",

                "The biggest men and women with the biggest ideas can be shot down by the smallest men and women with the smallest minds.Think big anyway.",

                "People favor underdogs but follow only top dogs. Fight for a few underdogs anyway.",

                "What you spend years building may be destroyed overnight. Build anyway.",

                "People really need help but may attack you if you do help them. Help people anyway.",

                "Give the world the best you have and you'll get kicked in the teeth. Give the world the best you have anyway.",




        };

        itemList = Paper.book().read("itemsHonest");
        if(itemList==null){
            itemList=new ArrayList<String>(Arrays.asList(items));
        }

        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView9);
        listV.setAdapter(adapter);
        editText=(EditText)findViewById(R.id.txtInput);
        Button btAdd=(Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem=editText.getText().toString();
                // add new item to arraylist
                itemList.add(newItem);
                Paper.book().write("itemsHonest", itemList);
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

public class Honesty extends AppCompatActivity {




    private ListView mainListView9;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honesty);

        // Find the ListView resource.
        mainListView9 = (ListView) findViewById(R.id.mainListView9);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"Honesty is the best policy. when there is money in it.",
                "Honesty is the fastest way to prevent a mistake from turning into a failure.",
                "Integrity is telling myself the truth. And honesty is telling the truth to other people.",
                "Honesty is the most single most important factor having a direct bearing on the final success of an individual, corporation, or product.",
                "As you grew, we encouraged you to be open and direct. As you leave, never lose your honesty with those whom you speak.",
                "Don't pretend to be something you aren't.",
                "I’m just honest, I like that I don’t have to worry about what I say. I really don’t have the time or energy to pretend and I don’t want to live that way.",
                "Honesty and integrity are absolutely essential for success in life – all areas of life. The really good news is that anyone can develop both honesty and integrity.",
                "Honesty is the first chapter in the book of wisdom.",
                "People are illogical, unreasonable, and self-centered.Love them anyway.",
                "If you do good, people will accuse you of selfish ulterior motives. Do good anyway.",

                "If you are successful, you will win false friends and true enemies. Succeed anyway.",

                "The good you do today will be forgotten tomorrow. Do good anyway.",

                "Honesty and frankness make you vulnerable. Be honest and frank anyway.",

                "The biggest men and women with the biggest ideas can be shot down by the smallest men and women with the smallest minds.Think big anyway.",

                "People favor underdogs but follow only top dogs. Fight for a few underdogs anyway.",

        "What you spend years building may be destroyed overnight. Build anyway.",

        "People really need help but may attack you if you do help them. Help people anyway.",

        "Give the world the best you have and you'll get kicked in the teeth. Give the world the best you have anyway.",




        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Add more posVibes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.

        listAdapter.add("Keep conscience clear, then never fear. ");
        listAdapter.add("It is better to suffer for truth than to prosper by falsehood.");
        listAdapter.add("Half the truth is often a whole lie.");
        listAdapter.add("He that steals an egg will steal an ox. ");

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView9.setAdapter(listAdapter);
    }
}
*/
