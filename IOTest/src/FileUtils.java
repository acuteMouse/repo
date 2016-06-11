import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.naming.LinkLoopException;

public class FileUtils {
	/*
	 * 读数据
	 */
	static FileReader fr = null;

	public static StringBuffer getMessage(String fileName) throws IOException {

		fr = new FileReader(fileName);

		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		StringBuffer sb = new StringBuffer();
		while (s != null) {
			sb.append(s);
			s = br.readLine();
		}
		return sb;

	}

	/**
	 * 
	 * @param fileName	文件 全路径名
	 * @param s  要添加的信息
	 */
	public static void writeMessage(String fileName, String s) {
		try {
			FileWriter fw = new FileWriter(fileName, true);
			fw.write(s + "#\r\n");
			fw.flush();
			fw.close(); // 关闭流
		} catch (IOException e) {
			System.out.println("文件不存在");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
//		writeMessage("/E:学习计划.txt", "尼玛");
		String s = getMessage("/E:学习计划.txt").toString();
		System.out.println(s);
		String[] sl=s.split(";");
//		for (String string : sl) {
//			System.out.println(string);
//		}
			List<User> userlist=new LinkedList<User>();
			for (int i = 0; i < sl.length; i++) {
				String[] strings=sl[i].split("#");
				User u=new User();
				u.setAge(strings[1]);
				u.setName(strings[0]);
				userlist.add(u);
			}
			System.out.println(userlist.size()+"list");
			for (User user : userlist) {
				System.out.println("姓名"+user.getName());
				System.out.println("年龄"+user.getAge());
			}
	}
}