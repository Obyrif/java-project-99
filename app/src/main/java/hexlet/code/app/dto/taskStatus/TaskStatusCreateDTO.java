package hexlet.code.app.dto.taskStatus;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskStatusCreateDTO {
    @Column(unique = true)
    @Size(min = 1)
    private String name;

    @Column(unique = true)
    @Size(min = 1)
    private String slug;
}
