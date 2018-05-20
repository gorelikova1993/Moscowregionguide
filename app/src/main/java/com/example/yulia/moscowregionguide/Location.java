package com.example.yulia.moscowregionguide;

public class Location {
    public String lName;
    public String lInfo;
    public String lSite;
    public String lGeo;
    public int lPhoto;

    public Location(String name, String info, String site, String geo, int photo) {
        this.lName = name;
        this.lInfo = info;
        this.lSite = site;
        this.lGeo = geo;
        this.lPhoto = photo;
    }

    public String getlName() {
        return lName;
    }

    public String getlInfo() {
        return lInfo;
    }

    public String getlGeo() {
        return lGeo;
    }

    public String getlSite() {
        return lSite;
    }

    public int getlPhoto() {
        return lPhoto;
    }
}
