package com.hoa.leage.Model;

import javax.persistence.*;

@Entity
@Table(name = "goal_scored")
public class GoalScored {
    @Id
    @Column(name = "goal_id")
    private int id;

    @Column(name = "goal_time")
    private int goalTime;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private int playerId;

    @ManyToOne
    @JoinColumn(name = "fixture_id")
    private int fixtureId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoalTime() {
        return goalTime;
    }

    public void setGoalTime(int goalTime) {
        this.goalTime = goalTime;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }
}
