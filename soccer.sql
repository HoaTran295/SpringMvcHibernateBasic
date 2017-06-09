-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE DATABASE mydb ENCODING 'utf8';
\c mydb;

-- -----------------------------------------------------
-- Table leage
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS leage (
  leage_id SERIAL NOT NULL,
  leage_name VARCHAR(45) NULL,
  logo VARCHAR(45) NULL,
  prize INT NULL,
  PRIMARY KEY (leage_id));


-- -----------------------------------------------------
-- Table `mydb`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS team (
  team_id SERIAL NOT NULL,
  team_name VARCHAR(45) NOT NULL,
  numberOfWin INT NULL,
  numberOfLost INT NULL,
  numberOfDraw INT NULL,
  score INT NULL,
  logo VARCHAR(45) NULL,
  leage_leage_id INT NOT NULL,
  PRIMARY KEY (team_id),
  CONSTRAINT fk_team_leage1
    FOREIGN KEY (leage_leage_id)
    REFERENCES leage (leage_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table players
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS players (
  player_id SERIAL NOT NULL,
  team_name VARCHAR(45) NULL,
  name VARCHAR(45) NULL,
  position VARCHAR(45) NULL,
  goal INT NULL,
  photo VARCHAR(45) NULL,
  age INT NULL,
  team_id INT NOT NULL,
  PRIMARY KEY (player_id),
  CONSTRAINT fk_players_team
    FOREIGN KEY (team_id)
    REFERENCES team (team_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `mydb`.`fixture`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS fixture (
  fixture_id SERIAL NOT NULL,
  team1_score INT NULL,
  team2_score INT NULL,
  fixture_date DATE NULL,
  team1_id INT NOT NULL,
  team2_id INT NOT NULL,
  PRIMARY KEY (fixture_id),
  CONSTRAINT fk_fixture_team1
    FOREIGN KEY (team1_id)
    REFERENCES team (team_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_fixture_team2
    FOREIGN KEY (team2_id)
    REFERENCES team (team_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `mydb`.`goal_scored`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS goal_scored (
  goal_id SERIAL NOT NULL,
  goal_time INT NULL,
  player_id INT NOT NULL,
  fixture_id INT NOT NULL,
  PRIMARY KEY (goal_id),
  CONSTRAINT fk_goal_scored_players1
    FOREIGN KEY (player_id)
    REFERENCES players (player_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_goal_scored_fixture1
    FOREIGN KEY (fixture_id)
    REFERENCES fixture (fixture_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `mydb`.`player_match`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS player_match (
  goal_conceeded INT NOT NULL,
  min_played INT NULL,
  yellow_card INT NULL,
  red_card INT NULL,
  fixture_id INT NOT NULL,
  player_id INT NOT NULL,
  CONSTRAINT fk_player_match_fixture1
    FOREIGN KEY (fixture_id)
    REFERENCES fixture (fixture_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_player_match_players1
    FOREIGN KEY (player_id)
    REFERENCES players (player_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


/*create table Person(
	id serial not null,
	name varchar(20) default null,
	country varchar(20) default null,
	primary key (id));*/
	