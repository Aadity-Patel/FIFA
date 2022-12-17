package com.projects.fifaApplication.entity;

import javax.persistence.*;

@Entity
@Table(name="player_stats")
public class PlayerStats {
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
    private String club ;

    @Column
    private int birthYear;

    @Column
    private int games;

    @Column
    private int gamesStarts;

    @Column
    private int minutes;

    @Column
    private double minutes_90s;

    @Column
    private int goals;

    @Column
    private int assists;

    @Column
    private int goalsPens;

    @Column
    private int pensMade;

    @Column
    private int pensAtt;

    @Column
    private int cardsYellow;

    @Column
    private int cardsRed;

    @Column
    private double goalsPer90;

    @Column
    private double assistsPer90;

    @Column
    private double goalsAssistsPer90;

    @Column
    private double goalsPensPer90;

    @Column
    private double goalsAssistsPensPer90;

    @Column
    private double xg;

    @Column
    private double npxg;

    @Column
    private double xgAssist;

    @Column
    private double npxgXgAssist;

    @Column
    private double xgPer90;

    @Column
    private double xgAssistPer90;

    @Column
    private double xgXgAssistPer90;

    @Column
    private double npxgPer90;

    @Column
    private double npxgXgAssistPer90;

    public PlayerStats(){}

    public PlayerStats(Long id, String player, String position, String team, String age, String club, int birthYear, int games, int gamesStarts, int minutes, double minutes_90s, int goals, int assists, int goalsPens, int pensMade, int pensAtt, int cardsYellow, int cardsRed, double goalsPer90, double assistsPer90, double goalsAssistsPer90, double goalsPensPer90, double goalsAssistsPensPer90, double xg, double npxg, double xgAssist, double npxgXgAssist, double xgPer90, double xgAssistPer90, double xgXgAssistPer90, double npxgPer90, double npxgXgAssistPer90) {
        this.id = id;
        this.player = player;
        this.position = position;
        this.team = team;
        this.age = age;
        this.club = club;
        this.birthYear = birthYear;
        this.games = games;
        this.gamesStarts = gamesStarts;
        this.minutes = minutes;
        this.minutes_90s = minutes_90s;
        this.goals = goals;
        this.assists = assists;
        this.goalsPens = goalsPens;
        this.pensMade = pensMade;
        this.pensAtt = pensAtt;
        this.cardsYellow = cardsYellow;
        this.cardsRed = cardsRed;
        this.goalsPer90 = goalsPer90;
        this.assistsPer90 = assistsPer90;
        this.goalsAssistsPer90 = goalsAssistsPer90;
        this.goalsPensPer90 = goalsPensPer90;
        this.goalsAssistsPensPer90 = goalsAssistsPensPer90;
        this.xg = xg;
        this.npxg = npxg;
        this.xgAssist = xgAssist;
        this.npxgXgAssist = npxgXgAssist;
        this.xgPer90 = xgPer90;
        this.xgAssistPer90 = xgAssistPer90;
        this.xgXgAssistPer90 = xgXgAssistPer90;
        this.npxgPer90 = npxgPer90;
        this.npxgXgAssistPer90 = npxgXgAssistPer90;
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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
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

    public int getGamesStarts() {
        return gamesStarts;
    }

    public void setGamesStarts(int gamesStarts) {
        this.gamesStarts = gamesStarts;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public double getMinutes_90s() {
        return minutes_90s;
    }

    public void setMinutes_90s(double minutes_90s) {
        this.minutes_90s = minutes_90s;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGoalsPens() {
        return goalsPens;
    }

    public void setGoalsPens(int goalsPens) {
        this.goalsPens = goalsPens;
    }

    public int getPensMade() {
        return pensMade;
    }

    public void setPensMade(int pensMade) {
        this.pensMade = pensMade;
    }

    public int getPensAtt() {
        return pensAtt;
    }

    public void setPensAtt(int pensAtt) {
        this.pensAtt = pensAtt;
    }

    public int getCardsYellow() {
        return cardsYellow;
    }

    public void setCardsYellow(int cardsYellow) {
        this.cardsYellow = cardsYellow;
    }

    public int getCardsRed() {
        return cardsRed;
    }

    public void setCardsRed(int cardsRed) {
        this.cardsRed = cardsRed;
    }

    public double getGoalsPer90() {
        return goalsPer90;
    }

    public void setGoalsPer90(double goalsPer90) {
        this.goalsPer90 = goalsPer90;
    }

    public double getAssistsPer90() {
        return assistsPer90;
    }

    public void setAssistsPer90(double assistsPer90) {
        this.assistsPer90 = assistsPer90;
    }

    public double getGoalsAssistsPer90() {
        return goalsAssistsPer90;
    }

    public void setGoalsAssistsPer90(double goalsAssistsPer90) {
        this.goalsAssistsPer90 = goalsAssistsPer90;
    }

    public double getGoalsPensPer90() {
        return goalsPensPer90;
    }

    public void setGoalsPensPer90(double goalsPensPer90) {
        this.goalsPensPer90 = goalsPensPer90;
    }

    public double getGoalsAssistsPensPer90() {
        return goalsAssistsPensPer90;
    }

    public void setGoalsAssistsPensPer90(double goalsAssistsPensPer90) {
        this.goalsAssistsPensPer90 = goalsAssistsPensPer90;
    }

    public double getXg() {
        return xg;
    }

    public void setXg(double xg) {
        this.xg = xg;
    }

    public double getNpxg() {
        return npxg;
    }

    public void setNpxg(double npxg) {
        this.npxg = npxg;
    }

    public double getXgAssist() {
        return xgAssist;
    }

    public void setXgAssist(double xgAssist) {
        this.xgAssist = xgAssist;
    }

    public double getNpxgXgAssist() {
        return npxgXgAssist;
    }

    public void setNpxgXgAssist(double npxgXgAssist) {
        this.npxgXgAssist = npxgXgAssist;
    }

    public double getXgPer90() {
        return xgPer90;
    }

    public void setXgPer90(double xgPer90) {
        this.xgPer90 = xgPer90;
    }

    public double getXgAssistPer90() {
        return xgAssistPer90;
    }

    public void setXgAssistPer90(double xgAssistPer90) {
        this.xgAssistPer90 = xgAssistPer90;
    }

    public double getXgXgAssistPer90() {
        return xgXgAssistPer90;
    }

    public void setXgXgAssistPer90(double xgXgAssistPer90) {
        this.xgXgAssistPer90 = xgXgAssistPer90;
    }

    public double getNpxgPer90() {
        return npxgPer90;
    }

    public void setNpxgPer90(double npxgPer90) {
        this.npxgPer90 = npxgPer90;
    }

    public double getNpxgXgAssistPer90() {
        return npxgXgAssistPer90;
    }

    public void setNpxgXgAssistPer90(double npxgXgAssistPer90) {
        this.npxgXgAssistPer90 = npxgXgAssistPer90;
    }
}
