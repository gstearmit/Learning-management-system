package ca.utoronto.lms.subject.mapper;

import ca.utoronto.lms.subject.dto.SubjectDTO;
import ca.utoronto.lms.subject.dto.SubjectNotificationDTO;
import ca.utoronto.lms.subject.dto.TeacherDTO;
import ca.utoronto.lms.subject.model.Subject;
import ca.utoronto.lms.subject.model.SubjectNotification;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubjectNotificationMapper
        extends BaseMapper<SubjectNotification, SubjectNotificationDTO> {
    @Mapping(source = "teacherId", target = "teacher")
    SubjectNotificationDTO toDTO(SubjectNotification subjectNotification);

    TeacherDTO teacherDTOFromId(Long id);

    @Mapping(target = "studyProgram", ignore = true)
    @Mapping(target = "professor", ignore = true)
    @Mapping(target = "assistant", ignore = true)
    SubjectDTO toDTO(Subject subject);
}
