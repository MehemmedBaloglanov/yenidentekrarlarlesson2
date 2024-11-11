package az.lesson.lesson2.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson2")
public class FirstApi {


    @GetMapping("/hello1")
    public String sayHello(){
        return "Hello, World! 1";
    }

    @GetMapping("/hello2")
    public String sayHello1(){
        return "Hello, World! 2";
    }
}
