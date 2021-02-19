package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        we have two images left dice and right dice
        ImageView leftDice = findViewById(R.id.left_dice);
        ImageView rightDice = findViewById(R.id.right_dice);
        Button rollButton = findViewById(R.id.roll_button);
        int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
//    we want to pick random value from array and replace it with left and right view
        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Random rand = new Random();
                int randLeftDie = rand.nextInt(6);
                int randRightDie = rand.nextInt(6);
                Log.d("left die", String.valueOf(randLeftDie));
                Log.d("right die", String.valueOf(randRightDie));
                leftDice.setImageResource(diceArray[randLeftDie]);
                rightDice.setImageResource(diceArray[randRightDie]);
            }
        });

    }
}