package com.example.videoapiproject.VideoModel;

public class Hits
{
    private int id;

    private String pageURL;

    private String type;

    private String tags;

    private int duration;

    private String picture_id;

    private Videos videos;

    private int views;

    private int downloads;

    private int favorites;

    private int likes;

    private int comments;

    private int user_id;

    private String user;

    private String userImageURL;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setPageURL(String pageURL){
        this.pageURL = pageURL;
    }
    public String getPageURL(){
        return this.pageURL;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setTags(String tags){
        this.tags = tags;
    }
    public String getTags(){
        return this.tags;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return this.duration;
    }
    public void setPicture_id(String picture_id){
        this.picture_id = picture_id;
    }
    public String getPicture_id(){
        return this.picture_id;
    }
    public void setVideos(Videos videos){
        this.videos = videos;
    }
    public Videos getVideos(){
        return this.videos;
    }
    public void setViews(int views){
        this.views = views;
    }
    public int getViews(){
        return this.views;
    }
    public void setDownloads(int downloads){
        this.downloads = downloads;
    }
    public int getDownloads(){
        return this.downloads;
    }
    public void setFavorites(int favorites){
        this.favorites = favorites;
    }
    public int getFavorites(){
        return this.favorites;
    }
    public void setLikes(int likes){
        this.likes = likes;
    }
    public int getLikes(){
        return this.likes;
    }
    public void setComments(int comments){
        this.comments = comments;
    }
    public int getComments(){
        return this.comments;
    }
    public void setUser_id(int user_id){
        this.user_id = user_id;
    }
    public int getUser_id(){
        return this.user_id;
    }
    public void setUser(String user){
        this.user = user;
    }
    public String getUser(){
        return this.user;
    }
    public void setUserImageURL(String userImageURL){
        this.userImageURL = userImageURL;
    }
    public String getUserImageURL(){
        return this.userImageURL;
    }
}
