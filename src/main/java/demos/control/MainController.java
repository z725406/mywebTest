package demos.control;

import demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class MainController {
    @Autowired
    UserService userService;
    @RequestMapping("/boot")
    public String getIndex(){
        Map map = new HashMap();
        map.put("f",11111);
        return userService.getUserByKey(1).toString();
    }
}
