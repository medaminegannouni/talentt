package tn.esprit.talentt.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @NonNull
    private Integer id;
    private String name_company;
    private LocalDate Start_date;
    private LocalDate End_date;
    private String place;
    private String description;
    private String technologie;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "project")
    private List<Cv> cv;

}
