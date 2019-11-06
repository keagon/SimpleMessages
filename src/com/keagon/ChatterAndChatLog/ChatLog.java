package com.keagon.ChatterAndChatLog;

import java.util.ArrayList;

//A log to keep track of the messages, add messages and notify observers when the chat changes so they can update locally.
//It also prints the log for now as to test it with 2 persons,
// but usually each person would get their own local "chatlist" as defined by the hashmap in the standarChatter class.
public class ChatLog implements ChatSubject {

    private String chatLogName;
    private ArrayList<ChatObserver> observers;
    private ArrayList<String> chat;

    @Override
    public String getChatLogName() {
        return chatLogName;
    }

    public ChatLog() {
        observers = new ArrayList<>();
        chat = new ArrayList<>();
    }

    public void addMessage(Chatter chatter, String s) {
        chat.add(chatter.getChatName() + ": "+s);
        notifyObservers();
        printChatLog();
    }

    public void setChatLogName(String chatLogName) {
        this.chatLogName = chatLogName;
    }

    @Override
    public void removeObserver(ChatObserver o) {
        if (observers.contains(o)) {
            observers.remove(o);
        } else {
            System.out.println("The observer is not subscribed to this subject");
        }
    }

    @Override
    public void addObserver(ChatObserver o) {
        if (!observers.contains(o)) {
            observers.add(o);
        } else{
            System.out.println("Observer is already subscribed to this subject");
        }
    }
    @Override
    public void notifyObservers() {
    for (ChatObserver o : observers) {
        o.update(this.chat, this);
    }
    }

    public void printChatLog() {
        System.out.println();
        System.out.println(getChatLogName()+": ");
        for (String s : this.chat) {
            System.out.println(s);
        }
    }
}
