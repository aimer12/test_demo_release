package com.example.web;

import com.example.dao.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/12.
 */
@RestController
@RequestMapping(value="/")
public class PersonController {

    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonRepository repository;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String getHello() {
       return "hello, new beenie ";
    }

}
