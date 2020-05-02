package ru.interg.redis.springbootintegrationredis.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.interg.redis.springbootintegrationredis.model.Student;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @PostMapping
    public void sendStudentInformation(@RequestBody Student student) {

    }
}
