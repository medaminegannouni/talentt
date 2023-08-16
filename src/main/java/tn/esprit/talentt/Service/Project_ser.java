package tn.esprit.talentt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.talentt.Entity.Project;
import tn.esprit.talentt.Interface.IProject;
import tn.esprit.talentt.Repository.Project_rep;
@Service
public class Project_ser implements IProject {
    @Autowired
    Project_rep pr;
    @Override
    public Project addproject(Project p) {
        return pr.save(p);
    }

    @Override
    public Project updateProject(Project p) {
        return pr.save(p);
    }

    @Override
    public Project findbyidProject(Integer idp) {
        return pr.findById(idp).orElse(null);
    }

    @Override
    public void deleteProject(Integer idp) {
pr.deleteById(idp);
    }
}
