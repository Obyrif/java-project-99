package hexlet.code.app.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Getter
@Setter
public class TaskStatus implements BaseEntity {

    @Column(unique = true)
    @Size(min = 1)
    String name;

    @Column(unique = true)
    @Size(min = 1)
    String slug;

    @CreatedDate
    private LocalDate createdAt;
}
