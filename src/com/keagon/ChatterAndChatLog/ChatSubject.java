package com.keagon.ChatterAndChatLog;

public interface ChatSubject {

    //Needs to be able to add/remove observers to the conversations, have a chatName and add messages to the conversation.
    public void removeObserver(ChatObserver o);
    public void addObserver(ChatObserver o);
    public void notifyObservers();
    public String getChatLogName();
    public void addMessage(Chatter o, String s);
}
