package tn.esprit.talentt.Interface;

import tn.esprit.talentt.Entity.Project;

public interface IProject {
    public Project addproject (Project p);
    public Project updateProject (Project p);
    public Project findbyidProject (Integer idp);
    void deleteProject(Integer idV);
}
