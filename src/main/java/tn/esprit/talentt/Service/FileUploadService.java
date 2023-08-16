package tn.esprit.talentt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.talentt.Entity.Cv;
import tn.esprit.talentt.Repository.Cv_rep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileUploadService {
    @Autowired
    Cv_rep cvr;


   public void saveCv(Cv cv) {
       cvr.save(cv);
   }

}
