package com.keagon.ChatterAndChatLog;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Chatter implements ChatObserver, ChatName {

    //Abstract class for different kinds of chatters (e.g. want to make a difference between adult acces and child acces)
    //Useful for future updates.
    //used to contain all the chats this chatter is in.
    protected HashMap<ChatSubject, ArrayList<String>> chats;
    private String name;

    public String getChatName() {
        return name;
    }
    public void setChatName(String name) {
        this.name = name;
    }


}
