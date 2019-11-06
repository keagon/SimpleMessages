package com.keagon.ChatterAndChatLog;

import java.util.ArrayList;

public interface ChatObserver {
    //Observer pattern
    public void update(ArrayList<String> chat, ChatSubject chatSubject);
}

