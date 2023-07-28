package tn.esprit.talentt.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @NonNull
    private Integer id;
    private String name;
    private String pre_name;
    private String email;
    private String phone;
    private String country;
    private LocalDate birth_date;
    private Role role;
    @OneToOne(cascade = CascadeType.ALL)
    private Cv cv;
}
