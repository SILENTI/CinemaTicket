package com.juwuhe.vo;

public class FilmVo {

    /**
     * 视图展示的对象
     * */
    private String filmId;
    private String name;
    private String director;
    private String imgPath;

    public FilmVo() {
    }

    public FilmVo(String filmId, String name, String director, String imgPath) {
        this.filmId = filmId;
        this.name = name;
        this.director = director;
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

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
