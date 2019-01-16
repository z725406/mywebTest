package demos;

import demos.model.User;
import demos.service.Impl.UserServiceImpl;
import demos.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private  UserService userService;
    @Test
    public void contextLoads() {
        User u = userService.getUserByKey(1);
        System.out.println(u.toString());
    }

}

