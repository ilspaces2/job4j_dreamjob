package ru.job4j.dreamjob.service;

import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import ru.job4j.dreamjob.model.User;
import ru.job4j.dreamjob.store.UserDBStore;

import java.util.Optional;

@ThreadSafe
@Service
public class UserService {

    private final UserDBStore store;

    public UserService(UserDBStore store) {
        this.store = store;
    }

    public Optional<User> add(User user) {
        return store.add(user);
    }

    public User findById(int id) {
        return store.findById(id);
    }

    public boolean deleteAll() {
        return store.deleteAll();
    }

    public Optional<User> findUserByEmailAndPwd(String password, String email) {
        return store.findUserByEmailAndPwd(password, email);
    }
}
