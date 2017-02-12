package com.example;

import com.example.dao.Person;
import com.example.dao.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/2/12.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRespositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testFindbyId(){
        Person person = new Person("dew","liu");
        personRepository.save(person);

        List<Person> personList = personRepository.findAllByOrderByIdAsc();
        for(Person p: personList){
            System.out.println(p.getFirstName() + " ,"+ p.getLastName());
        }


    }

}
