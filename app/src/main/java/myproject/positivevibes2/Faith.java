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


public class Faith extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faith);
        String[] items={"Believe in yourself! Have faith in your abilities! Without a humble but reasonable confidence in your own powers you cannot be successful or happy.",
                "Always be yourself, express yourself, have faith in yourself, do not go out and look for a successful personality and duplicate it.",
                "Faith is the bird that feels the light when the dawn is still dark.",
                "Sometimes life hits you in the head with a brick. Don't lose faith.",
                "Resist your fear; fear will never lead to you a positive end. Go for your faith and what you believe",
                "All the world is made of faith, and trust, and pixie dust",
                "Faithless is he that says farewell when the road darkens.",
                "I have great faith in fools - self-confidence my friends will call it.",
                "And now these three remain: faith, hope and love. But the greatest of these is love",
                "God will not look you over for medals, degrees or diplomas but for scars.",
                "Faith is not the belief that God will do what you want. It is the belief that God will do what is right",
                "Faith does not eliminate questions. But faith knows where to take them",
                "What comes into our minds when we think about God is the most important thing about us",
                "Forgiveness is unlocking the door to set someone free and realising you were the prisoner",
                "God’s definition of what matters is pretty straightforward. He measures our lives by how we love",
                "God never hurries. There are no deadlines against which he must work. ",
                "Only to know this is to quiet our spirits and relax our nerves.",



        };
        itemList=new ArrayList<String>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView7);
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

public class Faith extends AppCompatActivity {



    private ListView mainListView7;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faith);

        // Find the ListView resource.
        mainListView7 = (ListView) findViewById(R.id.mainListView7);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"Believe in yourself! Have faith in your abilities! Without a humble but reasonable confidence in your own powers you cannot be successful or happy.",
                "Always be yourself, express yourself, have faith in yourself, do not go out and look for a successful personality and duplicate it.",
                "Faith is the bird that feels the light when the dawn is still dark.",
                "Sometimes life hits you in the head with a brick. Don't lose faith.",
                "Resist your fear; fear will never lead to you a positive end. Go for your faith and what you believe",
                "All the world is made of faith, and trust, and pixie dust",
                "Faithless is he that says farewell when the road darkens.",
                "I have great faith in fools - self-confidence my friends will call it.",
                "And now these three remain: faith, hope and love. But the greatest of these is love",
                "God will not look you over for medals, degrees or diplomas but for scars.",
                "Faith is not the belief that God will do what you want. It is the belief that God will do what is right",
                "Faith does not eliminate questions. But faith knows where to take them",
                "What comes into our minds when we think about God is the most important thing about us",
                "Forgiveness is unlocking the door to set someone free and realising you were the prisoner",
                "God’s definition of what matters is pretty straightforward. He measures our lives by how we love",
                "God never hurries. There are no deadlines against which he must work. ",
                "Only to know this is to quiet our spirits and relax our nerves.",



        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Add more posVibes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.

        listAdapter.add("Our anxiety does not empty tomorrow of its sorrows, but only empties today of its strengths.");
        listAdapter.add("Always, everywhere God is present, and always He seeks to discover Himself to each one");
        listAdapter.add("We never grow closer to God when we just live life. It takes deliberate pursuit and attentiveness.");
        listAdapter.add("Worrying is arrogant because God knows what He’s doing");

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView7.setAdapter(listAdapter);
    }
}
*/
