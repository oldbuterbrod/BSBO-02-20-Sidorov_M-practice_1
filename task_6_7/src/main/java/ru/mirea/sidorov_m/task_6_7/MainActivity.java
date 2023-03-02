package ru.mirea.sidorov_m.task_6_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textView);
        CheckBox box = (CheckBox) findViewById(R.id.checkBox);
        Button bn = (Button) findViewById(R.id.button);


        View.OnClickListener clicked = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Jim Halpert!!!");
                box.setChecked(false);
            }
        };

        bn.setOnClickListener(clicked);
    }

    public void onclick (View view ) {
        Toast.makeText(this, "МАЙКЛ!!!", Toast.LENGTH_SHORT).show();
        CheckBox box = (CheckBox) findViewById(R.id.checkBox);
        box.setChecked(true);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Дандер Мифлин, это Пэм");
    }
}