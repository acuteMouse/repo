package cn.itcast.listener;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("¸ğ¸¶ÒÔ");
		
		//×¢²á¼àÌıÆ÷
		s.addStudentListener(new StudentListener() {
			
			public void preStudy(StudentEvent e) {
				Student ss = (Student) e.getSource();
				System.out.println(ss.getName()+"ºÈ±­ÄÌ°É");
			}
			
			public void preEat(StudentEvent e) {
				Student ss = (Student) e.getSource();
				System.out.println(ss.getName()+"ÂıÂı³Ô");
			}
		});
		
		s.eat();
		s.study();
	}

}
