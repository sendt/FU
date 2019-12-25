package com.example.fu;

public class HoldDataforRecyclerView {
    int img_src;
    String title;
    String descp;
    public HoldDataforRecyclerView(String descp) {
        this.descp = descp;

    }

    public HoldDataforRecyclerView(String title, String descp) {
        this.title = title;
        this.descp = descp;
    }

    public HoldDataforRecyclerView(int img_src, String title, String descp) {
        this.descp = descp;
        this.title = title;
        this.img_src = img_src;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg_src() {
        return img_src;
    }

    public void setImg_src(int img_src) {
        this.img_src = img_src;
    }
}
