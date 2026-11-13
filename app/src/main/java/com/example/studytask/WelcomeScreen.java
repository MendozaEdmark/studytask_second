package com.example.studytask;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.ImageButton;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_welcome_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // STUDENT BUTTON
        ImageButton studentButton = findViewById(R.id.ibStudent);

        studentButton.setOnClickListener(v -> {
            Intent intent = new Intent(WelcomeScreen.this, student_login_signup.class);
            startActivity(intent);
        });

        // TEACHER BUTTON
        ImageButton teacherButton = findViewById(R.id.ibTeacher);

        teacherButton.setOnClickListener(v -> {
            Intent intent = new Intent(WelcomeScreen.this, primary_screen.class);
            startActivity(intent);
        });
    }
}