package tn.esprit.talentt.Mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import tn.esprit.talentt.Dtos.UserDto;
import tn.esprit.talentt.Entity.User;

@Service
public class UserMappers {
    public UserDto fromUser(User user){
        UserDto userDto=new UserDto();
        BeanUtils.copyProperties(user,userDto);
        return  userDto;
    }
    public User fromUserDto(UserDto userDto){
        User user=new User();
        BeanUtils.copyProperties(userDto,user);
        return  user;
    }
}
