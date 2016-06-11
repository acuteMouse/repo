package cn.itcast.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//显示所有上传的文件，封装到域对象中，交给jsp去显示
public class ShowAllFilesServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String> map = new HashMap<String, String>();//key：UUID文件名；value：老文件名
		//得到存储文件的根目录
		String storePath = getServletContext().getRealPath("/WEB-INF/files");
		//递归遍历其中文件
		File file = new File(storePath);
		treeWalk(file,map);
		//交给JSP去显示：如何封装数据.用Map封装。key：UUID文件名；value：老文件名
		request.setAttribute("map", map);
		request.getRequestDispatcher("/listFiles.jsp").forward(request, response);
	}
	//遍历/WEB-INF/files所有文件，把文件名放到map中
	private void treeWalk(File file, Map<String, String> map) {
		if(file.isFile()){
			//是文件
			String uuidName = file.getName();//  UUID_a_a.txt//真实文件名
			String oldName = uuidName.substring(uuidName.indexOf("_")+1);
			map.put(uuidName, oldName);
		}else{
			//是一个目录
			File[] fs = file.listFiles();
			for(File f:fs){
				treeWalk(f,map);
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
