package demos.service;

import demos.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User getUserByKey(int id);
}
