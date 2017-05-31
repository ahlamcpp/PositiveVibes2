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


public class BePositive extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_positive);
        Paper.init(this);
        String[] items={"Once you replace negative thoughts with positive ones, you'll start having positive results.",
                "A strong, positive self-image is the best possible preparation for success.",
                "Work hard, stay positive, and get up early. It's the best part of the day.",
                "Every day brings new choices.",
                "In order to carry a positive action we must develop here a positive vision.",
                " Live life to the fullest, and focus on the positive.",
                "Adopting the right attitude can convert a negative stress into a positive one",
                " Keep your face to the sunshine and you cannot see a shadow",
                "Find a place inside where there's joy, and the joy will burn out the pain.",
                "Talking is always positive. That's why I talk too much.",
                "A positive attitude can really make dreams come true - it did for me.",
                "Your positive action combined with positive thinking results in success.",
                "You cannot have a positive life and a negative mind.",
                " Your smile will give you a positive countenance that will make people feel comfortable around you.",
                "It's amazing. Life changes very quickly, in a very positive way, if you let it.",


        };
        itemList = Paper.book().read("itemsPositive");
        if(itemList==null){
            itemList=new ArrayList<String>(Arrays.asList(items));
        }


        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView2);
        listV.setAdapter(adapter);
        editText=(EditText)findViewById(R.id.txtInput);
        Button btAdd=(Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem=editText.getText().toString();
                // add new item to arraylist
                itemList.add(newItem);
                Paper.book().write("itemsPositive", itemList);
                // notify listview of data changed
                adapter.notifyDataSetChanged();

            }

        });

    }

}





/*

public class BePositive extends AppCompatActivity {


    private ListView mainListView2;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_positive);

        // Find the ListView resource.
        mainListView2 = (ListView) findViewById(R.id.mainListView2);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"Once you replace negative thoughts with positive ones, you'll start having positive results.",
                "A strong, positive self-image is the best possible preparation for success.",
                "Work hard, stay positive, and get up early. It's the best part of the day.",
                "Every day brings new choices.",
                "In order to carry a positive action we must develop here a positive vision.",
                " Live life to the fullest, and focus on the positive.",
                "Adopting the right attitude can convert a negative stress into a positive one",
                " Keep your face to the sunshine and you cannot see a shadow",
                "Find a place inside where there's joy, and the joy will burn out the pain.",
                "Talking is always positive. That's why I talk too much.",
                "A positive attitude can really make dreams come true - it did for me.",
                "Your positive action combined with positive thinking results in success.",
                "You cannot have a positive life and a negative mind.",
                " Your smile will give you a positive countenance that will make people feel comfortable around you.",
                "It's amazing. Life changes very quickly, in a very positive way, if you let it.",





        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Add more posVibes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.

        listAdapter.add("People like to be around those who give off positive energy.");
        listAdapter.add("It's amazing. Life changes very quickly, in a very positive way, if you let it");
        listAdapter.add("I am a positive person. I never think of the glass as half empty. I just keep pushing forward.");
        listAdapter.add("Always turn a negative situation into a positive situation.");

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView2.setAdapter(listAdapter);
    }
}
*/
