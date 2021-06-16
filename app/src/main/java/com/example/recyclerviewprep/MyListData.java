package com.example.recyclerviewprep;

public class MyListData {
    private String description;
    private int imgld;
    public MyListData(String description, int imgld) {
        this.description = description;
                this.imgld = imgld;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgld() {
        return imgld;
    }
    public void setImgld(int imgld) {
        this.imgld = imgld;
    }
}
