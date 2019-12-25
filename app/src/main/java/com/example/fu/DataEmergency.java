package com.example.fu;

public class DataEmergency {

    String number,num_desp;
    int imgSrc,call;

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public DataEmergency(String number, String num_desp, int imgSrc, int call) {
        this.number = number;
        this.num_desp = num_desp;
        this.imgSrc = imgSrc;
        this.call=call;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNum_desp() {
        return num_desp;
    }

    public void setNum_desp(String num_desp) {
        this.num_desp = num_desp;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }


}
