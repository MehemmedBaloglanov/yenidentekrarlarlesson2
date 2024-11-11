package az.lesson.lesson2.repo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Lesson2")
public class HelloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
}
