package com.example.travelmania.helpers;

import com.google.firebase.database.ServerValue;

public class Comment {
    private String content,uid,name;

    public Comment() {

    }

    public Comment(String content, String uid, String name){
        this.content= content;
        this.uid = uid;
        this.name=name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
