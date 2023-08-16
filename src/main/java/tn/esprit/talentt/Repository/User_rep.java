package tn.esprit.talentt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.talentt.Entity.User;
@Repository
public interface User_rep  extends JpaRepository<User, Integer> {
}
