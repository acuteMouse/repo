package com.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.mappers.StudentMapper;
import com.mybaties.model.Student;
import com.utils.MybatiesUtils;

public class TestMybaties {
		public static void main(String[] args) throws IOException {
			SqlSession sql=MybatiesUtils.opSession();
			StudentMapper studentMapper=sql.getMapper(StudentMapper.class);
			Student student=new Student("张三", 15);
			studentMapper.add(student);
			
		}
}
