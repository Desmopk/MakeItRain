package com.example.makeitrain;

import static android.icu.text.NumberFormat.getCurrencyInstance;
import static android.widget.Toast.LENGTH_SHORT;

import android.graphics.Color;
import android.icu.text.NumberFormat;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView rupee;
    private TextView t1;
    private Button rus;
    private Button inf;
    static int m=5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumberFormat num= getCurrencyInstance(Locale.US);
        rupee=findViewById(R.id.money);
        Button moo = findViewById(R.id.mir);
        rus = findViewById(R.id.reson);
        inf = findViewById(R.id.inshow);
        t1 = findViewById(R.id.t1);
        moo.setOnClickListener(view -> {
            m=m+1000;
            rupee.setText(num.format(m));
            if(m%5000==0) {
                Toast.makeText(MainActivity.this, R.string.app_info, Toast.LENGTH_SHORT).show();
              Snackbar ts=  Snackbar.make(t1,R.string.app_tuff,LENGTH_SHORT);
              ts.show();
            if(m==20000)
            {
                rupee.setTextColor(Color.GREEN);
                t1.setTextColor(Color.GREEN);
            }if(m==30000)
            {
                rupee.setTextColor(Color.BLUE);
                t1.setTextColor(Color.BLUE);
            }if(m==40000)
            {
                rupee.setTextColor(Color.MAGENTA);
                t1.setTextColor(Color.MAGENTA);
            }if(m==50000)
            {
                rupee.setTextColor(Color.CYAN);
                Snackbar.make(t1,R.string.kpp1,LENGTH_SHORT).show();
                t1.setTextColor(Color.BLUE);
            }
            }

        });
        rus.setOnClickListener(view ->
        {
            m=5000;
            rupee.setText("$5000");
            t1.setText("");
            rupee.setTextColor(Color.BLACK);

        });
        inf.setOnClickListener(view -> {
            t1.setText("Congratulations!!");

        });

    }

    public void showino(View view) {
        Toast.makeText(MainActivity.this,R.string.app_info, LENGTH_SHORT)
                .show();
    }
}