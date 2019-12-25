package com.example.fu;

public class Data_Student_Stories {
    private  String stories_title_name,stories_names_country,
            stories_p1,stories_p2,stories_p3,stories_p4,stories_p5;

    public Data_Student_Stories(String stories_title_name, String stories_names_country,
                                String stories_p1, String stories_p2, String stories_p3, String stories_p4, String stories_p5) {
        this.stories_title_name = stories_title_name;
        this.stories_names_country = stories_names_country;
        this.stories_p1 = stories_p1;
        this.stories_p2 = stories_p2;
        this.stories_p3 = stories_p3;
        this.stories_p4 = stories_p4;
        this.stories_p5 = stories_p5;
    }

    public Data_Student_Stories(String stories_title_name, String stories_names_country,
                                String stories_p1, String stories_p2, String stories_p3) {
        this.stories_title_name = stories_title_name;
        this.stories_names_country = stories_names_country;
        this.stories_p1 = stories_p1;
        this.stories_p2 = stories_p2;
        this.stories_p3 = stories_p3;

    }

    public Data_Student_Stories(String stories_title_name, String stories_names_country,
                                String stories_p1, String stories_p2) {
        this.stories_title_name = stories_title_name;
        this.stories_names_country = stories_names_country;
        this.stories_p1 = stories_p1;
        this.stories_p2 = stories_p2;


    }
    public Data_Student_Stories(String stories_p3, String stories_p4, String stories_p5) {
        this.stories_p3 = stories_p3;
        this.stories_p4 = stories_p4;
        this.stories_p5 = stories_p5;
    }
    public Data_Student_Stories( String stories_p5) {

        this.stories_p5 = stories_p5;
    }


    public String getStories_title_name() {
        return stories_title_name;
    }

    public void setStories_title_name(String stories_title_name) {
        this.stories_title_name = stories_title_name;
    }

    public String getStories_names_country() {
        return stories_names_country;
    }

    public void setStories_names_country(String stories_names_country) {
        this.stories_names_country = stories_names_country;
    }

    public String getStories_p1() {
        return stories_p1;
    }

    public void setStories_p1(String stories_p1) {
        this.stories_p1 = stories_p1;
    }

    public String getStories_p2() {
        return stories_p2;
    }

    public void setStories_p2(String stories_p2) {
        this.stories_p2 = stories_p2;
    }

    public String getStories_p3() {
        return stories_p3;
    }

    public void setStories_p3(String stories_p3) {
        this.stories_p3 = stories_p3;
    }

    public String getStories_p4() {
        return stories_p4;
    }

    public void setStories_p4(String stories_p4) {
        this.stories_p4 = stories_p4;
    }

    public String getStories_p5() {
        return stories_p5;
    }

    public void setStories_p5(String stories_p5) {
        this.stories_p5 = stories_p5;
    }
}
