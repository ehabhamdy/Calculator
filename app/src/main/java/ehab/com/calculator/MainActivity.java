package ehab.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean isInMiddleOfInput = false;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);

    }

    public void digitClicked(View v){

        if(isInMiddleOfInput)
            display.append(((Button)v).getText());
        else {
            display.setText(((Button) v).getText());
            isInMiddleOfInput = true;
        }

        Toast.makeText(this, ((Button)v).getText(), Toast.LENGTH_SHORT).show();
    }
}
