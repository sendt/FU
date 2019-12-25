package com.example.fu;

public class Data_Campus {
    private String campus_txt1, campus_tx2,
            campus_txt3, campus_txt4,
            campus_txt5;

    public Data_Campus(String campus_txt1, String campus_tx2, String campus_txt3, String campus_txt4, String campus_txt5) {
        this.campus_txt1 = campus_txt1;
        this.campus_tx2 = campus_tx2;
        this.campus_txt3 = campus_txt3;
        this.campus_txt4 = campus_txt4;
        this.campus_txt5 = campus_txt5;
    }

    public Data_Campus(String campus_txt3, String campus_txt4, String campus_txt5) {
        this.campus_txt3 = campus_txt3;
        this.campus_txt4 = campus_txt4;
        this.campus_txt5 = campus_txt5;
    }

    public String getCampus_txt1() {
        return campus_txt1;
    }

    public void setCampus_txt1(String campus_txt1) {
        this.campus_txt1 = campus_txt1;
    }

    public String getCampus_tx2() {
        return campus_tx2;
    }

    public void setCampus_tx2(String campus_tx2) {
        this.campus_tx2 = campus_tx2;
    }

    public String getCampus_txt3() {
        return campus_txt3;
    }

    public void setCampus_txt3(String campus_txt3) {
        this.campus_txt3 = campus_txt3;
    }

    public String getCampus_txt4() {
        return campus_txt4;
    }

    public void setCampus_txt4(String campus_txt4) {
        this.campus_txt4 = campus_txt4;
    }

    public String getCampus_txt5() {
        return campus_txt5;
    }

    public void setCampus_txt5(String campus_txt5) {
        this.campus_txt5 = campus_txt5;
    }
}
