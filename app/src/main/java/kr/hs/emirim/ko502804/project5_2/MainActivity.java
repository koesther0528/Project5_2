package kr.hs.emirim.ko502804.project5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button[] btnNums = new Button[0];
        for(int i =0; i<btnNums.length; i ++){
            btnNums[i] = findViewById(i);
        }
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
    }
}