package com.hoa.leage.Model;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @Column(name = "player_id")
    private int id;

    @Column(name = "team_name")
    private String name;

    @Column(name = "position")
    private String position;

    @Column(name = "goal")
    private int goal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private int teamId;

}
