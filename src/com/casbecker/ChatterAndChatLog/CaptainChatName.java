package com.casbecker.ChatterAndChatLog;

public class CaptainChatName implements ChatName{

    ChatName chatName;

    public CaptainChatName(ChatName chatName) {
        this.chatName = chatName;
    }


    @Override
    public void setChatName(String name) {
        chatName.setChatName("Captain "+chatName.getChatName());
    }

    @Override
    public String getChatName() {
        return chatName.getChatName();
    }
}
