package net.bitcores.fizzbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView)this.findViewById(R.id.output);

        fizzBuzz();
    }


    public void fizzBuzz() {
        String result = "";

        for (int i = 1; i < 101; i++) {
            String line = "";
            if (i % 3 == 0){
                line = "Fizz";
            }
            if (i % 5 == 0) {
                line += "Buzz";
            }
            if (line.length() == 0) {
                line = String.valueOf(i);
            }

            result += line + "\n";
        }

        output.setText(result);
    }


}
