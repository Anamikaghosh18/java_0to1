package com.example.coupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Coupling {

    public static void main(String[] args) {


        SpringApplication.run(Coupling.class, args);


        // Loose coupling means that classes depend on abstractions (interfaces)
        // rather than concrete implementations. This allows flexibility.
        // - UserDataProvidor is an interface
        // - UserDatabaseProvider and WebServiceProvider are implementations
        // - UserManager depends on UserDataProvidor (interface), not the concrete class
        // - We can pass any implementation without changing UserManager

        // Instance of database provider (concrete class implementing the interface)
        UserDataProvidor databaseProvider = new UserDatabaseProvider();

        // Inject dependency into UserManager via constructor
        UserManager userManagerWithDB = new UserManager(databaseProvider);

        // UserManager calls methods on interface; actual implementation is DB provider
        System.out.println(userManagerWithDB.getUserInfo());

        // Instance of web service provider
        UserDataProvidor webServiceProvider = new WebServiceProvider();

        // Inject dependency into UserManager via constructor
        UserManager userManagerWithWS = new UserManager(webServiceProvider);

        // UserManager works with web service provider seamlessly
        System.out.println(userManagerWithWS.getUserInfo());


        // Tight coupling happens when classes depend on concrete implementations directly.
        // UserManager userManager = new UserManager(new UserDatabaseProvider());

        // UserManager is tightly coupled to UserDatabaseProvider.
        // Changing the data source would require modifying UserManager code.
    }
}
