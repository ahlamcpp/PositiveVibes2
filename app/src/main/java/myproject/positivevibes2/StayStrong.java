package myproject.positivevibes2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class StayStrong extends AppCompatActivity {


    private ListView mainListView6;
    private ArrayAdapter<String> listAdapter;







    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay_strong);

        // Find the ListView resource.
        mainListView6 = (ListView) findViewById(R.id.mainListView6);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"The strongest people find the courage and caring to help others, even if they are going through their own storm",
                "If you build the guts to do something, anything, then you better save enough to face the consequences.",
                "The one who falls and gets up is stronger than the one who never tried. Do not fear failure but rather fear not trying",
                "Stay strong, stay positive, and never give up",
                "So he tasted the deep pain that is reserved only for the strong, just as he had tasted for a little while the deep happiness.",
                "Always do what you're afraid to do. ",
                "Every challenge you face today makes you stronger tomorrow. The challenge of life is intended to make you better, not bitter",
                "I feel like myself, strong and weak at once - allowed, at least for a little while, to be both.",
                "That is the rule of the Wilds: You must be bigger and stronger and tougher. You must hurt or be hurt.",
                "Strong people don't put others down... They lift them up.",
                "They wore their strange beauty like war paint",
                "The weak fall, but the strong will remain and never go under!",
                "I’d never been a good damsel in distress. I was a 'hands-on' damsel.",
                "A strong gives forgiveness but weak gives permission.",
                "People seem weak, but they're strong. They seem strong, but they're weak.",
                "On the left side of a strong woman, stands a strong man; he is strengthened by her character",
                "The hollowness was in his arms and the world was snowing.",





        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Add more posVibes. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.

        listAdapter.add("But we are strong, each in our purpose, and we are all more strong together.");
        listAdapter.add("Stay strong, stay positive, and never give up.");
        listAdapter.add("I miss the smell of him. I miss his lips and his strong arms. I miss him.");


        // Set the ArrayAdapter as the ListView's adapter.
        mainListView6.setAdapter(listAdapter);
    }
}
