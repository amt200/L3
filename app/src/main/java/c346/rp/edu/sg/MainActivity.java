package c346.rp.edu.sg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
TextView tvDisplay;
Button btnDisplay;
EditText etInput;
ToggleButton tbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        btnDisplay.setOnClickListener(new View.OnClickListener(){


        public void onClick(View view) {
            String stringResponse = etInput.getText().toString();
            tvDisplay.setText(stringResponse);
            if(tbtn.isChecked()){
                etInput.setEnabled(true);
            }
            else{
                etInput.setEnabled(false);
            }
        }
        });
    }
}
