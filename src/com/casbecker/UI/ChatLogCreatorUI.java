package com.casbecker.UI;

import com.casbecker.ChatterAndChatLog.ChatLog;

import java.util.Scanner;

public class ChatLogCreatorUI {

    //Make singleton as only one instance is needed
    private static volatile ChatLogCreatorUI uniqueChatCreator;

    public static ChatLogCreatorUI getInstance() {
        if (uniqueChatCreator == null) {
            synchronized(ChatLogCreatorUI.class) {
                if (uniqueChatCreator == null) {
                    uniqueChatCreator = new ChatLogCreatorUI();
                }
            }
        }
        return uniqueChatCreator;
    }


    //Only task is to create a chatlog through the UI.
    public static ChatLog create(Scanner sc) {
        System.out.println("\n" +"How do you want to call the chat?");
        String logName = sc.nextLine();
        ChatLog chatLog = new ChatLog();
        chatLog.setChatLogName(logName);
        System.out.println("done!");
        return chatLog;
    }
}
