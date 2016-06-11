package date;


/**
 * 过时
 * @author Administrator
 *
 */
public class TestDate {
			//使用异或运算交换两个变量赋值
		public static void  getChange(int a,int b){
			 a=a^b;
			 b=b^a;
			 a=b^a;
			System.out.println(a);
			System.out.println(b);	
			
		}
		public static void main(String[] args) {
//			Date today=new Date();
//			System.out.println(today);
//			System.out.println(today.getDate());
//			System.out.println(today.getHours());
//			System.out.println(today.getDay());
//			System.out.println(today.getMonth());
//			System.out.println(today.getYear()+1900);
			getChange(5, 4);
			getChange(100, 4);
		}
}
