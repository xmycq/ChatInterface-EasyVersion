package com.example.uibestpractice;

public class Msg {
    /***TYPE_RECEIVED表示一条收到的消息*/
    /***TYPE_SENT表示一条发出的消息*/
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;
    /***content表示消息的内容，type表示消息的类型*/
    private String content;
    private int type;
    public Msg(String content, int type){
        this.content = content;
        this.type = type;
    }

    public String getContent(){
        return content;
    }

    public int getType(){
        return type;
    }
}
