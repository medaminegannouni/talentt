package tn.esprit.talentt.Interface;

import tn.esprit.talentt.Entity.Skills;

public interface ISkills {
    public Skills addSkills (Skills s);
    public Skills updateSkills (Skills s);
    public Skills findbyidSkills (Integer ids);
    void deleteSkills(Integer ids);

}
