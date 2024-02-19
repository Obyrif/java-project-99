package hexlet.code.app.component;

import hexlet.code.app.dto.UserCreateDTO;
import hexlet.code.app.mapper.UserMapper;
import hexlet.code.app.repository.UserRepository;
import hexlet.code.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;


public class DataInitializer implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        var userData = new UserCreateDTO();
        userData.setFirstName("hexlet");
        userData.setEmail("hexlet@example.com");
        userData.setPasswordDigest("123");
        var user = userMapper.map(userData);
        userRepository.save(user);
    }
}
