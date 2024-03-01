package hexlet.code.app.dto.label;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Schema(description = "Сущность Метки")
public class LabelDTO {

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "Имя")
    private String name;

    @Schema(description = "Дата создания")
    private LocalDate createdAt;
}
