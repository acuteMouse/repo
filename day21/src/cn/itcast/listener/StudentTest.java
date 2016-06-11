package cn.itcast.listener;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("����");
		
		//ע�������
		s.addStudentListener(new StudentListener() {
			
			public void preStudy(StudentEvent e) {
				Student ss = (Student) e.getSource();
				System.out.println(ss.getName()+"�ȱ��̰�");
			}
			
			public void preEat(StudentEvent e) {
				Student ss = (Student) e.getSource();
				System.out.println(ss.getName()+"������");
			}
		});
		
		s.eat();
		s.study();
	}

}
