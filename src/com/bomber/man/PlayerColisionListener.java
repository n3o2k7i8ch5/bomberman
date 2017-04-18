package com.bomber.man;

import java.util.Iterator;

/**
 * Created by Kisiel on 17.04.2017.
 */
public abstract class PlayerColisionListener {

    GameFrame frame;
    Object object;

    public PlayerColisionListener(GameFrame frame){
        this.frame = frame;
    }

    public void checkColision(Iterator<Object> it){
        if(Math.abs(frame.player.x - object.x)<Main.RESOLUTION && Math.abs(frame.player.y - object.y) < Main.RESOLUTION)
            onColision(it);
    }

    public void assignToObject(Object object){
        this.object = object;
    }

    public abstract void onColision(Iterator<Object> it);
}
