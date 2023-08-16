package tn.esprit.talentt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.talentt.Entity.Skills;
import tn.esprit.talentt.Interface.ISkills;
import tn.esprit.talentt.Repository.Skills_rep;

@Service
public class Skills_ser implements ISkills {
    @Autowired
    Skills_rep sr;
    @Override
    public Skills addSkills(Skills s) {
        return sr.save(s);
    }

    @Override
    public Skills updateSkills(Skills s) {
        return sr.save(s);
    }

    @Override
    public Skills findbyidSkills(Integer ids) {
        return sr.findById(ids).orElse(null);
    }

    @Override
    public void deleteSkills(Integer ids) {
sr.deleteById(ids);
    }
}
