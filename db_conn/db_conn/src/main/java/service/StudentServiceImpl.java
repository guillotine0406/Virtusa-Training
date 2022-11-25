package service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import model.Student;
import repository.StudentRepository;

@Service
public class StudentServiceImpl {
	@Autowired
	private StudentRepository studrep;
	@Override
	public List<Student> getAllStudents(){
		return studrep.findAll();
	}
	@Override
	public void saveStudent(Student stud) {
		this.studrep.save(stud);
	}
	@Override
	public Student getStudentByID(long ID) {
		Optional<Student> opt=studrep.findById((int)ID);
		Student stud=null;
		if(opt.isPresent()) {
			stud=opt.get();
		}
		else {
			throw new RuntimeException("Student not found for ID:"+ID);
		}
		return stud;
	}
	@Override
	public void deleteStudent(long ID) {
		this.studrep.deleteById((int) ID);
	}
	@Override
	public Page<Student> findPaginated(int pageNo,int ps, String sortf, String sortd){
		Sort s=sortd.equalsIgnoreCase(Sort.Direction.ASC.name())?Sort.by(sortf).ascending():Sort.by(sortf).descending();
		Pageable pga=PageRequest.of(pageNo-1, ps,s);
		return this.studrep.findAll(pga);
	}
}
