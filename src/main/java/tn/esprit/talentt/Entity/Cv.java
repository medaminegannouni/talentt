package tn.esprit.talentt.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cv {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @NonNull
    private Integer id;
    @Lob
    @Column(length = 10485760)
    private byte[] uploadedFile;
    private String title ;
    private String education;
    @JsonIgnore
    @OneToOne(mappedBy = "cv")
    private User user;
    @JsonIgnore
    @ManyToOne
    private Project project;
    @JsonIgnore
    @ManyToMany
    private List<Skills> skills;
}
