package com.study.helloworld.service;

import com.study.helloworld.entity.Person;
import com.study.helloworld.projection.PersonProjection;
import com.study.helloworld.repository.PersonRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo){
        this.personRepo = personRepo;
    }

    public List<Person> getAllCreds(){
        return personRepo.getAllUsersCreds();
    }

    public PersonProjection getAllCredsProgection(){
        return personRepo.getPersonWithUserName(1);
    }
}
