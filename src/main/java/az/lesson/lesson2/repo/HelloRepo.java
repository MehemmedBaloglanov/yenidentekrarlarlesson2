package az.lesson.lesson2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepo extends JpaRepository<HelloEntity,Long> {
}
