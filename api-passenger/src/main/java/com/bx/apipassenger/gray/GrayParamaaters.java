package com.bx.apipassenger.gray;

import java.util.Map;

public class GrayParamaaters{

    private static final ThreadLocal<Map<String,String>> LOCAL = new ThreadLocal();

    public static Map<String,String> get(){
        return LOCAL.get();
    }

    public static void set(Map map){
        LOCAL.set(map);
    }

}
