package com.example.person.personService;

import com.example.person.personDTO.PersonDTO;

import java.util.List;

public interface PersonService {
    void addPerson(PersonDTO personDTO);
    void addPersons(List<PersonDTO> personDTOList);
    PersonDTO takePersonWithId(Long id);
    List<PersonDTO> takePersonWithAgeBetween18and32(int start,int end);
}
