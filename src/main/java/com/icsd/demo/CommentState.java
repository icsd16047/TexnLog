package com.icsd.demo;

import static com.icsd.demo.NewsState.valueOf;


public enum CommentState {
    CREATED,
    APPROVED;
    
    public static CommentState fromString(String param){
        try{
            int value = Integer.parseInt(param);
            return CommentState.values()[value];
        }catch (NumberFormatException ex){
            return valueOf(param);
        }
    }
}
