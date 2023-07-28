package tn.esprit.talentt.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.talentt.Dtos.UserDto;
import tn.esprit.talentt.Interface.IUserServices;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserServices iUserService;


    @GetMapping("/users")
    public List<UserDto> Allusers(){
        return iUserService.Showall();
    }
    @GetMapping("/users/search")
    public List<UserDto> searchCustomers(@RequestParam(name = "keyword",defaultValue = "") String keyword){
        return iUserService.search("%"+keyword+"%");
    }

    @GetMapping("/users/{user_id}")
    public UserDto getUsers(@PathVariable(name = "user_id") Long user_id) {
        return iUserService.ShowOne(user_id);
    }
    @PostMapping("/users")
    public UserDto saveCustomer(@RequestBody UserDto userDto){
        return iUserService.Add(userDto);
    }
    @PutMapping("/users/{user_id}")
    public UserDto updateCustomer(@PathVariable Long user_id, @RequestBody UserDto userDto){
        userDto.setId_user(user_id);
        return iUserService.update(userDto);
    }
    @DeleteMapping("/users/{user_id}")
    public void deleteCustomer(@PathVariable Long user_id){
        iUserService.delete(user_id);
    }

}
