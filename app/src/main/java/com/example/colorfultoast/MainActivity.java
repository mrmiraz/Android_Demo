package com.example.colorfultoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCustomToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCustomToast= (Button) findViewById(R.id.btnCustomToast);
        btnCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Find custom toast example layout file
                View layoutValue = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_toast_layout, null);
                TextView vie = layoutValue.findViewById(R.id.custom_toast_message);
                vie.setText("miraz dhelo");
                // Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                // gravity, xOffset, yOffset
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layoutValue);//setting the view of custom toast layout
                toast.show();
            }
        });
    }
}