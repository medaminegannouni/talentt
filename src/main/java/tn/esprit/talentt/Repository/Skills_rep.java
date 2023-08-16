package tn.esprit.talentt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.talentt.Entity.Skills;

@Repository
public interface Skills_rep extends JpaRepository<Skills,Integer> {
    Skills findByNameIgnoreCase(String name);
}
