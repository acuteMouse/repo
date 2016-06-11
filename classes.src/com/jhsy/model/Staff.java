/*    */ package com.jhsy.model;
/*    */ 
/*    */ import java.util.Date;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ @Entity
/*    */ public class Staff
/*    */ {
/*    */   private int id;
/*    */   private String sex;
/*    */   private String name;
/*    */   private Date birthday;
/*    */   private Date startTime;
/*    */   private int salary;
/*    */   private int phone;
/*    */ 
/*    */   @Id
/*    */   @GeneratedValue
/*    */   public int getId()
/*    */   {
/* 23 */     return this.id;
/*    */   }
/*    */   public void setId(int id) {
/* 26 */     this.id = id;
/*    */   }
/*    */   public String getSex() {
/* 29 */     return this.sex;
/*    */   }
/*    */   public void setSex(String sex) {
/* 32 */     this.sex = sex;
/*    */   }
/*    */   public String getName() {
/* 35 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 38 */     this.name = name;
/*    */   }
/*    */   public Date getBirthday() {
/* 41 */     return this.birthday;
/*    */   }
/*    */   public void setBirthday(Date birthday) {
/* 44 */     this.birthday = birthday;
/*    */   }
/*    */   public Date getStartTime() {
/* 47 */     return this.startTime;
/*    */   }
/*    */   public void setStartTime(Date startTime) {
/* 50 */     this.startTime = startTime;
/*    */   }
/*    */   public int getSalary() {
/* 53 */     return this.salary;
/*    */   }
/*    */   public void setSalary(int salary) {
/* 56 */     this.salary = salary;
/*    */   }
/*    */   public int getPhone() {
/* 59 */     return this.phone;
/*    */   }
/*    */   public void setPhone(int phone) {
/* 62 */     this.phone = phone;
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.model.Staff
 * JD-Core Version:    0.6.2
 */