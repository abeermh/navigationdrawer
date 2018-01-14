package com.abeer_m.navdrawer;

/**
 * Created by abeer_m on 1/12/2018.
 */

public class items {
    public String text;
    public int img;
    public items(String text,int img){
        this.text=text;
        this.img=img;
    }

    public int getItemId() {
        return img;
    }
}
