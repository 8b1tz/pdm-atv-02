package com.example.exercicio_02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        ProgressBar progressBar= findViewById(R.id.progressBar4);
        TextView text = findViewById(R.id.textView);

        button.setOnClickListener(view -> {
            progressBar.setProgress(progressBar.getProgress() + 5);
            if (progressBar.getProgress() == 50){
                text.setText("NÃO DESISTA, VOCÊ ESTÁ QUASE LÁ!");
            }
            else if(progressBar.getProgress() == 100){
                progressBar.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                text.setText("PARABÉNS, VOCÊ ENCHEU O PROGRESSO!");
            }
        });
    }
}