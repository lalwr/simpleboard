package examples.boot.simpleboard.service.impl;

import examples.boot.simpleboard.domain.User;
import examples.boot.simpleboard.repository.UserRepository;
import examples.boot.simpleboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

}
