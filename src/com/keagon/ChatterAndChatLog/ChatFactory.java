package com.keagon.ChatterAndChatLog;

import java.util.ArrayList;

public class ChatFactory {
    
    private static ChatFactory uniqueChatFactory;
    private ArrayList<ChatLog> chats;
    private ChatFactory() {
        chats = new ArrayList<>();
    }


    public static ChatFactory getInstance() {
        if (uniqueChatFactory == null) {
            synchronized(ChatFactory.class) {
                if (uniqueChatFactory == null) {
                    uniqueChatFactory = new ChatFactory();
                }
            }
        }
        return uniqueChatFactory;
    }
    

    public void connectChattersWithLog(Chatter firstChatter, Chatter secondChatter, ChatLog chatLog) {

        chatLog.addObserver(firstChatter);
        chatLog.addObserver(secondChatter);


    }

    
}
