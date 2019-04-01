package com.study.helloworld.repository;


import com.study.helloworld.entity.Person;
import com.study.helloworld.projection.PersonProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query(value = "SELECT * FROM Person", nativeQuery = true)
    List<Person> getAllUsersCreds();

    @Query("SELECT new com.study.helloworld.projection.PersonProjection(name, password) FROM Person WHERE id =: id")
    PersonProjection getPersonWithUserName(@Param("id") Long id);

    List<Person> findPeopleById(int id);

}

