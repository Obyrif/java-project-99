package hexlet.code.app.dto.task;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Schema(description = "Сущность Задач")
public class TaskDTO {

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "Имя")
    private String name;

    @Schema(description = "Для правильного отображения задач во фронтовом приложении")
    private int index;

    @Schema(description = "Описание")
    private String description;

    @Schema(description = "Связано с сущностью статуса")
    private Long taskStatusId;

    @Schema(description = "Связано с сущностью пользователя")
    private Long assigneeId;

    @Schema(description = "Дата создания")
    private LocalDate createdAt;
}
