package com.company;

public class Footballer {
    private Accessories boots;
    private Accessories gloves;

    public Footballer(){
        boots =new Boots();
        gloves =new Gloves();
    }

    public void wearBoots(){
        boots.wear();
    }
    public void wearGloves(){
        gloves.wear();
    }
}
