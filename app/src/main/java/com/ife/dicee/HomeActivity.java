

package com.ife.dicee;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

        import java.util.Random;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);


        Button rollButton;
        rollButton=findViewById(R.id.rollButton);
        final ImageView leftDice=findViewById(R.id.first_die);
        final ImageView rightDice=findViewById(R.id.second_die);
        final int[] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","The button has been pressed");

                Random randNum=new Random();
                int number=randNum.nextInt(6);
                Log.d("Dicee","The random number is: "+ number);
                leftDice.setImageResource(diceArray[number]);

                Random randNum2=new Random();
                number=randNum.nextInt(6);
                Log.d("Dicee","The random number is: "+ number);
                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
