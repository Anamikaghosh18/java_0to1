package com.example.coupling;

public class UserManager{

//    tightly coupled with the UserDatabse -> if any changes in database everything have to change
//    private UserDatabaseProvider userDatabase = new UserDatabaseProvider();

    private UserDataProvidor userDataProvidor; // object of a interface instead of class

    public UserManager(UserDataProvidor userDataProvidor){
        this.userDataProvidor = userDataProvidor;
    }

    public String getUserInfo(){
        return userDataProvidor.getUserDetails();
    }
}