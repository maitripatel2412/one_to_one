package in.example.one_to_one.service;

import java.util.List;

import in.example.one_to_one.model.Teacher;


public interface TeacherService {

	Teacher saveTeacher(Teacher teacher);

	List<Teacher> getAllTeacher();

	Teacher findById(Long id);

	void deleteById(Long id);

	Teacher updateTeacher(Long id,Teacher teacher);
	
}
