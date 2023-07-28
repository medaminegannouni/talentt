package tn.esprit.talentt.Entity;

import lombok.*;

import javax.persistence.*;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id_user ;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String title;
    private String name;
    private String last_name;
    private Date date_of_birth;
    private String email ;
    private String phone;
    private String country;
    private String notes;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    private Cv cv;
}
