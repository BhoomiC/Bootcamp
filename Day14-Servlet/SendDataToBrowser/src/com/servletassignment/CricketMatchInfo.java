package com.servletassignment;

public class CricketMatchInfo {
    private String winningCountry;
    private String losingCountry;
    private int score;
    private String matchType;
    private String matchLocation;

    public String getWinningCountry() {
        return winningCountry;
    }

    public String getLosingCountry() {
        return losingCountry;
    }

    public int getScore() {
        return score;
    }

    public String getMatchType() {
        return matchType;
    }

    public String getMatchLocation() {
        return matchLocation;
    }

    public CricketMatchInfo(String winningCountry, String losingCountry, int score, String matchType, String matchLocation) {
        this.winningCountry = winningCountry;
        this.losingCountry = losingCountry;
        this.score = score;
        this.matchType = matchType;
        this.matchLocation = matchLocation;

    }
}
