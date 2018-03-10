package uk.ac.napier.a40315076.interactivestory;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn1 = findViewById(R.id.storyStart);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent int1 = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(int1);
            }
        });
    }
}
