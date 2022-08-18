package in.example.one_to_one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.one_to_one.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
