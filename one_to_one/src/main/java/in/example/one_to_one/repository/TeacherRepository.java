package in.example.one_to_one.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.one_to_one.model.Teacher;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
	
}
