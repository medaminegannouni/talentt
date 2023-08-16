package tn.esprit.talentt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.talentt.Entity.Project;
@Repository
public interface Project_rep extends JpaRepository<Project, Integer> {
}
