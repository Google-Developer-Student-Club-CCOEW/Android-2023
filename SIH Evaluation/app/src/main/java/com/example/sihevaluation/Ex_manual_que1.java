package com.example.sihevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex_manual_que1 extends AppCompatActivity {
  private EditText ratingEditText;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ext_man_que1);

        // Initialize views
        ratingEditText = findViewById(R.id.ratingEditText);
        nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the user's rating from the EditText
                String ratingString = ratingEditText.getText().toString();

                if (!ratingString.isEmpty()) {
                    // Convert the rating to an integer
                    int rating = Integer.parseInt(ratingString);

                    // Check if the rating is within the valid range (1-10)
                    if (rating >= 1 && rating <= 10) {
                        Intent intent = new Intent(Ex_manual_que1.this, Ex_manual_que2.class);
                        startActivity(intent);
                    } else {
                        // Show an error message if the rating is out of range
                        Toast.makeText(Ex_manual_que1.this, "Please rate from 1 to 10", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Show an error message if the EditText is empty
                    Toast.makeText(Ex_manual_que1.this, "Please enter a rating", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
