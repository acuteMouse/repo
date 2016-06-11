package com.zy.salary.model;
/**
 * 职位表
 * @author 陈桂林
 *
 */
public class Job {
	private int id; // 主键
	private String jobName;//职位名称
	private Double jobSalary;//岗位工资
	private Double baseSalary;// 部门基本工资
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Double getJobSalary() {
		return jobSalary;
	}
	public void setJobSalary(Double jobSalary) {
		this.jobSalary = jobSalary;
	}
	
}
