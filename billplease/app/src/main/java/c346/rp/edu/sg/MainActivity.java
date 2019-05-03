package c346.rp.edu.sg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
EditText bill;
EditText people;
ToggleButton gst;
ToggleButton sc;
TextView total;
TextView avg;
Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bill = findViewById(R.id.editText2);
        people = findViewById(R.id.editText5);
        gst = findViewById(R.id.toggleButton5);
        sc = findViewById(R.id.toggleButton4);
        total = findViewById(R.id.textView9);
        avg = findViewById(R.id.textView10);
        but = findViewById(R.id.button);

        but.setOnClickListener(new View.OnClickListener(){


            public void onClick(View view) {
                String billInput = bill.getText().toString();
                double billamt = Double.parseDouble(billInput);
                String ppl = people.getText().toString();
                int ppl_num = Integer.parseInt(ppl);
                if(sc.isChecked()){
                    billamt += billamt*0.1;
                }
                if(gst.isChecked()){
                    billamt += billamt*0.07;
                }

                total.setText("Total bill - "+billamt);
                avg.setText("Average bill - "+(billamt/ppl_num));
            }

        });
    }
}
