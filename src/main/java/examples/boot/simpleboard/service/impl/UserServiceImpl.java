package examples.boot.simpleboard.service.impl;

import examples.boot.simpleboard.domain.User;
import examples.boot.simpleboard.repository.UserRepository;
import examples.boot.simpleboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User addUser(User user) {
        User saveUser = userRepository.save(user);
        return saveUser;
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

}
