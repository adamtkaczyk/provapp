package com.ita.provapp.common;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
