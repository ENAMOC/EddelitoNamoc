
package com.example.namoc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnHello = findViewById(R.id.btnHello);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnClick(v);
            }
        });
    }

    public void onBtnClick(View view) {
        TextView messageShow = findViewById(R.id.messageShow);
        EditText fullName = findViewById(R.id.fullName);

        String fullNameShow = "Hello!!! " + fullName.getText().toString();

        messageShow.setText(fullNameShow);
    }
}
