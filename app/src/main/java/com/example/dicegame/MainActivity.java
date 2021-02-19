package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        we have two images left dice and right dice
        ImageView topDice = findViewById(R.id.top_dice);
        ImageView bottomDice = findViewById(R.id.bottom_dice);
        Button rollHigherButton = findViewById(R.id.higher_btn_roll);
        Button rollLowerButton = findViewById(R.id.lower_btn_roll);
        TextView winnerString = findViewById(R.id.winner_string);
        int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
//    click on higher button
        rollHigherButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randTopDie = rand.nextInt(6);
                int randBottomDie = rand.nextInt(6);
                Log.d("left die", String.valueOf(randTopDie));
                Log.d("right die", String.valueOf(randBottomDie));
                if(randTopDie > randBottomDie){
                    Log.d("Higher Button", "Computer Won");
                    winnerString.setText("Result: Computer Won");
                }else if(randTopDie == randBottomDie){
                    Log.d("Higher Button", "Tie");
                    winnerString.setText("Result: Tie");
                }else{
                    Log.d("Higher Button", "User Won");
                    winnerString.setText("Result: User Won");
                }
                topDice.setImageResource(diceArray[randTopDie]);
                bottomDice.setImageResource(diceArray[randBottomDie]);
            }
        });
//        click on lower button
        rollLowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randTopDie = rand.nextInt(6);
                int randBottomDie = rand.nextInt(6);
                Log.d("left die", String.valueOf(randTopDie));
                Log.d("right die", String.valueOf(randBottomDie));
                if(randTopDie > randBottomDie){
                    Log.d("Higher Button", "User Won");
                    winnerString.setText("Result: User Won");
                }else if(randTopDie == randBottomDie){
                    Log.d("Higher Button", "Tie");
                    winnerString.setText("Result: Tie");
                }else{
                    Log.d("Higher Button", "Computer Won");
                    winnerString.setText("Result: Computer Won");
                }
                topDice.setImageResource(diceArray[randTopDie]);
                bottomDice.setImageResource(diceArray[randBottomDie]);
            }
        });
    }
}