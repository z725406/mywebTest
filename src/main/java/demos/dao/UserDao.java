package demos.dao;

import demos.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserDao {
    public User getUserById(int id);
}
