package com.keagon.ChatterAndChatLog;

import java.util.ArrayList;
import java.util.HashMap;

public class StandardChatter extends Chatter {

    //Has a list of all the chats the chatter has and updates these when needed.
    //Maybe there is a smarter way to store the chat since updating this way might get ugly with larger data sets...

    public StandardChatter() {
        chats = new HashMap<ChatSubject, ArrayList<String>>();
        setChatName("DefaultChatter");
    }

    @Override
    public void update(ArrayList<String> chat, ChatSubject chatSubject) {
        chats.put(chatSubject, chat);
    }



}
