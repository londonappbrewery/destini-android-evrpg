package com.londonappbrewery.destini;

import android.view.View;

/**
 * Created by evrpg on 25/03/18.
 */

public class KitStory {
    private int mStoryText;
    private int mButtonTop;
    private int mButtonBottom;
    private int mVisivility;

    public KitStory(int storyText, int buttonTop, int buttonBottom, int visivility) {
        mStoryText = storyText;
        mButtonTop = buttonTop;
        mButtonBottom = buttonBottom;
        mVisivility = visivility;
    }

    public KitStory(int storyText, int buttonTop, int buttonBottom) {
        mStoryText = storyText;
        mButtonTop = buttonTop;
        mButtonBottom = buttonBottom;
        mVisivility = View.VISIBLE;
    }

    public int getStoryText() {
        return mStoryText;
    }

    public void setStoryText(int storyText) {
        mStoryText = storyText;
    }

    public int getButtonTop() {
        return mButtonTop;
    }

    public void setButtonTop(int buttonTop) {
        mButtonTop = buttonTop;
    }

    public int getButtonBottom() {
        return mButtonBottom;
    }

    public void setButtonBottom(int buttonBottom) {
        mButtonBottom = buttonBottom;
    }

    public int getVisivility() {
        return mVisivility;
    }

    public void setVisivility(int visivility) {
        mVisivility = visivility;
    }
}
