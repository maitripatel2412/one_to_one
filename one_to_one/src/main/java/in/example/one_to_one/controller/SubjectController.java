package in.example.one_to_one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.example.one_to_one.model.Subject;
import in.example.one_to_one.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	
	@Autowired
	private SubjectService sService;
	
	@GetMapping
	public String subject() {
		return "helloooooooooooooooooo";
	}
	
	@GetMapping("/getall")
	public List<Subject> getAllSubjects(){
		return sService.getAllSubjects();
	}
	
	@PostMapping("/save")
	public Subject saveSubject(@RequestBody Subject subject) {
		return sService.saveSubject(subject);
	}
	
	@GetMapping("/{id}")
	public Subject findById(@PathVariable Long id) {
		return sService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Subject updateById(@PathVariable Long id,@RequestBody Subject subject) {
		return sService.updateById(id,subject);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		sService.deleteById(id);
	}

}
