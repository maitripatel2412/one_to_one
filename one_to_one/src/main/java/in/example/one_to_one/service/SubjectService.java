package in.example.one_to_one.service;

import java.util.List;

import in.example.one_to_one.model.Subject;

public interface SubjectService {

	List<Subject> getAllSubjects();

	Subject saveSubject(Subject subject);

	void deleteById(Long id);

	Subject updateById(Long id, Subject subject);

	Subject findById(Long id);

}
