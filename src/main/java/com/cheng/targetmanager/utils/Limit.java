package com.cheng.targetmanager.utils;

import java.util.HashMap;
import java.util.Map;

public class Limit {
    private final static int DEFAULT_SIZE = 10;
    private final static String PAGE = "page";
    private final static String SIZE = "size";
    private final static String BEGIN = "begin";
    private final static String LIMIT = "limit";

    private int page;
    private int size;

    public Limit() {
    }

    public Limit(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public static Limit getFromMap(Map o) {
        Limit limit = new Limit();
        try {
            limit.setPage(Integer.parseInt((String) o.get(PAGE)));
            limit.setSize(Integer.parseInt((String) o.get(SIZE)));
        } catch (Exception e) {
            limit.setPage(1);
            limit.setSize(DEFAULT_SIZE);
        }
        return limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBegin() {
        return (page - 1) * size;
    }

    public boolean valid() {
        return page >= 1 && size >= 1;
    }

    public Map<String,Object> getBeginAndLimit(){
        Map<String,Object> map = new HashMap<>();
        map.put(BEGIN, getBegin());
        map.put(LIMIT, size);
        return map;
    }
}
