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


public class DontGiveUp extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dont_give_up);
        Paper.init(this);
        String[] items={"Fall seven times and stand up eight.",
                "It's not that I'm so smart, it's just that I stay with problems longer.",
                "Many of life's failures are people who did not realize how close they were to success when they gave up.",
                "Failure is only the opportunity to begin again, this time more intelligently.",
                " A failure is not always a mistake. It may simply be the best one can do under the circumstances. The real mistake is to stop trying.",
                "Ask yourself this question: 'Will this matter a year from now?",
                "What if I told you that 10 years from now, your life would be exactly the same? I doubt you'd be happy. So, why are you so afraid of change?",
                "As I look back on my life, I realize that every time I thought I was being rejected from something good, I was actually being redirected to something better.",
                "Success is the sum of small efforts, repeated day in and day out.",
                "It does not matter how slowly you go so long as you do not stop.",
                "Never confuse a single defeat with a final defeat.",
                "Perseverance is the hard work you do after you get tired of doing the hard work you already did.",
                "Perseverance is failing 19 times and succeeding the 20th.",
                "Through perseverance many people win success out of what seemed destined to be certain failure.",
                "Success seems to be largely a matter of hanging on after others have let go.",
                "Develop success from failures. Discouragement and failure are two of the surest stepping stones to success.",
                "Failure is often that early morning hour of darkness which precedes the dawning of the day of success.",
                "We will either find a way or make one.",
                "It always seems impossible until it's done.",
                "The best way out is always through.",
                "A winner is just a loser who tried one more time.",
                "I don't know the key to success, but the key to failure is trying to please everybody.",
                "Defeat is not the worst of failures. Not to have tried is the true failure.",
                "When you get into a tight place and everything goes against you … never give up then, for that is just the place and time that the tide will turn.",
                "The man who moves a mountain begins by carrying away small stones.",
                "I am a slow walker, but I never walk back.",
                "Every strike brings me closer to the next home run.",
                "Courage is not having the strength to go on; it is going on when you don't have the strength.",
                "Character consists of what you do on the third and fourth tries.",
                "Perseverance is not a long race; it is many short races one after the other.",

        };


        itemList = Paper.book().read("itemsDontGiveUp");
        if(itemList==null){
            itemList=new ArrayList<String>(Arrays.asList(items));
        }


        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView14);
        listV.setAdapter(adapter);
        editText=(EditText)findViewById(R.id.txtInput);
        Button btAdd=(Button)findViewById(R.id.btAdd);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem=editText.getText().toString();
                // add new item to arraylist
                itemList.add(newItem);
                Paper.book().write("itemsDontGiveUp", itemList);
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

public class DontGiveUp extends AppCompatActivity {


    private ListView mainListView14;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dont_give_up);

        // Find the ListView resource.
        mainListView14 = (ListView) findViewById(R.id.mainListView14);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"Fall seven times and stand up eight.",
                "It's not that I'm so smart, it's just that I stay with problems longer.",
                "Many of life's failures are people who did not realize how close they were to success when they gave up.",
                "Failure is only the opportunity to begin again, this time more intelligently.",
                " A failure is not always a mistake. It may simply be the best one can do under the circumstances. The real mistake is to stop trying.",
                "Ask yourself this question: 'Will this matter a year from now?",
                "What if I told you that 10 years from now, your life would be exactly the same? I doubt you'd be happy. So, why are you so afraid of change?",
                "As I look back on my life, I realize that every time I thought I was being rejected from something good, I was actually being redirected to something better.",
                "Success is the sum of small efforts, repeated day in and day out.",
                "It does not matter how slowly you go so long as you do not stop.",
                "Never confuse a single defeat with a final defeat.",
                "Perseverance is the hard work you do after you get tired of doing the hard work you already did.",
                "Perseverance is failing 19 times and succeeding the 20th.",
                "Through perseverance many people win success out of what seemed destined to be certain failure.",
                "Success seems to be largely a matter of hanging on after others have let go.",
                "Develop success from failures. Discouragement and failure are two of the surest stepping stones to success.",
                "Failure is often that early morning hour of darkness which precedes the dawning of the day of success.",
                "We will either find a way or make one.",
                "It always seems impossible until it's done.",
                "The best way out is always through.",
                "A winner is just a loser who tried one more time.",
                "I don't know the key to success, but the key to failure is trying to please everybody.",
                "Defeat is not the worst of failures. Not to have tried is the true failure.",
                "When you get into a tight place and everything goes against you … never give up then, for that is just the place and time that the tide will turn.",
                "The man who moves a mountain begins by carrying away small stones.",
                "I am a slow walker, but I never walk back.",
                "Every strike brings me closer to the next home run.",
                "Courage is not having the strength to go on; it is going on when you don't have the strength.",
                "Character consists of what you do on the third and fourth tries.",
                "Perseverance is not a long race; it is many short races one after the other.",

        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView14.setAdapter(listAdapter);
    }
}
*/
