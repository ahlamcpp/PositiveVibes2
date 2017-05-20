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


public class Trust extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trust);
        String[] items={"Learning to trust is one of life's most difficult tasks.",
                "It takes 20 years to build a reputation and five minutes to ruin it.",
                "We need people in our lives with whom we can be as open as possible. To have real conversations with people may seem like such a simple, obvious suggestion, but it involves courage and risk.",
                "The glue that holds all relationships together--including the relationship between the leader and the led--is trust, and trust is based on integrity.",
                "Trust is like blood pressure. It's silent, vital to good health, and if abused it can be deadly.",
                "Just trust yourself, then you will know how to live.",
                "Better to trust the man who is frequently in error than the one who is never in doubt.",
                "It takes two to do the trust tango--the one who risks (the trustor) and the one who is trustworthy (the trustee); each must play their role.",
                "The leaders who work most effectively, it seems to me, never say 'I.' And that's not because they have trained themselves not to say 'I.' They don't think 'I.' They think 'we'; they think 'team.' They understand their job to be to make the team function. They accept responsibility and don't sidestep it, but 'we' gets the credit.... This is what creates trust, what enables you to get the task done.",
                "Trust is built when someone is vulnerable and not taken advantage of.",
                "The best way to find out if you can trust somebody is to trust them.",
                "If you don't have trust inside your company, then you can't transfer it to your customers.",
                "The people when rightly and fully trusted will return the trust.",
                "Trust is the lubrication that makes it possible for organizations to work.",
                "Trust, but verify.",
                "Trust each other again and again. When the trust level gets high enough, people transcend apparent limits, discovering new and awesome abilities of which they were previously unaware.",
                "People follow leaders by choice. Without trust, at best you get compliance.",
                "When people honor each other, there is a trust established that leads to synergy, interdependence, and deep respect. Both parties make decisions and choices based on what is right, what is best, what is valued most highly.",
                "When a gifted team dedicates itself to unselfish trust and combines instinct with boldness and effort, it is ready to climb.",
                "He who does not trust enough will not be trusted.",
                "Leadership requires five ingredients--brains, energy, determination, trust, and ethics. The key challenges today are in terms of the last two--trust and ethics.",
                "You must trust and believe in people, or life becomes impossible.",
                "Wise men put their trust in ideas and not in circumstances.",
                "Few things help an individual more than to place responsibility upon him, and to let him know that you trust him.",
                "It is mutual trust, even more than mutual interest, that holds human associations together.",
                "When the trust account is high, communication is easy, instant, and effective.",
                "To be trusted is a greater compliment than to be loved.",
                "When mistrust comes in, loves goes out.",
                "Trust is built with consistency.",
                "Whoever is careless with the truth in small matters cannot be trusted with important matters.",

        };
        itemList=new ArrayList<String>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(this,R.layout.screen1_row,R.id.rowTextView,itemList);
        ListView listV=(ListView)findViewById(R.id.mainListView11);
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

public class Trust extends AppCompatActivity {

    private ListView mainListView11;
    private ArrayAdapter<String> listAdapter;







    */
/**
     * Called when the activity is first created.
     *//*

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trust);

        // Find the ListView resource.
        mainListView11 = (ListView) findViewById(R.id.mainListView11);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"Learning to trust is one of life's most difficult tasks.",
                "It takes 20 years to build a reputation and five minutes to ruin it.",
                "We need people in our lives with whom we can be as open as possible. To have real conversations with people may seem like such a simple, obvious suggestion, but it involves courage and risk.",
                "The glue that holds all relationships together--including the relationship between the leader and the led--is trust, and trust is based on integrity.",
                "Trust is like blood pressure. It's silent, vital to good health, and if abused it can be deadly.",
                "Just trust yourself, then you will know how to live.",
                "Better to trust the man who is frequently in error than the one who is never in doubt.",
                "It takes two to do the trust tango--the one who risks (the trustor) and the one who is trustworthy (the trustee); each must play their role.",
                "The leaders who work most effectively, it seems to me, never say 'I.' And that's not because they have trained themselves not to say 'I.' They don't think 'I.' They think 'we'; they think 'team.' They understand their job to be to make the team function. They accept responsibility and don't sidestep it, but 'we' gets the credit.... This is what creates trust, what enables you to get the task done.",
                "Trust is built when someone is vulnerable and not taken advantage of.",
                "The best way to find out if you can trust somebody is to trust them.",
                "If you don't have trust inside your company, then you can't transfer it to your customers.",
                "The people when rightly and fully trusted will return the trust.",
                "Trust is the lubrication that makes it possible for organizations to work.",
                "Trust, but verify.",
                "Trust each other again and again. When the trust level gets high enough, people transcend apparent limits, discovering new and awesome abilities of which they were previously unaware.",
                "People follow leaders by choice. Without trust, at best you get compliance.",
                "When people honor each other, there is a trust established that leads to synergy, interdependence, and deep respect. Both parties make decisions and choices based on what is right, what is best, what is valued most highly.",
                "When a gifted team dedicates itself to unselfish trust and combines instinct with boldness and effort, it is ready to climb.",
                "He who does not trust enough will not be trusted.",
                "Leadership requires five ingredients--brains, energy, determination, trust, and ethics. The key challenges today are in terms of the last two--trust and ethics.",
                "You must trust and believe in people, or life becomes impossible.",
                "Wise men put their trust in ideas and not in circumstances.",
                "Few things help an individual more than to place responsibility upon him, and to let him know that you trust him.",
                "It is mutual trust, even more than mutual interest, that holds human associations together.",
                "When the trust account is high, communication is easy, instant, and effective.",
                "To be trusted is a greater compliment than to be loved.",
                "When mistrust comes in, loves goes out.",
                "Trust is built with consistency.",
                "Whoever is careless with the truth in small matters cannot be trusted with important matters.",

        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView11.setAdapter(listAdapter);
    }
}
*/
