package tn.esprit.talentt.Controoler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.talentt.Entity.Cv;
import tn.esprit.talentt.Service.FileUploadService;

import java.io.IOException;

@RestController
@RequestMapping("/cv")

public class CVController {
@Autowired
 FileUploadService fileUploadService;


    @GetMapping("/get")
    public String showUploadForm(Model model) {
        model.addAttribute("cv", new Cv());
        return "upload-form"; // Create an HTML template for the form
    }

    // Endpoint to handle file submission
    //@PostMapping(value = "/upload"/*,consumes = MediaType.MULTIPART_FORM_DATA_VALUE*/)
   /* public String handleFileUpload( @RequestParam("file") MultipartFile file ) {
        Cv cv=new Cv();
        try {
            fileUploadService.uploadFile(cv, file);
            return "redirect:/success"; // Create an HTML template for success message
        } catch (IOException e) {
            return "redirect:/error"; // Create an HTML template for error message
        }
    }*/

    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        Cv cv= new Cv();
        try {
            cv.setUploadedFile(file.getBytes());
           fileUploadService.saveCv(cv);
            return ResponseEntity.ok("File uploaded successfully.");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file.");
        }
    }
}


