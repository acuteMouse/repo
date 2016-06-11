/*    */ package com.jhsy.model;
/*    */ 
/*    */ import java.util.Date;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ @Entity
/*    */ public class ProductIn
/*    */ {
/*    */   private int id;
/*    */   private String name;
/*    */   private Double price;
/*    */   private Double number;
/*    */   private Date inTime;
/*    */   private String inWho;
/*    */   private String inFrom;
/*    */ 
/*    */   @Id
/*    */   @GeneratedValue
/*    */   public int getId()
/*    */   {
/* 28 */     return this.id;
/*    */   }
/*    */ 
/*    */   public void setId(int id) {
/* 32 */     this.id = id;
/*    */   }
/*    */ 
/*    */   public String getName() {
/* 36 */     return this.name;
/*    */   }
/*    */ 
/*    */   public void setName(String name) {
/* 40 */     this.name = name;
/*    */   }
/*    */ 
/*    */   public Double getPrice() {
/* 44 */     return this.price;
/*    */   }
/*    */ 
/*    */   public void setPrice(Double price) {
/* 48 */     this.price = price;
/*    */   }
/*    */ 
/*    */   public Double getNumber() {
/* 52 */     return this.number;
/*    */   }
/*    */ 
/*    */   public void setNumber(Double number) {
/* 56 */     this.number = number;
/*    */   }
/*    */ 
/*    */   public Date getInTime() {
/* 60 */     return this.inTime;
/*    */   }
/*    */ 
/*    */   public void setInTime(Date inTime) {
/* 64 */     this.inTime = inTime;
/*    */   }
/*    */ 
/*    */   public String getInWho() {
/* 68 */     return this.inWho;
/*    */   }
/*    */ 
/*    */   public void setInWho(String inWho) {
/* 72 */     this.inWho = inWho;
/*    */   }
/*    */ 
/*    */   public String getInFrom() {
/* 76 */     return this.inFrom;
/*    */   }
/*    */ 
/*    */   public void setInFrom(String inFrom) {
/* 80 */     this.inFrom = inFrom;
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.model.ProductIn
 * JD-Core Version:    0.6.2
 */