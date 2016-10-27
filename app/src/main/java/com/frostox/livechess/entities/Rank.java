package com.frostox.livechess.entities;

/**
 * Created by roger on 10/27/2016.
 */
public class Rank {

    private Integer rank;

    private String name;

    private String fed;

    private Integer rtg;

    private Float pts;

    public Rank(Float pts, Integer rtg, Integer rank, String name, String fed) {
        this.pts = pts;
        this.rtg = rtg;
        this.rank = rank;
        this.name = name;
        this.fed = fed;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFed() {
        return fed;
    }

    public void setFed(String fed) {
        this.fed = fed;
    }

    public Integer getRtg() {
        return rtg;
    }

    public void setRtg(Integer rtg) {
        this.rtg = rtg;
    }

    public Float getPts() {
        return pts;
    }

    public void setPts(Float pts) {
        this.pts = pts;
    }
}
