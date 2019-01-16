package demos.service.Impl;

import demos.dao.UserDao;
import demos.model.User;
import demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao ;
    @Override
    public User getUserByKey(int id) {
        return  userDao.getUserById(id);
    }
}
