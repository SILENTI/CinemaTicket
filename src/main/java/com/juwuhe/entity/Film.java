package com.juwuhe.entity;


import java.io.Serializable;
import java.util.Date;

public class Film implements Serializable {


    private static final long serialVersionUID = -185559479818448445L;
    private int id;
    private String  film_id;
    private String name;
    private String director;
    private String player;
    private String type;
    private String country;
    private int length;
    private String synopsis;
    private Date play_time;
    private String img_path;

    public Film() {
    }

    public Film(int id, String film_id, String name, String director, String player, String type, String country, int length, String synopsis, Date play_time, String img_path) {
        this.id = id;
        this.film_id = film_id;
        this.name = name;
        this.director = director;
        this.player = player;
        this.type = type;
        this.country = country;
        this.length = length;
        this.synopsis = synopsis;
        this.play_time = play_time;
        this.img_path = img_path;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm_id() {
        return film_id;
    }

    public void setFilm_id(String film_id) {
        this.film_id = film_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getPlay_time() {
        return play_time;
    }

    public void setPlay_time(Date play_time) {
        this.play_time = play_time;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }
}
