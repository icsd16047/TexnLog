package com.icsd.demo;


public enum NewsState {
    CREATED,
    SUBMITED,
    APPROVED,
    PUBLISHED;
    
    public static NewsState fromString(String param){
        try{
            int value = Integer.parseInt(param);
            return NewsState.values()[value];
        }catch (NumberFormatException ex){
            return valueOf(param);
        }
    }
}
