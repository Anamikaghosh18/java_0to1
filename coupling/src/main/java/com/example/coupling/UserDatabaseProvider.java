package com.example.coupling;

public class UserDatabaseProvider implements UserDataProvidor{
    // A = MySQL , MongoDB
    // B = Web service

    public String getUserDetails(){
        return "User Details from Database";
    }
}
