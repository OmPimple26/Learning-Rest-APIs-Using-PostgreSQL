package com.springBoot.LearningRESTAPIs.service;

import com.springBoot.LearningRESTAPIs.dto.AddStudentRequestDTO;
import com.springBoot.LearningRESTAPIs.dto.StudentDTO;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDTO> getAllStudents();

    StudentDTO getStudentById(Long id);

    StudentDTO createNewStudent(AddStudentRequestDTO addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDTO updateStudent(Long id, AddStudentRequestDTO addStudentRequestDto);

    StudentDTO updatePartialStudent(Long id, Map<String, Object> updates);
}