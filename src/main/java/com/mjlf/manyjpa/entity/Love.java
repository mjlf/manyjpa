package com.mjlf.manyjpa.entity;

/**
 * Created by a123 on 17/7/9.
 */
public class Love {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Love{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
