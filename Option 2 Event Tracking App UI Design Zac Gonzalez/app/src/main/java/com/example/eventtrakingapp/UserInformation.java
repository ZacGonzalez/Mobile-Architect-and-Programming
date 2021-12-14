package com.example.eventtrakingapp;

public class UserInformation {
    private static String musername;
    private String mpassword;

    public UserInformation() {}

    public UserInformation(String username, String password) {
        musername = username;
        mpassword = password;
    }

    public UserInformation(int i, String username, String password) {
    }

    public static String getusername() {
        return musername;
    }

    public void setusername(String username) {
        this.musername = username;
    }

    public String getpassword() {
        return mpassword;
    }

    public void setpassword(String password) {
        this.mpassword = password;
    }
}
