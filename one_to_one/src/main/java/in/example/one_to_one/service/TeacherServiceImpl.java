package in.example.one_to_one.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.example.one_to_one.model.Subject;
import in.example.one_to_one.model.Teacher;
import in.example.one_to_one.repository.SubjectRepository;
import in.example.one_to_one.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository tRepository;

	@Autowired
	private SubjectRepository subRepo;

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// check subject is present
		// if subject is present then save as noraml
		// else save subject and set subject in teacher then after save

		Subject sub = teacher.getSubject();
		Optional<Subject> findById = subRepo.findById(sub.getId());

		if (findById.isEmpty()) {
			Subject subjectSaved = subRepo.save(sub);
			teacher.setSubject(subjectSaved);
		}

		return tRepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return tRepository.findAll();
	}

	@Override
	public Teacher findById(Long id) {
		return tRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		tRepository.deleteById(id);
	}

	@Override
	public Teacher updateTeacher(Long id, Teacher teacher) {
		Teacher old = tRepository.findById(id).get();
		teacher.setId(id);
		return tRepository.save(teacher);
	}

}
