package tn.esprit.talentt.Dtos;

import lombok.Data;
import tn.esprit.talentt.Entity.Role;

import java.util.Date;

@Data
public class UserDto {
    private long id_user;
    private Role role;
    private String title;
    private String name;
    private String last_name;
    private Date date_of_birth;
    private String email;
    private String password;
    private String phone;
    private String contry;
    private String notes;
}
