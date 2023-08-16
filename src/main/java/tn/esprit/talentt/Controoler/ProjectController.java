package tn.esprit.talentt.Controoler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.talentt.Entity.Project;
import tn.esprit.talentt.Interface.IProject;

@RestController
@RequestMapping("/Project")
public class ProjectController {
    @Autowired
    IProject ip;

    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project p){
    return ip.addproject(p);
    }
    @PutMapping("/updateProject")
    public Project updateProject(@RequestBody Project p){
        return ip.updateProject(p);
    }
    @GetMapping("/retrieve-Project/{Project-id}")
    public Project getliv(@PathVariable("Project-id") Integer idp) {

        return ip.findbyidProject(idp);
    }
    @DeleteMapping("/remove-Project/{Project-id}")
    public void removeLiv(@PathVariable("Project-id") Integer idp) {
        ip.deleteProject(idp);
    }

}
