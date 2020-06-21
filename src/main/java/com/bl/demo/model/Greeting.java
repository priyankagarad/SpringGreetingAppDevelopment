package com.bl.demo.model;
public class Greeting {
    private Long count;
    private String name;

    public Greeting(String name,Long count){
        this.name=name;
        this.count=count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
