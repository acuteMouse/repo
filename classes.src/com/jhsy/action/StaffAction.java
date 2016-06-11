/*     */ package com.jhsy.action;
/*     */ 
/*     */ import com.jhsy.model.Staff;
/*     */ import com.jhsy.service.StaffService;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Resource;
/*     */ import net.sf.json.JSONObject;
/*     */ import org.springframework.stereotype.Component;
/*     */ 
/*     */ @Component
/*     */ public class StaffAction
/*     */ {
/*     */   private int id;
/*     */   private String sex;
/*     */   private String name;
/*     */   private Date birthday;
/*     */   private Date startTime;
/*     */   private int salary;
/*     */   private int phone;
/*     */   private StaffService staffService;
/*     */   private Map responseJson;
/*     */   private String ids;
/*     */ 
/*     */   public Map getResponseJson()
/*     */   {
/*  33 */     return this.responseJson;
/*     */   }
/*     */ 
/*     */   public void setResponseJson(Map responseJson) {
/*  37 */     this.responseJson = responseJson;
/*     */   }
/*     */ 
/*     */   public String getIds() {
/*  41 */     return this.ids;
/*     */   }
/*     */ 
/*     */   public void setIds(String ids) {
/*  45 */     this.ids = ids;
/*     */   }
/*     */ 
/*     */   public StaffService getStaffService() {
/*  49 */     return this.staffService;
/*     */   }
/*     */ 
/*     */   @Resource
/*     */   public void setStaffService(StaffService staffService) {
/*  54 */     this.staffService = staffService;
/*     */   }
/*     */ 
/*     */   public int getId() {
/*  58 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(int id) {
/*  62 */     this.id = id;
/*     */   }
/*     */ 
/*     */   public String getSex() {
/*  66 */     return this.sex;
/*     */   }
/*     */ 
/*     */   public void setSex(String sex) {
/*  70 */     this.sex = sex;
/*     */   }
/*     */ 
/*     */   public String getName() {
/*  74 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name) {
/*  78 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public Date getBirthday() {
/*  82 */     return this.birthday;
/*     */   }
/*     */ 
/*     */   public void setBirthday(Date birthday) {
/*  86 */     this.birthday = birthday;
/*     */   }
/*     */ 
/*     */   public Date getStartTime() {
/*  90 */     return this.startTime;
/*     */   }
/*     */ 
/*     */   public void setStartTime(Date startTime) {
/*  94 */     this.startTime = startTime;
/*     */   }
/*     */ 
/*     */   public int getSalary() {
/*  98 */     return this.salary;
/*     */   }
/*     */ 
/*     */   public void setSalary(int salary) {
/* 102 */     this.salary = salary;
/*     */   }
/*     */ 
/*     */   public int getPhone() {
/* 106 */     return this.phone;
/*     */   }
/*     */ 
/*     */   public void setPhone(int phone) {
/* 110 */     this.phone = phone;
/*     */   }
/*     */ 
/*     */   public String selectStaffs()
/*     */     throws Exception
/*     */   {
/* 121 */     Map map = new HashMap();
/* 122 */     List list = new ArrayList();
/*     */ 
/* 124 */     List staffList = this.staffService.findAllStaff();
/* 125 */     int total = staffList.size();
/*     */ 
/* 127 */     for (int i = 0; i < staffList.size(); i++) {
/* 128 */       Staff s = (Staff)staffList.get(i);
/* 129 */       JSONObject jo = new JSONObject();
/* 130 */       jo.put("id", Integer.valueOf(s.getId()));
/* 131 */       jo.put("name", s.getName());
/* 132 */       jo.put("sex", s.getSex());
/* 133 */       jo.put("birthday", s.getBirthday().toLocaleString());
/* 134 */       jo.put("startTime", s.getStartTime().toLocaleString());
/* 135 */       jo.put("phone", Integer.valueOf(s.getPhone()));
/* 136 */       jo.put("salary", Integer.valueOf(s.getSalary()));
/* 137 */       list.add(jo);
/*     */     }
/* 139 */     map.put("rows", list);
/* 140 */     map.put("total", Integer.valueOf(total));
/* 141 */     setResponseJson(map);
/* 142 */     return "success";
/*     */   }
/*     */ 
/*     */   public String addStaff()
/*     */   {
/* 149 */     Staff s = new Staff();
/* 150 */     s.setName(this.name);
/* 151 */     s.setPhone(this.phone);
/* 152 */     s.setBirthday(this.birthday);
/* 153 */     s.setSex(this.sex);
/* 154 */     s.setSalary(this.salary);
/* 155 */     s.setStartTime(this.startTime);
/* 156 */     this.staffService.addStaff(s);
/* 157 */     return "none";
/*     */   }
/*     */ 
/*     */   public String deleteStaff()
/*     */   {
/* 163 */     String[] Stringid = this.ids.split(",");
/*     */ 
/* 165 */     for (int i = 0; i < Stringid.length; i++) {
/* 166 */       Staff s = new Staff();
/* 167 */       int Sid = Integer.parseInt(Stringid[i]);
/* 168 */       s.setId(Sid);
/* 169 */       this.staffService.deleteStaffById(s);
/*     */     }
/* 171 */     return "success";
/*     */   }
/*     */ 
/*     */   public String updateStaff() {
/* 175 */     Staff s = new Staff();
/* 176 */     s.setId(this.id);
/* 177 */     s.setName(this.name);
/* 178 */     s.setBirthday(this.birthday);
/* 179 */     s.setPhone(this.phone);
/* 180 */     s.setSalary(this.salary);
/* 181 */     s.setSex(this.sex);
/* 182 */     s.setStartTime(this.startTime);
/* 183 */     this.staffService.updateStaff(s);
/*     */ 
/* 185 */     return "success";
/*     */   }
/*     */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.action.StaffAction
 * JD-Core Version:    0.6.2
 */