package com.example.person.personRepository;

import com.example.person.personEntity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonRepository extends CrudRepository<PersonEntity,Long> {
    PersonEntity findPersonEntityById(Long id);
    List<PersonEntity> findPersonEntityByAgeBetween(int start, int end);
}
