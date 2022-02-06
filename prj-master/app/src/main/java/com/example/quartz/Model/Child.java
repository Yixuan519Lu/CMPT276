package com.example.quartz.Model;

public class Child {

    private String Name;
    private int FlipTimes;
    private int headTimes;
    private static Child instance;

    public Child(String name)
    {
        this.Name = name;
        this.FlipTimes = 0;
        this.headTimes = 0;

    }

//    public static Child getInstance(){
//        if(instance == null){
//            instance = new Child("Tom");
//        }
//        return instance;
//    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getFlipTimes() {
        return FlipTimes;
    }

    public void setFlipTimes(int flipTimes) {
        FlipTimes = flipTimes;
    }

    public int getHeadTimes() {
        return headTimes;
    }

    public void setHeadTimes(int headTimes) {
        this.headTimes = headTimes;
    }



}




