package myproject.positivevibes2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.Arrays;



public class Screen2 extends AppCompatActivity {


    private ListView mainListView;
    private ArrayAdapter<String> listAdapter;







    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        // Find the ListView resource.
        mainListView = (ListView) findViewById(R.id.mainListView);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"Be Happy", "Be Positive", "Smile", "More Successful",
                "Love", "Stay Strong", "Faith", "Inspiration", "Honest", "Pleased", "Trust"};
        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Add more posVibes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.

        listAdapter.add("Hope");
        listAdapter.add("Forgiveness");
        listAdapter.add("Life Is Good");
        listAdapter.add("Don't Give Up");

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter(listAdapter);
    }
}
