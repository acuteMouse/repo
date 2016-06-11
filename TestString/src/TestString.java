import org.junit.Test;



public class TestString {
		@Test
		public void testString(){
			String ids="1,2,3,4,5";
			String id[]=ids.split(",");
			System.out.println(id[1]);
			System.out.println(id[2]);
			System.out.println(id[3]);
			System.out.println(id[4]);
			System.out.println(id[0]);
			System.out.println("----------");
			System.out.println(id.length);
			
		}
		@Test
		public void testEqu(){
			String s1="超级管理员";
			String s2="超级管理员";

			String s3="管理员";
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			
		}
}
