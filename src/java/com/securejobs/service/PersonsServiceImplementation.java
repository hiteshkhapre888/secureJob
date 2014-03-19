
package com.securejobs.service;

import com.securejobs.domain.Persons;

public class PersonsServiceImplementation implements PersonsService {

    @Override
    public void add(Persons person) {
         System.out.println("Person added successfully");
    }
    
}
