package tn.esprit.talentt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.talentt.Entity.User;

public interface User_rep  extends JpaRepository<User, Integer> {
}
