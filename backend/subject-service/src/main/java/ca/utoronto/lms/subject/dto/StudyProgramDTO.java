package ca.utoronto.lms.subject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudyProgramDTO extends BaseDTO<Long> {
    private String name;
    private String description;
}
