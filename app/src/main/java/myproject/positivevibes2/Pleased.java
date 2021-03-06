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


public class Pleased extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pleased);
        Paper.init(this);
        String[] items={"It's really about being pleased with yourself.",
                "Each time I reach a goal or read a great review, I am beyond pleased.",
                "At the end of the day I'm pleased with the site I created.",
                "I'm pleased with my life, with the journey.",

                "When you're drowning, you don't say 'I would be incredibly pleased if someone would have the foresight to notice me drowning and come and help me,' you just scream.",
                "I once had a rose named after me and I was very flattered. But I was not pleased to read the description in the catalogue: no good in a bed, but fine up against a wall.",
                "If you always do what interests you, at least one person is pleased.",

                "She never envisioned a legal career for me, but she did think it was very important that I be able to support myself, and I think she would be pleased to see what has become of me.",

                "God has been pleased to save us during the years of war that have already passed. We pray that He may be pleased to save us to the end. But we must do our part. ",

                "The man who seeks to please God is the man who people are pleased with. The man who seeks to please others won't satisfy anyone.",

                "I'm pleased to say I grew up in a happy family in Dublin. I feel we're very close.",

                "I was very pleased that the positive things about me and my game outshone the aggressive style of play I use. I would never tone that down, because I believe in that style of play, and I believe that you can play rough on the court and still be a good sport.",

                "I'd love to be one of those people who, whenever you see them, you feel pleased.",

                "It was all so far away - there was quiet and an untouched feel to the country and I could work as I pleased.",

                "The only advantage of not being too good a housekeeper is that your guests are so pleased to feel how very much better they are.",

                "Happiness for me is totally just being at peace knowing that, everything I'm doing, God is pleased with that. It's complete peace for me.",

                "To say that a man is vain means merely that he is pleased with the effect he produces on other people.",


        };

        itemList = Paper.book().read("itemsPleased");
        if(itemList==null){
            itemList=new ArrayList<String>(Arrays.asList(items));
        }

        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView10);
        listV.setAdapter(adapter);
        editText=(EditText)findViewById(R.id.txtInput);
        Button btAdd=(Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem=editText.getText().toString();
                // add new item to arraylist
                itemList.add(newItem);
                Paper.book().write("itemsPleased", itemList);
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

public class Pleased extends AppCompatActivity {



    private ListView mainListView10;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pleased);

        // Find the ListView resource.
        mainListView10 = (ListView) findViewById(R.id.mainListView10);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"It's really about being pleased with yourself.",
                "Each time I reach a goal or read a great review, I am beyond pleased.",
                "At the end of the day I'm pleased with the site I created.",
                "I'm pleased with my life, with the journey.",

                "When you're drowning, you don't say 'I would be incredibly pleased if someone would have the foresight to notice me drowning and come and help me,' you just scream.",
                "I once had a rose named after me and I was very flattered. But I was not pleased to read the description in the catalogue: no good in a bed, but fine up against a wall.",
                "If you always do what interests you, at least one person is pleased.",

                "She never envisioned a legal career for me, but she did think it was very important that I be able to support myself, and I think she would be pleased to see what has become of me.",

                "God has been pleased to save us during the years of war that have already passed. We pray that He may be pleased to save us to the end. But we must do our part. ",

                "The man who seeks to please God is the man who people are pleased with. The man who seeks to please others won't satisfy anyone.",

                "I'm pleased to say I grew up in a happy family in Dublin. I feel we're very close.",

                "I was very pleased that the positive things about me and my game outshone the aggressive style of play I use. I would never tone that down, because I believe in that style of play, and I believe that you can play rough on the court and still be a good sport.",

                "I'd love to be one of those people who, whenever you see them, you feel pleased.",

                "It was all so far away - there was quiet and an untouched feel to the country and I could work as I pleased.",

                "The only advantage of not being too good a housekeeper is that your guests are so pleased to feel how very much better they are.",

                "Happiness for me is totally just being at peace knowing that, everything I'm doing, God is pleased with that. It's complete peace for me.",

                "To say that a man is vain means merely that he is pleased with the effect he produces on other people.",


        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView10.setAdapter(listAdapter);
    }
}
*/
