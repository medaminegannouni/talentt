package tn.esprit.talentt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.talentt.Entity.User;

import java.util.List;

@Repository
public interface User_rep  extends JpaRepository<User, Long> {
    @Query("select c from User c where c.name like :kw")
    List<User> searchUsers(@Param("kw") String keyword);
}
