package com.hoa.leage.Model;

import javax.persistence.*;

@Entity
@Table(name = "player_match")
public class PlayerMatch {
    @Column(name = "goal_conceeded")
    private int goalConceeded;

    @Column(name = "min_played")
    private int minPlayed;

    @Column(name = "yellow_card")
    private int yellowCard;

    @Column(name = "red_card")
    private int redCard;

    @ManyToOne
    @JoinColumn(name = "fixture_id")
    private int fixtureId;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private int playereId;

    public int getGoalConceeded() {
        return goalConceeded;
    }

    public void setGoalConceeded(int goalConceeded) {
        this.goalConceeded = goalConceeded;
    }

    public int getMinPlayed() {
        return minPlayed;
    }

    public void setMinPlayed(int minPlayed) {
        this.minPlayed = minPlayed;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }

    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    public int getPlayereId() {
        return playereId;
    }

    public void setPlayereId(int playereId) {
        this.playereId = playereId;
    }
}
