package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndex = 1;

    // **** A new string should be made to no to use T1_Ans1 on the T4-T5-T6 ends
    // **** A tree class could be used to retrieve next set.
    private KitStory[] kitStorys = {
            new KitStory(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new KitStory(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new KitStory(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new KitStory(R.string.T4_End, R.string.T1_Ans1, R.string.T1_Ans1, View.GONE),
            new KitStory(R.string.T5_End, R.string.T1_Ans1, R.string.T1_Ans1, View.GONE),
            new KitStory(R.string.T6_End, R.string.T1_Ans1, R.string.T1_Ans1, View.GONE)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1 || mStoryIndex == 2){
                    mStoryIndex = 3;
                }else if(mStoryIndex == 3){
                    mStoryIndex = 6;
                }

                updateScreen();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    mStoryIndex = 2;
                }else if(mStoryIndex == 2){
                    mStoryIndex = 4;
                }else if(mStoryIndex == 3){
                    mStoryIndex = 5;
                }

                updateScreen();
            }
        });

    }

    private void updateScreen(){


        mStoryTextView.setText(kitStorys[mStoryIndex - 1].getStoryText());
        mButtonTop.setText(kitStorys[mStoryIndex - 1].getButtonTop());
        mButtonTop.setVisibility(kitStorys[mStoryIndex - 1].getVisivility());
        mButtonBottom.setText(kitStorys[mStoryIndex - 1].getButtonBottom());
        mButtonBottom.setVisibility(kitStorys[mStoryIndex - 1].getVisivility());
    }

}
