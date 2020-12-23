package com.example.videoapiproject.VideoModel;

public class Videos
{
    private Large large;

    private Medium medium;

    private Small small;

    private Tiny tiny;

    public void setLarge(Large large){
        this.large = large;
    }
    public Large getLarge(){
        return this.large;
    }
    public void setMedium(Medium medium){
        this.medium = medium;
    }
    public Medium getMedium(){
        return this.medium;
    }
    public void setSmall(Small small){
        this.small = small;
    }
    public Small getSmall(){
        return this.small;
    }
    public void setTiny(Tiny tiny){
        this.tiny = tiny;
    }
    public Tiny getTiny(){
        return this.tiny;
    }
}