package az.lesson.lesson2.rest;


import az.lesson.lesson2.repo.HelloEntity;
import az.lesson.lesson2.service.FirstService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson2")
@RequiredArgsConstructor
public class FirstApi {

    private final FirstService firstService;

    @GetMapping("/hello1")
    public HelloEntity sayHello(){
        return firstService.sayHello();
    }

    @GetMapping("/hello2")
    public String sayHello1(){
        return "Hello, World! 2";
    }
}
