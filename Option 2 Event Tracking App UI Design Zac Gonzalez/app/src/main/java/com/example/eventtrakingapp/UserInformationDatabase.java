package com.example.eventtrakingapp;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

public class UserInformationDatabase {

    private static UserInformationDatabase sUserInformationDatabase;
    private List<UserInformation> mUserInformations;

    public static UserInformationDatabase getInstance(Context context) {
        if (sUserInformationDatabase == null) {
            sUserInformationDatabase = new UserInformationDatabase(context);
        }
        return sUserInformationDatabase;
    }

    private UserInformationDatabase(Context context) {
        mUserInformations = new ArrayList<>();
        Resources res = context.getResources();
        String [] usernames = res.getStringArray(R.array.usernames);
        String [] passwords = res.getStringArray(R.array.passwords);
        for (int i = 0; i < usernames.length; i++) {
            mUserInformations.add(new UserInformation(i + 1, usernames[i], passwords[i]));
        }
    }

    public List<UserInformation> getUserInformations() {
        return mUserInformations;
    }

    public UserInformation getUserInformation(String userInformationUsername) {
        for (UserInformation userInformation : mUserInformations) {
            if (UserInformation.getusername() == userInformationUsername){
                return userInformation;
            }
        }
        return null;
    }
}
