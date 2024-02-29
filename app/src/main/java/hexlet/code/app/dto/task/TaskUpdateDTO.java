package hexlet.code.app.dto.task;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.openapitools.jackson.nullable.JsonNullable;

@Getter
@Setter
public class TaskUpdateDTO {

    @NotNull
    private JsonNullable<Long> taskStatusId;

    @NotNull
    private JsonNullable<Long> assigneeId;

    @NotNull
    private JsonNullable<String> name;

    @NotNull
    private JsonNullable<String> description;
}
