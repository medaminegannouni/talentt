package tn.esprit.talentt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.talentt.Entity.Cv;
import tn.esprit.talentt.Entity.User;
import tn.esprit.talentt.Interface.Iuser;
import tn.esprit.talentt.Repository.Cv_rep;
import tn.esprit.talentt.Repository.User_rep;

import java.io.IOException;

@Service
public class User_ser implements Iuser {
    @Autowired
    Cv_ser cvser;
    @Autowired
    User_rep repu;
    @Autowired
    Cv_rep repcv;


}
