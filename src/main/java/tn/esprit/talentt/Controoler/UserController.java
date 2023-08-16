package tn.esprit.talentt.Controoler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.talentt.Entity.User;
import tn.esprit.talentt.Interface.Iuser;
import tn.esprit.talentt.Repository.User_rep;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    User_rep iu;
@GetMapping("/retreive")
    public List<User> getallUser(){
    return iu.findAll();
}

}
