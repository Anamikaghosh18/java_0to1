package com.example.coupling;

public class WebServiceProvider implements UserDataProvidor{

  public String getUserDetails(){
      return "fetched data from the web server";
  }

}
