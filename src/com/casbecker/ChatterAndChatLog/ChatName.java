package com.casbecker.ChatterAndChatLog;

public interface ChatName {
    //A common interface used to add titles to the name of a chatter (group chat or others).
    //This way, all the titles can be used for any object inheriting the Chatname interface (e.g. a ChatLog if needed).
    public void setChatName(String name);
    public String getChatName();


}
