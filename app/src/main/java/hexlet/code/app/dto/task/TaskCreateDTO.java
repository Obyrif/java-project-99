package hexlet.code.app.dto.task;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskCreateDTO {

    @NotNull
    private Long taskStatusId;

    @NotNull
    private Long assigneeId;

    @NotNull
    private String name;

    @NotNull
    private String description;
}
