package com.projects.fifaApplication.entity;

import javax.persistence.*;

@Entity
@Table(name="player-defence")
public class PlayerDefence {
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
    private double minutes_90s;

    @Column
    private int tackles;

    @Column
    private int tacklesWon;

    @Column
    private int tacklesDef_3rd;

    @Column
    private int tacklesMid_3rd;

    @Column
    private int tacklesAtt_3rd;

    @Column
    private int dribbleTackles;

    @Column
    private int dribblesVs;

    @Column
    private double dribbleTacklesPct;

    @Column
    private int dribbledPast;

    @Column
    private int blocks;

    @Column
    private int blockedShots;

    @Column
    private int blockedPasses;

    @Column
    private int interceptions;

    @Column
    private int tacklesInterceptions;

    @Column
    private int clearances;

    @Column
    private int errors;

    public PlayerDefence(){}

    public PlayerDefence(Long id, String player, String position, String team, String age, int birthYear, double minutes_90s, int tackles, int tacklesWon, int tacklesDef_3rd, int tacklesMid_3rd, int tacklesAtt_3rd, int dribbleTackles, int dribblesVs, double dribbleTacklesPct, int dribbledPast, int blocks, int blockedShots, int blockedPasses, int interceptions, int tacklesInterceptions, int clearances, int errors) {
        this.id = id;
        this.player = player;
        this.position = position;
        this.team = team;
        this.age = age;
        this.birthYear = birthYear;
        this.minutes_90s = minutes_90s;
        this.tackles = tackles;
        this.tacklesWon = tacklesWon;
        this.tacklesDef_3rd = tacklesDef_3rd;
        this.tacklesMid_3rd = tacklesMid_3rd;
        this.tacklesAtt_3rd = tacklesAtt_3rd;
        this.dribbleTackles = dribbleTackles;
        this.dribblesVs = dribblesVs;
        this.dribbleTacklesPct = dribbleTacklesPct;
        this.dribbledPast = dribbledPast;
        this.blocks = blocks;
        this.blockedShots = blockedShots;
        this.blockedPasses = blockedPasses;
        this.interceptions = interceptions;
        this.tacklesInterceptions = tacklesInterceptions;
        this.clearances = clearances;
        this.errors = errors;
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

    public double getMinutes_90s() {
        return minutes_90s;
    }

    public void setMinutes_90s(double minutes_90s) {
        this.minutes_90s = minutes_90s;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public int getTacklesWon() {
        return tacklesWon;
    }

    public void setTacklesWon(int tacklesWon) {
        this.tacklesWon = tacklesWon;
    }

    public int getTacklesDef_3rd() {
        return tacklesDef_3rd;
    }

    public void setTacklesDef_3rd(int tacklesDef_3rd) {
        this.tacklesDef_3rd = tacklesDef_3rd;
    }

    public int getTacklesMid_3rd() {
        return tacklesMid_3rd;
    }

    public void setTacklesMid_3rd(int tacklesMid_3rd) {
        this.tacklesMid_3rd = tacklesMid_3rd;
    }

    public int getTacklesAtt_3rd() {
        return tacklesAtt_3rd;
    }

    public void setTacklesAtt_3rd(int tacklesAtt_3rd) {
        this.tacklesAtt_3rd = tacklesAtt_3rd;
    }

    public int getDribbleTackles() {
        return dribbleTackles;
    }

    public void setDribbleTackles(int dribbleTackles) {
        this.dribbleTackles = dribbleTackles;
    }

    public int getDribblesVs() {
        return dribblesVs;
    }

    public void setDribblesVs(int dribblesVs) {
        this.dribblesVs = dribblesVs;
    }

    public double getDribbleTacklesPct() {
        return dribbleTacklesPct;
    }

    public void setDribbleTacklesPct(double dribbleTacklesPct) {
        this.dribbleTacklesPct = dribbleTacklesPct;
    }

    public int getDribbledPast() {
        return dribbledPast;
    }

    public void setDribbledPast(int dribbledPast) {
        this.dribbledPast = dribbledPast;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getBlockedShots() {
        return blockedShots;
    }

    public void setBlockedShots(int blockedShots) {
        this.blockedShots = blockedShots;
    }

    public int getBlockedPasses() {
        return blockedPasses;
    }

    public void setBlockedPasses(int blockedPasses) {
        this.blockedPasses = blockedPasses;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getTacklesInterceptions() {
        return tacklesInterceptions;
    }

    public void setTacklesInterceptions(int tacklesInterceptions) {
        this.tacklesInterceptions = tacklesInterceptions;
    }

    public int getClearances() {
        return clearances;
    }

    public void setClearances(int clearances) {
        this.clearances = clearances;
    }

    public int getErrors() {
        return errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }
}
