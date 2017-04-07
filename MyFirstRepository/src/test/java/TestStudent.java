
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tom.myFirstRepository.beans.Student;
import com.tom.myFirstRepository.service.IStudentService;

public class TestStudent {
	private ApplicationContext ac;
	
	private IStudentService studentService;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		studentService = (IStudentService) ac.getBean("StudentServiceImpl");
	}
	
	@Test
	public void testSaveStudent(){
		Student student = new Student();
		try {
			studentService.updateStudent(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
