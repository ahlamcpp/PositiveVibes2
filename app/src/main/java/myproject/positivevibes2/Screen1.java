package myproject.positivevibes2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

    Button but9 = (Button) findViewById(R.id.button9);
    Button but10 = (Button) findViewById(R.id.button10);
    Button but11 = (Button) findViewById(R.id.button11);
    Button but12 = (Button) findViewById(R.id.button12);
    Button but13 = (Button) findViewById(R.id.button13);
    Button but14 = (Button) findViewById(R.id.button14);
    Button but15 = (Button) findViewById(R.id.button15);
    Button but16 = (Button) findViewById(R.id.button16);
    Button but17 = (Button) findViewById(R.id.button17);
    Button but18 = (Button) findViewById(R.id.button18);
    Button but19 = (Button) findViewById(R.id.button19);
    Button but20 = (Button) findViewById(R.id.button20);
    Button but21 = (Button) findViewById(R.id.button21);
    Button but22 = (Button) findViewById(R.id.button22);


    but9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent int9 = new Intent(Screen1.this,Screen2.class);
            startActivity(int9);

        }
    });

        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int10 = new Intent(Screen1.this,BePositive.class);
                startActivity(int10);

            }
        });

        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int11 = new Intent(Screen1.this,Smile.class);
                startActivity(int11);

            }
        });

        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int12 = new Intent(Screen1.this,MoreSuccessful.class);
                startActivity(int12);

            }
        });

        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int13 = new Intent(Screen1.this,Love.class);
                startActivity(int13);

            }
        });

        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int14 = new Intent(Screen1.this,StayStrong.class);
                startActivity(int14);

            }
        });

        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int15 = new Intent(Screen1.this,Faith.class);
                startActivity(int15);

            }
        });

        but16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int16 = new Intent(Screen1.this,inspiration.class);
                startActivity(int16);

            }
        });

        but17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int17 = new Intent(Screen1.this,Honesty.class);
                startActivity(int17);

            }
        });

        but18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int18 = new Intent(Screen1.this,Pleased.class);
                startActivity(int18);

            }
        });

        but19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int19 = new Intent(Screen1.this,Trust.class);
                startActivity(int19);

            }
        });

        but20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int20 = new Intent(Screen1.this,Hope.class);
                startActivity(int20);

            }
        });

        but21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int21 = new Intent(Screen1.this,Forgiveness.class);
                startActivity(int21);

            }
        });

        but22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int22 = new Intent(Screen1.this,DontGiveUp.class);
                startActivity(int22);

            }
        });


    }


}
