package com.juwuhe.vo;

import java.util.Date;

public class FilmInfoVo {

    /**
     * 用于展示单个影片的详细信息
     * */

    private String filmId;
    private String name;
    private String director;
    private String player;
    private String type;
    private String country;
    private int length;
    private String synopsis;
    private Date playTime;
    private String imgPath;

    public FilmInfoVo() {
    }

    public FilmInfoVo(String filmId, String name, String director, String player, String type, String country, int length, String synopsis, Date playTime, String imgPath) {
        this.filmId = filmId;
        this.name = name;
        this.director = director;
        this.player = player;
        this.type = type;
        this.country = country;
        this.length = length;
        this.synopsis = synopsis;
        this.playTime = playTime;
        this.imgPath = imgPath;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
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

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
