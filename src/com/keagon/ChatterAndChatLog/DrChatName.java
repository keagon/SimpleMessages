package com.keagon.ChatterAndChatLog;

public class DrChatName implements ChatName{

    ChatName chatName;

    public DrChatName(ChatName chatName) {
        this.chatName = chatName;
    }


    @Override
    public void setChatName(String name) {
        chatName.setChatName("Dr "+chatName.getChatName());
    }

    @Override
    public String getChatName() {
        return chatName.getChatName();
    }
}
