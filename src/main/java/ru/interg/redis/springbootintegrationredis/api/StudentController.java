package ru.interg.redis.springbootintegrationredis.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.interg.redis.springbootintegrationredis.model.Student;
import ru.interg.redis.springbootintegrationredis.service.MessageGateway;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private MessageGateway messageGateway;

    @PostMapping
    public void sendStudentInformation(@RequestBody Student student) {
        messageGateway.sendMessage(student);
    }
}
