package xyz.scottz.timedilation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // calculate button
        Button b1=(Button)findViewById(R.id.calc);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText speedField = (EditText)findViewById(R.id.speed);
                double speed = Double.valueOf(speedField.getText().toString()) ;
                final double c = 300000000 ;
                EditText travelTimeField = (EditText)findViewById(R.id.travelTime);
                double travelTime = Double.valueOf(travelTimeField.getText().toString()) ;

                double DilatedTime = travelTime/(Math.sqrt(1- speed/c*speed/c));
                TextView result = (TextView) findViewById(R.id.result);
                result.setText(String.format("%,25.15f" , DilatedTime));

                BigDecimal speed1 ;

            }
        });

    }
}
