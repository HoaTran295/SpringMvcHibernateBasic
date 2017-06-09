package com.hoa.leage.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fixture")
public class Fixture {

    @Id
    @Column(name = "fixture_id")
    private int id;

    @Column(name = "team1_score")
    private int team1Score;

    @Column(name = "team2_score")
    private int team2Score;

    @Column(name = "fixture_date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "team1_id")
    private int team1Id;

    @ManyToOne
    @JoinColumn(name = "team2_id")
    private int team2Id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(int team1Id) {
        this.team1Id = team1Id;
    }

    public int getTeam2Id() {
        return team2Id;
    }

    public void setTeam2Id(int team2Id) {
        this.team2Id = team2Id;
    }
}
