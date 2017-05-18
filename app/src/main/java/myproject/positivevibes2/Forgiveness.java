package myproject.positivevibes2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Forgiveness extends AppCompatActivity {


    private ListView mainListView13;
    private ArrayAdapter<String> listAdapter;







    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgiveness);

        // Find the ListView resource.
        mainListView13 = (ListView) findViewById(R.id.mainListView13);

        // Create and populate a List of posVibes names.
        String[] posVibes = new String[]{
                "There is no love without forgiveness, and there is no forgiveness without love.",

                "A happy marriage is the union of two good forgivers.",

                "Forgiveness is me giving up my right to hurt you for hurting me.",

                "Sincere forgiveness isn't colored with expectations that the other person apologize or change. Don't worry whether or not they finally understand you. Love them and release them. Life feeds back truth to people in its own way and time-just like it does for you and me.",

                "Once a woman has forgiven her man, she must not reheat his sins for breakfast.",

                "Forgiveness is the giving, and so the receiving, of life.",

                "To forgive is to set a prisoner free and discover that the prisoner was you.",

                "We are all on a life long journey and the core of its meaning, the terrible demand of its centrality is forgiving and being forgiven.",

                "To forgive is the highest, most beautiful form of love. In return, you will receive untold peace and happiness.",

                "Forgiveness is the fragrance the violet sheds on the heel that has crushed it.",

                "Always forgive your enemies - nothing annoys them so much.",

                "The weak can never forgive. Forgiveness is the attribute of the strong.",

                "Forgiveness is a funny thing. It warms the heart and cools the sting.",

                "Forgiveness does not change the past, but it does enlarge the future.",

                "It is easier to forgive an enemy than to forgive a friend.",

                "If you can't forgive and forget, pick one.",

                "He who cannot forgive breaks the bridge over which he himself must pass.",

                "Without forgiveness life is governed by... an endless cycle of resentment and retaliation.",

                "Forgive all who have offended you, not for them, but for yourself.",

                "Forgiveness is the sweetest revenge.",

                "Forgiving does not erase the bitter past. A healed memory is not a deleted memory. Instead, forgiving what we cannot forget creates a new way to remember. We change the memory of our past into a hope for our future.",

                "Life is an adventure in forgiveness.",

                "Forgiveness is the key to action and freedom.",

                "Forgiveness is a virtue of the brave.",

                "Genuine forgiveness does not deny anger but faces it head-on.",

                "As long as you don't forgive, who and whatever it is will occupy a rent-free space in your mind.",

                "Anger makes you smaller, while forgiveness forces you to grow beyond what you were.",

                "Forgiveness is like faith. You have to keep reviving it.",

                "Only the brave know how to forgive. ... A coward never forgave; it is not in his nature.",

        };

        ArrayList<String> posVibesList = new ArrayList<String>();
        posVibesList.addAll(Arrays.asList(posVibes));

        // Create ArrayAdapter using the posVibes list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.screen1_row, posVibesList);

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView13.setAdapter(listAdapter);
    }
}
