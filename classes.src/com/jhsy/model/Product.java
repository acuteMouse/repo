/*    */ package com.jhsy.model;
/*    */ 
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ @Entity
/*    */ public class Product
/*    */ {
/*    */   private int id;
/*    */   private String name;
/*    */   private Double number;
/*    */   private String description;
/*    */ 
/*    */   @Id
/*    */   @GeneratedValue
/*    */   public int getId()
/*    */   {
/* 17 */     return this.id;
/*    */   }
/*    */ 
/*    */   public void setId(int id) {
/* 21 */     this.id = id;
/*    */   }
/*    */ 
/*    */   public String getName() {
/* 25 */     return this.name;
/*    */   }
/*    */ 
/*    */   public void setName(String name) {
/* 29 */     this.name = name;
/*    */   }
/*    */ 
/*    */   public Double getNumber() {
/* 33 */     return this.number;
/*    */   }
/*    */ 
/*    */   public void setNumber(Double number) {
/* 37 */     this.number = number;
/*    */   }
/*    */ 
/*    */   public String getDescription() {
/* 41 */     return this.description;
/*    */   }
/*    */ 
/*    */   public void setDescription(String description) {
/* 45 */     this.description = description;
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.model.Product
 * JD-Core Version:    0.6.2
 */