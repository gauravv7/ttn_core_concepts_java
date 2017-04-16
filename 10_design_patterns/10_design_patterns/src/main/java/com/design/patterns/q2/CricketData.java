package com.design.patterns.q2;

import com.design.patterns.q2.displays.AverageScoreDisplay;
import com.design.patterns.q2.displays.CurrentScoreDisplay;

/**
 * Created by gauravv7 on 16/4/17.
 */
class CricketData
{
    private int runs;
    private int wickets;
    private float overs;
    private CurrentScoreDisplay currentScoreDisplay;
    private AverageScoreDisplay averageScoreDisplay;

    public CricketData(CurrentScoreDisplay currentScoreDisplay,
                       AverageScoreDisplay averageScoreDisplay)
    {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
    }

    private int getLatestRuns() {
        return 90;
    }

    private int getLatestWickets() {
        return 2;
    }

    private float getLatestOvers() {
        return (float)10.2;
    }

    public void dataChanged() {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentScoreDisplay.update(runs,wickets,overs);
        averageScoreDisplay.update(runs,wickets,overs);
    }
}