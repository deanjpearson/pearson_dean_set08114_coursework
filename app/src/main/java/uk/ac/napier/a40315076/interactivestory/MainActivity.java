package uk.ac.napier.a40315076.interactivestory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    private TextView mStoryContent;
    private Button FirstChoiceBtn;
    private Button SecondChoiceBtn;
    private int StoryPoint = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryContent = findViewById(R.id.StoryContent);
        FirstChoiceBtn = findViewById(R.id.buttonTop);
        SecondChoiceBtn = findViewById(R.id.buttonBottom);

        FirstChoiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (StoryPoint == 1 || StoryPoint == 2){
                    mStoryContent.setText(R.string.S3_Story);
                    FirstChoiceBtn.setText(R.string.S3_Choice1);
                    SecondChoiceBtn.setText(R.string.S3_Choice2);
                    StoryPoint = 3;
                } else {
                    mStoryContent.setText(R.string.S6_Finish);
                    FirstChoiceBtn.setVisibility(View.GONE);
                    SecondChoiceBtn.setVisibility(View.GONE);
                }
            }
        });

        SecondChoiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (StoryPoint == 1) {
                    mStoryContent.setText(R.string.S2_Story);
                    FirstChoiceBtn.setText(R.string.S2_Choice1);
                    SecondChoiceBtn.setText(R.string.S2_Choice2);
                    StoryPoint = 2;
                } else if (StoryPoint == 2) {
                    mStoryContent.setText(R.string.S4_Finish);
                    FirstChoiceBtn.setVisibility(View.GONE);
                    SecondChoiceBtn.setVisibility(View.GONE);
                } else if ( StoryPoint == 3) {
                    mStoryContent.setText(R.string.S5_Finish);
                    FirstChoiceBtn.setVisibility(View.GONE);
                    SecondChoiceBtn.setVisibility(View.GONE);
                }
            }
        });


    }
}
