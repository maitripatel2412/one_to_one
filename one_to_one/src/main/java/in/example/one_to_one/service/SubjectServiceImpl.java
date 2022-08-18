package in.example.one_to_one.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.example.one_to_one.model.Subject;
import in.example.one_to_one.model.Teacher;
import in.example.one_to_one.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRepository sRepository;
	
	@Override
	public List<Subject> getAllSubjects() {
		return sRepository.findAll();
	}

	@Override
	public Subject saveSubject(Subject subject) {
		return sRepository.save(subject);
	}

	@Override
	public void deleteById(Long id) {
		sRepository.deleteById(id);
	}

	@Override
	public Subject updateById(Long id, Subject subject) {
		Subject old = sRepository.findById(id).get();
		subject.setId(id);
		return sRepository.save(subject);
	}

	@Override
	public Subject findById(Long id) {
		return sRepository.findById(id).get();
	}
}
