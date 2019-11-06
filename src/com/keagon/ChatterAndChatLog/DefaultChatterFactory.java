package com.keagon.ChatterAndChatLog;

import java.util.ArrayList;

public class DefaultChatterFactory {

    //Make singleton
    private static volatile DefaultChatterFactory factoryInstance;
    private ArrayList<Chatter> chatterList;

    private DefaultChatterFactory() {
        chatterList = new ArrayList<>();
    }

    public static DefaultChatterFactory getInstance() {
        if (factoryInstance == null) {
            synchronized(DefaultChatterFactory.class) {
                if (factoryInstance == null) {
                    factoryInstance = new DefaultChatterFactory();
                }
            }
        }
        return factoryInstance;
    }





    //make method for creating different kinds of chatters (only 1 now).
    public Chatter createDefaultChatter() {
        Chatter ch = new StandardChatter();
        getInstance().chatterList.add(ch);
        return ch;
    }
}
