package tn.esprit.talentt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.talentt.Entity.Cv;
@Repository
public interface Cv_rep  extends JpaRepository<Cv, Integer> {
}
