package com.pb.gershgorin.hw7;

public enum Size {
    S("маленький", 10),
    M("средний", 20),
    L("большой", 30),
    XL("очень большой", 40);

    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }
}