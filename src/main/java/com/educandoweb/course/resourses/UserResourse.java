package com.educandoweb.course.resourses;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1l,"Ingrid","12121212","1234");
        return ResponseEntity.ok().body(user);
    }

}
