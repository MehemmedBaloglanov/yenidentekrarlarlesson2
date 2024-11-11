package az.lesson.lesson2.service;

import az.lesson.lesson2.repo.HelloEntity;
import az.lesson.lesson2.repo.HelloRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class FirstServiceImpl implements FirstService{

    public final HelloRepo helloRepo;

    @Override
    public HelloEntity sayHello() {
        log.info("Application startup completed");

        HelloEntity helloEntity = new HelloEntity();
//        helloEntity.setId(1L);
        helloEntity.setMessage("Hello, World! from db");

        helloRepo.save(helloEntity);

        return helloEntity;
    }
}
