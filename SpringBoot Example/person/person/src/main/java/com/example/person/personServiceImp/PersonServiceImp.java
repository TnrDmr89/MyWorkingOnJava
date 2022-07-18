package com.example.person.personServiceImp;

import com.example.person.personDTO.PersonDTO;
import com.example.person.personEntity.PersonEntity;
import com.example.person.personRepository.PersonRepository;
import com.example.person.personService.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional
    public void addPerson(PersonDTO personDTO) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setAge(personDTO.getAge());
        personEntity.setName(personDTO.getName());
        personEntity.setSurname(personDTO.getSurname());
        personRepository.save(personEntity);

    }

    @Override
    public void addPersons(List<PersonDTO> personDTOList) {

        for(PersonDTO personDTO : personDTOList){
            PersonEntity personEntity = new PersonEntity();
            personEntity.setName(personDTO.getName());
            personEntity.setSurname(personDTO.getSurname());
            personEntity.setAge(personDTO.getAge());
            personRepository.save(personEntity);
        }

    }

    @Override
    @Transactional
    public PersonDTO takePersonWithId(Long id){
        PersonEntity personEntity = personRepository.findPersonEntityById(id);
        PersonDTO personDTO = new PersonDTO();
        personDTO.setAge(personEntity.getAge());
        personDTO.setName(personEntity.getName());
        personDTO.setSurname(personEntity.getSurname());
        return personDTO;
    }

    @Override
    public List<PersonDTO> takePersonWithAgeBetween18and32(int start, int end) {
        List<PersonDTO> personDTOList = new ArrayList<>();
        List<PersonEntity> personEntityList = personRepository.findPersonEntityByAgeBetween(start,end);
        for(PersonEntity personEntity : personEntityList){
            PersonDTO personDTO = new PersonDTO();
            personDTO.setName(personEntity.getName());
            personDTO.setSurname(personEntity.getSurname());
            personDTO.setAge(personEntity.getAge());
            personDTOList.add(personDTO);
        }
        return personDTOList;
    }

}
