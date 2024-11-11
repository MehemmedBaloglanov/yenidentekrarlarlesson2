package az.lesson.lesson2;

import az.lesson.lesson2.repo.HelloEntity;
import az.lesson.lesson2.repo.HelloRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class Lesson2Application implements CommandLineRunner {

	private final HelloRepo helloRepo;

	public static void main(String[] args) {
		SpringApplication.run(Lesson2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
