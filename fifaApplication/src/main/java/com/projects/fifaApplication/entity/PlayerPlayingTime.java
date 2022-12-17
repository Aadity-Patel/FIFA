package com.projects.fifaApplication.entity;

import javax.persistence.*;

@Entity
@Table
public class PlayerPlayingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String player;

    @Column
    private String position;

    @Column
    private String team ;

    @Column
    private String age ;

    @Column
    private int birthYear;

    @Column
    private int games;

    @Column
    private int minutes;

    @Column
    private int minutesPerGame;

    @Column
    private double minutesPct;

    @Column
    private double minutes90s;

    @Column
    private int gamesStarts;

    @Column
    private int minutesPerStart;

    @Column
    private int gamesComplete;

    @Column
    private int gamesSubs;

    @Column
    private int minutesPerSub;

    @Column
    private int unusedSubs;

    @Column
    private double pointsPerGame;

    @Column
    private int onGoalsFor;

    @Column
    private int onGoalsAgainst;

    @Column
    private int plusMinus;

    @Column
    private double plusMinusPer90;

    @Column
    private double plusMinusWowy;

    @Column
    private double onXgFor;

    @Column
    private double onXgAgainst;

    @Column
    private double xgPlusMinus;

    @Column
    private double xgPlusMinusPer90;

    @Column
    private double xgPlusMinusWowy;

    public PlayerPlayingTime(){}

    public PlayerPlayingTime(Long id, String player, String position, String team, String age, int birthYear, int games, int minutes, int minutesPerGame, double minutesPct, double minutes90s, int gamesStarts, int minutesPerStart, int gamesComplete, int gamesSubs, int minutesPerSub, int unusedSubs, double pointsPerGame, int onGoalsFor, int onGoalsAgainst, int plusMinus, double plusMinusPer90, double plusMinusWowy, double onXgFor, double onXgAgainst, double xgPlusMinus, double xgPlusMinusPer90, double xgPlusMinusWowy) {
        this.id = id;
        this.player = player;
        this.position = position;
        this.team = team;
        this.age = age;
        this.birthYear = birthYear;
        this.games = games;
        this.minutes = minutes;
        this.minutesPerGame = minutesPerGame;
        this.minutesPct = minutesPct;
        this.minutes90s = minutes90s;
        this.gamesStarts = gamesStarts;
        this.minutesPerStart = minutesPerStart;
        this.gamesComplete = gamesComplete;
        this.gamesSubs = gamesSubs;
        this.minutesPerSub = minutesPerSub;
        this.unusedSubs = unusedSubs;
        this.pointsPerGame = pointsPerGame;
        this.onGoalsFor = onGoalsFor;
        this.onGoalsAgainst = onGoalsAgainst;
        this.plusMinus = plusMinus;
        this.plusMinusPer90 = plusMinusPer90;
        this.plusMinusWowy = plusMinusWowy;
        this.onXgFor = onXgFor;
        this.onXgAgainst = onXgAgainst;
        this.xgPlusMinus = xgPlusMinus;
        this.xgPlusMinusPer90 = xgPlusMinusPer90;
        this.xgPlusMinusWowy = xgPlusMinusWowy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutesPerGame() {
        return minutesPerGame;
    }

    public void setMinutesPerGame(int minutesPerGame) {
        this.minutesPerGame = minutesPerGame;
    }

    public double getMinutesPct() {
        return minutesPct;
    }

    public void setMinutesPct(double minutesPct) {
        this.minutesPct = minutesPct;
    }

    public double getMinutes90s() {
        return minutes90s;
    }

    public void setMinutes90s(double minutes90s) {
        this.minutes90s = minutes90s;
    }

    public int getGamesStarts() {
        return gamesStarts;
    }

    public void setGamesStarts(int gamesStarts) {
        this.gamesStarts = gamesStarts;
    }

    public int getMinutesPerStart() {
        return minutesPerStart;
    }

    public void setMinutesPerStart(int minutesPerStart) {
        this.minutesPerStart = minutesPerStart;
    }

    public int getGamesComplete() {
        return gamesComplete;
    }

    public void setGamesComplete(int gamesComplete) {
        this.gamesComplete = gamesComplete;
    }

    public int getGamesSubs() {
        return gamesSubs;
    }

    public void setGamesSubs(int gamesSubs) {
        this.gamesSubs = gamesSubs;
    }

    public int getMinutesPerSub() {
        return minutesPerSub;
    }

    public void setMinutesPerSub(int minutesPerSub) {
        this.minutesPerSub = minutesPerSub;
    }

    public int getUnusedSubs() {
        return unusedSubs;
    }

    public void setUnusedSubs(int unusedSubs) {
        this.unusedSubs = unusedSubs;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public int getOnGoalsFor() {
        return onGoalsFor;
    }

    public void setOnGoalsFor(int onGoalsFor) {
        this.onGoalsFor = onGoalsFor;
    }

    public int getOnGoalsAgainst() {
        return onGoalsAgainst;
    }

    public void setOnGoalsAgainst(int onGoalsAgainst) {
        this.onGoalsAgainst = onGoalsAgainst;
    }

    public int getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(int plusMinus) {
        this.plusMinus = plusMinus;
    }

    public double getPlusMinusPer90() {
        return plusMinusPer90;
    }

    public void setPlusMinusPer90(double plusMinusPer90) {
        this.plusMinusPer90 = plusMinusPer90;
    }

    public double getPlusMinusWowy() {
        return plusMinusWowy;
    }

    public void setPlusMinusWowy(double plusMinusWowy) {
        this.plusMinusWowy = plusMinusWowy;
    }

    public double getOnXgFor() {
        return onXgFor;
    }

    public void setOnXgFor(double onXgFor) {
        this.onXgFor = onXgFor;
    }

    public double getOnXgAgainst() {
        return onXgAgainst;
    }

    public void setOnXgAgainst(double onXgAgainst) {
        this.onXgAgainst = onXgAgainst;
    }

    public double getXgPlusMinus() {
        return xgPlusMinus;
    }

    public void setXgPlusMinus(double xgPlusMinus) {
        this.xgPlusMinus = xgPlusMinus;
    }

    public double getXgPlusMinusPer90() {
        return xgPlusMinusPer90;
    }

    public void setXgPlusMinusPer90(double xgPlusMinusPer90) {
        this.xgPlusMinusPer90 = xgPlusMinusPer90;
    }

    public double getXgPlusMinusWowy() {
        return xgPlusMinusWowy;
    }

    public void setXgPlusMinusWowy(double xgPlusMinusWowy) {
        this.xgPlusMinusWowy = xgPlusMinusWowy;
    }
}
