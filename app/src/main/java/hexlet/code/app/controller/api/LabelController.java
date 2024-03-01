package hexlet.code.app.controller.api;

import hexlet.code.app.dto.label.LabelCreateDTO;
import hexlet.code.app.dto.label.LabelDTO;
import hexlet.code.app.dto.label.LabelUpdateDTO;
import hexlet.code.app.service.LabelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Метки", description = "Методы для работы с метками")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @GetMapping("/labels")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Вывод всех меток")
    public ResponseEntity<List<LabelDTO>> index() {
        var labels = labelService.getAllLabel();
        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(labels.size()))
                .body(labels);
    }

    @GetMapping("/labels/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Получение метки по идентификатору")
    public LabelDTO show(@PathVariable Long id) {
        return labelService.getLabelById(id);
    }

    @PostMapping("/labels")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Создание новой метки")
    public LabelDTO create(@Valid @RequestBody LabelCreateDTO labelData) {
        return labelService.createLabel(labelData);
    }

    @PutMapping("/labels/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Обновление метки")
    public LabelDTO update(@RequestBody @Valid LabelUpdateDTO labelData, @PathVariable Long id) {
        return labelService.updateLabel(labelData, id);
    }

    @DeleteMapping("/labels/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Удаление метки")
    public void delete(@PathVariable Long id) {
        labelService.delete(id);
    }
}
