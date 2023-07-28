package tn.esprit.talentt.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.talentt.Dtos.UserDto;
import tn.esprit.talentt.Entity.User;
import tn.esprit.talentt.Interface.IUserServices;

import tn.esprit.talentt.Mappers.UserMappers;
import tn.esprit.talentt.Repository.User_rep;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class User_ser implements IUserServices {
    @Autowired
    UserMappers usermappers;
    @Autowired
    User_rep userRepository;

    @Override
    public UserDto update(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto Add(UserDto userDto) {
        log.info("Saving new Customer");
        User customer=usermappers.fromUserDto(userDto);
        User savedUser = userRepository.save(customer);
        return usermappers.fromUser(savedUser);
    }

    @Override
    public void delete(Long idUser) {
        userRepository.deleteById(idUser);
    }

    @Override
    public UserDto ShowOne(Long iduser) {
        return null;
    }
    @Override
    public List<UserDto> search(String keyword) {
        List<User> users=userRepository.searchUsers(keyword);
        List<UserDto> userDtos = users.stream().map(cust -> usermappers.fromUser(cust)).collect(Collectors.toList());
        return userDtos;
    }
    @Override
    public List<UserDto> Showall() {
        List<User> users = userRepository.findAll();
        List<UserDto> userdtoGets = users.stream()
                .map(user -> usermappers.fromUser(user))
                .collect(Collectors.toList());
        return userdtoGets;

    }
}
