package com.BrianDev;

public class Bun {

    private String bunType;
    private boolean toasted;

    public Bun(String bunType, boolean toasted) {
        this.bunType = bunType;
        this.toasted = toasted;
    }

    public String getBunType() {
        return bunType;
    }

    public String getIsToasted() {
        if (!toasted) {
            return "Not toasted";
        } else return "toasted";
    }
}
