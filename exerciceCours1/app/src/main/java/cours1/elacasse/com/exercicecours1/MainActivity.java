package cours1.elacasse.com.exercicecours1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Compare compare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compare = new Compare();
    }

    public void compare(View button){
        EditText editText_nombre1 = findViewById(R.id.editText_nombre1);
        EditText editText_nombre2 = findViewById(R.id.editText_nombre2);

        editText_nombre1.setBackgroundColor(android.R.drawable.editbox_background);
        editText_nombre2.setBackgroundColor(android.R.drawable.editbox_background);

        int firstNumber = Integer.parseInt(editText_nombre1.getText().toString());
        int secondNumber = Integer.parseInt(editText_nombre2.getText().toString());

        Compare.compareState compareState = compare.testNumber(firstNumber, secondNumber);

        switch (compareState){
            case FIRST_BIGGER:
                Toast.makeText(this, "First bigger", Toast.LENGTH_LONG).show();
                editText_nombre1.setBackgroundColor(Color.GREEN);
                break;
            case EQUAL:
                Toast.makeText(this, "Equal", Toast.LENGTH_LONG).show();
                break;
            case SECOND_BIGGER:
                Toast.makeText(this, "Second bigger", Toast.LENGTH_LONG).show();
                editText_nombre2.setBackgroundColor(Color.GREEN);
                break;
        }
    }
}
