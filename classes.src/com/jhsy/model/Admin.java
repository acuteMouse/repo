/*    */ package com.jhsy.model;
/*    */ 
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ @Entity
/*    */ public class Admin
/*    */ {
/*    */   private int id;
/*    */   private String name;
/*    */   private String password;
/*    */ 
/*    */   @Id
/*    */   @GeneratedValue
/*    */   public int getId()
/*    */   {
/* 22 */     return this.id;
/*    */   }
/*    */ 
/*    */   public void setId(int id) {
/* 26 */     this.id = id;
/*    */   }
/*    */ 
/*    */   public String getName() {
/* 30 */     return this.name;
/*    */   }
/*    */ 
/*    */   public void setName(String name) {
/* 34 */     this.name = name;
/*    */   }
/*    */ 
/*    */   public String getPassword() {
/* 38 */     return this.password;
/*    */   }
/*    */ 
/*    */   public void setPassword(String password) {
/* 42 */     this.password = password;
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.model.Admin
 * JD-Core Version:    0.6.2
 */