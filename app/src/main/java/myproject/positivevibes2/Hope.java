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


public class Hope extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hope);
        Paper.init(this);
        String[] items={"Hope is the thing with feathers, That perches in the soul , And sings the tune without the words, And never stops at all. ",
                "Keep your eyes on the sun and you will not see the shadows.",
                "Look at the bright side.Never give up hope.",
                "No river can return to its source, yet all rivers must have a beginning. ",
                "The darkest hours are just before dawn.",
                "Where there's life, there's hope.",
                "We must accept finite disappointment, but never lose infinite hope.",
                "Hope is being able to see that there is light despite all of the darkness.",
                "Hope is important because it can make the present moment less difficult to bear. If we believe that tomorrow will be better, we can bear a hardship today",
                "Every cloud has a silver lining.",
                "Every jack has his jill; if only they can find each other.",
                "Every pot will find its lid.",
                "Hope for the best and prepare for the worst.",
                "Hope is a good breakfast but a bad supper.",
                "Hope springs eternal.",
                "However long the night, the dawn will break.",
                "If it were not for hope, the heart would break.",
                "Yesterday is history, tomorrow is a mystery, today is a gift of God, which is why we call it the present.",
                "Listen to the mustn'ts, child. Listen to the don'ts. Listen to the shouldn'ts, the impossibles, the won'ts. Listen to the never haves, then listen close to me... Anything can happen, child. Anything can be.",
                "You may say I'm a dreamer, but I'm not the only one. I hope someday you'll join us. And the world will live as one.",
                "When we love, we always strive to become better than we are. When we strive to become better than we are, everything around us becomes better too",
                "I like the night. Without the dark, we'd never see the stars.",
                "Hold fast to dreams, For if dreams die, Life is a broken-winged bird, That cannot fly",

                "There is some good in this world, and it's worth fighting for.",
                "They say a person needs just three things to be truly happy in this world: someone to love, something to do, and something to hope for.",
                "And now these three remain: faith, hope and love. But the greatest of these is love.",


        };
        itemList = Paper.book().read("itemsHope");
        if(itemList==null){
            itemList=new ArrayList<String>(Arrays.asList(items));
        }

        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView12);
        listV.setAdapter(adapter);
        editText=(EditText)findViewById(R.id.txtInput);
        Button btAdd=(Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem=editText.getText().toString();
                // add new item to arraylist
                itemList.add(newItem);
                Paper.book().write("itemsHope", itemList);
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

public class Hope extends AppCompatActivity {



    private ListView mainListView12;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hope);

        // Find the ListView resource.
        mainListView12 = (ListView) findViewById(R.id.mainListView12);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"Hope is the thing with feathers, That perches in the soul , And sings the tune without the words, And never stops at all. ",
                "Keep your eyes on the sun and you will not see the shadows.",
                "Look at the bright side.Never give up hope.",
                "No river can return to its source, yet all rivers must have a beginning. ",
                "The darkest hours are just before dawn.",
                "Where there's life, there's hope.",
                "We must accept finite disappointment, but never lose infinite hope.",
                "Hope is being able to see that there is light despite all of the darkness.",
                "Hope is important because it can make the present moment less difficult to bear. If we believe that tomorrow will be better, we can bear a hardship today",
                "Every cloud has a silver lining.",
                "Every jack has his jill; if only they can find each other.",
                "Every pot will find its lid.",
                "Hope for the best and prepare for the worst.",
                "Hope is a good breakfast but a bad supper.",
                "Hope springs eternal.",
                "However long the night, the dawn will break.",
                "If it were not for hope, the heart would break.",
                "Yesterday is history, tomorrow is a mystery, today is a gift of God, which is why we call it the present.",
                "Listen to the mustn'ts, child. Listen to the don'ts. Listen to the shouldn'ts, the impossibles, the won'ts. Listen to the never haves, then listen close to me... Anything can happen, child. Anything can be.",
                "You may say I'm a dreamer, but I'm not the only one. I hope someday you'll join us. And the world will live as one.",
                "When we love, we always strive to become better than we are. When we strive to become better than we are, everything around us becomes better too",
                "I like the night. Without the dark, we'd never see the stars.",
                "Hold fast to dreams, For if dreams die, Life is a broken-winged bird, That cannot fly",

                "There is some good in this world, and it's worth fighting for.",
                "They say a person needs just three things to be truly happy in this world: someone to love, something to do, and something to hope for.",
                "And now these three remain: faith, hope and love. But the greatest of these is love.",

        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView12.setAdapter(listAdapter);
    }
}
*/
