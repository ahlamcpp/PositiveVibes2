package myproject.positivevibes2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class BeHappy extends AppCompatActivity {


    private ListView mainListView1;
    private ArrayAdapter<String> listAdapter;







    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_happy);

        // Find the ListView resource.
        mainListView1 = (ListView) findViewById(R.id.mainListView1);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{"I just find myself happy with the simple things. Appreciating the blessings God gave me.",
                "Learn to enjoy every minute of your life. Be happy now. Don't wait for something outside of yourself to make you happy in the future.",
                " Happiness is a choice. You can choose to be happy. There's going to be stress in life, but it's your choice whether you let it affect you or not.",
                "Think of all the beauty still left around you and be happy.",
                " It's easy to impress me. I don't need a fancy party to be happy. Just good friends, good food, and good laughs. I'm happy. I'm satisfied. I'm content.",
                "Let us be grateful to people who make us happy, they are the charming gardeners who make our souls blossom.",
                "There are lots of people I admire and respect, but I don't necessarily want to be like them. I'm too happy being myself.",
                "Life is like a roller coaster, live it, be happy, enjoy life.",
                " The word 'happy' would lose its meaning if it were not balanced by sadness.",
                " Whoever is happy will make others happy too.",
                "I have had a happy life and thank the Lord. Goodbye and may God bless all.",
                "There is only one happiness in this life, to love and be loved.",
                "Happiness is when what you think, what you say, and what you do are in harmony.",
                "The measure of success is happiness and peace of mind.",
                "The true secret of happiness lies in taking a genuine interest in all the details of daily life.",
                "Happiness lies in the joy of achievement and the thrill of creative effort.",
                "For happiness one needs security, but joy can spring like a flower even from the cliffs of despair.",
                "Caring about others, running the risk of feeling, and leaving an impact on people, brings happiness.",
                " Fashion is all about happiness. It's fun. It's important. But it's not medicine.",
                "They must often change, who would be constant in happiness or wisdom.",
                " Happiness is a thing to be practiced, like the violin.",



        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);


        // Set the ArrayAdapter as the ListView's adapter.
        mainListView1.setAdapter(listAdapter);
    }
}
