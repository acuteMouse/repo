package cn.itcast.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ�����ϴ����ļ�����װ��������У�����jspȥ��ʾ
public class ShowAllFilesServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String> map = new HashMap<String, String>();//key��UUID�ļ�����value�����ļ���
		//�õ��洢�ļ��ĸ�Ŀ¼
		String storePath = getServletContext().getRealPath("/WEB-INF/files");
		//�ݹ���������ļ�
		File file = new File(storePath);
		treeWalk(file,map);
		//����JSPȥ��ʾ����η�װ����.��Map��װ��key��UUID�ļ�����value�����ļ���
		request.setAttribute("map", map);
		request.getRequestDispatcher("/listFiles.jsp").forward(request, response);
	}
	//����/WEB-INF/files�����ļ������ļ����ŵ�map��
	private void treeWalk(File file, Map<String, String> map) {
		if(file.isFile()){
			//���ļ�
			String uuidName = file.getName();//  UUID_a_a.txt//��ʵ�ļ���
			String oldName = uuidName.substring(uuidName.indexOf("_")+1);
			map.put(uuidName, oldName);
		}else{
			//��һ��Ŀ¼
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
