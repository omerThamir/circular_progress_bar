package com.omar.myapps.circularprogressbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView totalNumTextView;
    int totalNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        totalNumTextView = findViewById(R.id.totalNumbertextView);

        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pregressvalue = progressBar.getProgress();
                if (pregressvalue == progressBar.getMax()) {
                    pregressvalue = 0;
                    progressBar.setProgress(pregressvalue + 1);
                    totalNumTextView.setText(String.valueOf(totalNumber += 1));
                } else {
                    progressBar.setProgress(pregressvalue + 1);
                    totalNumTextView.setText(String.valueOf(totalNumber += 1));
                }
            }
        });
    }
}
