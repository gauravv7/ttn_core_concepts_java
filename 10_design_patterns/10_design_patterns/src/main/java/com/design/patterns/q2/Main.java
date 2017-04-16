package com.design.patterns.q2;

import com.design.patterns.q2.displays.AverageScoreDisplay;
import com.design.patterns.q2.displays.CurrentScoreDisplay;

/**
 * Created by gauravv7 on 16/4/17.
 */
public class Main {
    public static void main(String args[]) {
        AverageScoreDisplay averageScoreDisplay =
                new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay =
                new CurrentScoreDisplay();

        CricketData cricketData = new CricketData(currentScoreDisplay,
                averageScoreDisplay);

        cricketData.dataChanged();
    }
}
