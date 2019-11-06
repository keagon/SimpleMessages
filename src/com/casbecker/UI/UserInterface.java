package com.casbecker.UI;

import com.casbecker.ChatterAndChatLog.*;

import java.util.Scanner;


public class UserInterface {
    private Scanner sc;
    private ChatLog currentChatLog;

    public UserInterface() {
        sc = new Scanner(System.in);
    }


    public void start(Chatter chatter1, Chatter chatter2, ChatLog chatLog) {
        this.currentChatLog = chatLog;
        while (true) {
            System.out.println("\nAre you " + chatter1.getChatName() + " or " + chatter2.getChatName()+" (press x to exit)");
            String nameOrExit = sc.nextLine();
            if (nameOrExit.equals(chatter1.getChatName())) {
                setTitlesOrMessage(chatter1);
            } else if (nameOrExit.equals(chatter2.getChatName())) {
                setTitlesOrMessage(chatter2);
            } else if (nameOrExit.equals("x")) {
                break;
            } else {
                System.out.println("Sorry, you're not in the chat.");
            }

        }
    }

    public void setTitlesOrMessage(Chatter chatter) {
        System.out.println();
        System.out.println("Do you want to send a message or set a title? (message, title)");


        String input = sc.nextLine();
        if (input.toLowerCase().equals("message")) {
            currentChatLog.addMessage(chatter, indivChatterStart(chatter));
        } else if (input.toLowerCase().equals("title")) {
            System.out.println();
            System.out.println("Currently we have the titles: ");
            System.out.println("Captain and Dr");
            System.out.println("What title do you want?");
            String title = sc.nextLine();
            if (title.toLowerCase().equals("dr")) {
                DrChatName dr = new DrChatName(chatter);
                dr.setChatName(""); //adds to the method, so no input needed.
            } else if (title.toLowerCase().equals("captain")) {
                CaptainChatName cap = new CaptainChatName(chatter);
                cap.setChatName(""); //adds to the method, so no input needed.
            }

        }
    }

    public String indivChatterStart(Chatter chatter) {
        System.out.println();
        System.out.println("Hi there " + chatter.getChatName());
        System.out.println("What's your message?");
        return sc.nextLine();
    }

    public void startWithCreation() {
        Chatter chatter1 = startChatterCreation();
        Chatter chatter2 = startChatterCreation();
        ChatLog chatLog = startChatLogCreation();
        ChatFactory.getInstance().connectChattersWithLog(chatter1, chatter2, chatLog);
        start(chatter1, chatter2, chatLog);
    }

    public ChatLog startChatLogCreation() {
        ChatLog chatLog = ChatLogCreatorUI.create(sc);
        return chatLog;
    }

    public Chatter startChatterCreation() {
        return ChatterCreatorUI.getInstance().createChatter(sc);
    }


}
