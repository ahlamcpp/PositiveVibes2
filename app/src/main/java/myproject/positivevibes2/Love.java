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


public class Love extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);
        Paper.init(this);
        String[] items={"There is only one happiness in this life, to love and be loved.",
                " I look at you and see the rest of my life in front of my eyes.",
                "The greatest happiness of life is the conviction that we are loved, loved for ourselves, or rather, loved in spite of ourselves.",
                "All, everything that I understand, I only understand because I love.",
                "And remember, as it was written, to love another person is to see the face of God.",
                " I'm much more me when I'm with you.",
                "The best and most beautiful things in this world cannot be seen or even heard, but must be felt with the heart.",
                " To love is nothing. To be loved is something. But to love and be loved, that’s everything.",
                "The heart wants what it wants. There's no logic to these things. You meet someone and you fall in love and that's that",
                "I swear I couldn't love you more than I do right now, and yet I know I will tomorrow",
                "If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.",
                "You don't love someone because they're perfect, you love them in spite of the fact that they're not.",
                "I would rather spend one lifetime with you, than face all the ages of this world alone",
                "If I know what love is, it is because of you",
                "You are my best friend, my human diary and my other half. You mean the world to me and I LOVE YOU.",
                "Don’t forget I’m just a girl, standing in front of a boy, asking him to love her"





        };


        itemList = Paper.book().read("itemsLove");
        if(itemList==null){
            itemList=new ArrayList<String>(Arrays.asList(items));
        }


        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView5);
        listV.setAdapter(adapter);
        editText=(EditText)findViewById(R.id.txtInput);
        Button btAdd=(Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem=editText.getText().toString();
                // add new item to arraylist
                itemList.add(newItem);
                Paper.book().write("itemsLove", itemList);
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

public class Love extends AppCompatActivity {






    private ListView mainListView5;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        // Find the ListView resource.
        mainListView5 = (ListView) findViewById(R.id.mainListView5);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"There is only one happiness in this life, to love and be loved.",
                " I look at you and see the rest of my life in front of my eyes.",
                "The greatest happiness of life is the conviction that we are loved, loved for ourselves, or rather, loved in spite of ourselves.",
                "All, everything that I understand, I only understand because I love.",
                "And remember, as it was written, to love another person is to see the face of God.",
                " I'm much more me when I'm with you.",
                "The best and most beautiful things in this world cannot be seen or even heard, but must be felt with the heart.",
                " To love is nothing. To be loved is something. But to love and be loved, that’s everything.",
                "The heart wants what it wants. There's no logic to these things. You meet someone and you fall in love and that's that",
                "I swear I couldn't love you more than I do right now, and yet I know I will tomorrow",
                "If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.",
                "You don't love someone because they're perfect, you love them in spite of the fact that they're not.",
                "I would rather spend one lifetime with you, than face all the ages of this world alone",
                "If I know what love is, it is because of you",
                "You are my best friend, my human diary and my other half. You mean the world to me and I LOVE YOU.",
                "Don’t forget I’m just a girl, standing in front of a boy, asking him to love her"





        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Add more posVibes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.

        listAdapter.add("If I know what love is, it is because of you.");
        listAdapter.add("At the touch of love everyone becomes a poet");
        listAdapter.add("Being deeply loved by someone gives you strength, while loving someone deeply gives you courage.");
        listAdapter.add("We are shaped and fashioned by those we love.");

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView5.setAdapter(listAdapter);
    }

}
*/
