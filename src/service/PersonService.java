package service;

import repository.Repository;

public class PersonService {

     Repository repository;

    public void workWithFiles() {

        try {
             repository.getUserData();
            throw new RuntimeException();
        } catch (RuntimeException e) {

        }
    }
}
