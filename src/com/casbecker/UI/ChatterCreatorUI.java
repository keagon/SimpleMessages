package com.casbecker.UI;

import com.casbecker.ChatterAndChatLog.Chatter;
import com.casbecker.ChatterAndChatLog.DefaultChatterFactory;

import java.util.Scanner;

public class ChatterCreatorUI {

    private static volatile ChatterCreatorUI uniqueChatterCreator;

    public static ChatterCreatorUI getInstance() {
        if (uniqueChatterCreator == null) {
            synchronized(ChatterCreatorUI.class) {
                if (uniqueChatterCreator == null) {
                    uniqueChatterCreator = new ChatterCreatorUI();
                }
            }
        }
        return uniqueChatterCreator;
    }
    
    
    
    
    
    
    
    
    public Chatter createChatter(Scanner sc) {
        Chatter chatter = DefaultChatterFactory.getInstance().createDefaultChatter();
        System.out.println("What's your name?");
        String name = sc.nextLine();
        if (!name.equals("x")) {
            chatter.setChatName(name);
        } else {
            System.out.println("Sorry, you can't pick an x for a name");
            createChatter(sc);
        }
        return chatter;
    }
}
