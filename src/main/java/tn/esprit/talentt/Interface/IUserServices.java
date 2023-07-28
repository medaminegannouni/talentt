package tn.esprit.talentt.Interface;

import tn.esprit.talentt.Dtos.UserDto;

import java.util.List;

public interface IUserServices {

    UserDto update(UserDto userDto);
    UserDto Add(UserDto userDto);

    public void delete(Long idUser);

    UserDto ShowOne(Long iduser);

    List<UserDto> Showall();
    List<UserDto> search(String keyword);
}
