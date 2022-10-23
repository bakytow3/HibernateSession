package org.example.service;

import org.example.exception.BadCredentionalsException;
import org.example.exception.NotFoundException;
import org.example.models.User;
import org.example.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService implements  AutoCloseable{
private UserRepository userRepository=new UserRepository();

public void register (User user){
    Boolean exist = userRepository.existBeEmail(user.getEmail());
    if(exist){
        throw new IllegalStateException(
                String.format("Illegal state exception")
        );
    }
    userRepository.save(user);
}
public Boolean login(String emil,String password){
    User user = userRepository.findByEmail(emil).orElseThrow(()->new NotFoundException(String.format("Not found exception")));
    if(password.equals(user.getPassword())){
        return true;
    }
    throw new BadCredentionalsException(
            String.format("Bad credentionalexeption!!!")
    );
}
public List<User>findAll(){
    return userRepository.findAll();
}






    @Override
    public void close() throws Exception {
userRepository.close();
    }
}
