package com.example.person.personController;

import com.example.person.personDTO.PersonDTO;
import com.example.person.personService.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/addPerson")
    public ResponseEntity addPerson(@RequestBody PersonDTO personDTO){
        personService.addPerson(personDTO);
        return new ResponseEntity("Basarili", HttpStatus.ACCEPTED);
    }
    @PostMapping("/addPersons")
    public ResponseEntity addPersons(@RequestBody List<PersonDTO> personDTOList){
        personService.addPersons(personDTOList);
        return new ResponseEntity("Basarili",HttpStatus.ACCEPTED);

    }

    @GetMapping("/takePersonWithId/{id}")
    public PersonDTO takePersonWithId(@PathVariable Long id){
        return personService.takePersonWithId(id);
    }

    @GetMapping("/takePersonWithAgeBetween18and32")
    @Transactional
    public List<PersonDTO> takePersonWithAgeBetween18and32(){
        return personService.takePersonWithAgeBetween18and32(18,32);
    }



}
