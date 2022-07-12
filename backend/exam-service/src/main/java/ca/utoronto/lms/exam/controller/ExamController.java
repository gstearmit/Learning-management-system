package ca.utoronto.lms.exam.controller;

import ca.utoronto.lms.exam.dto.ExamDTO;
import ca.utoronto.lms.exam.model.Exam;
import ca.utoronto.lms.exam.service.ExamService;
import ca.utoronto.lms.shared.controller.BaseController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exam-service/exams")
public class ExamController extends BaseController<Exam, ExamDTO, Long> {
    private final ExamService service;

    public ExamController(ExamService service) {
        super(service);
        this.service = service;
    }

    @GetMapping("/subject/{id}/all")
    public ResponseEntity<List<ExamDTO>> getBySubjectId(@PathVariable Long id) {
        List<ExamDTO> exams = this.service.findBySubjectId(id);
        return exams.isEmpty()
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(exams, HttpStatus.OK);
    }

    @GetMapping("/subject/{id}")
    public ResponseEntity<Page<ExamDTO>> getBySubjectId(
            @PathVariable Long id,
            Pageable pageable,
            @RequestParam(defaultValue = "") String search) {
        Page<ExamDTO> exams = this.service.findBySubjectId(id, pageable, search);
        return exams.isEmpty()
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(exams, HttpStatus.OK);
    }
}
