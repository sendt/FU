package com.example.fu;

public class DataEmergencyWord {

    String word_tr,word_eng;

    public DataEmergencyWord(String word_tr, String word_eng) {
        this.word_tr = word_tr;
        this.word_eng = word_eng;
    }

    public String getWord_tr() {
        return word_tr;
    }

    public void setWord_tr(String word_tr) {
        this.word_tr = word_tr;
    }

    public String getWord_eng() {
        return word_eng;
    }

    public void setWord_eng(String word_eng) {
        this.word_eng = word_eng;
    }
}
