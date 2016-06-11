/*    */ package com.jhsy.model;
/*    */ 
/*    */ import java.sql.Clob;
/*    */ import java.sql.Date;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ @Entity
/*    */ public class News
/*    */ {
/*    */   private int id;
/*    */   private String title;
/*    */   private Clob text;
/*    */   private Date writeDate;
/*    */   private String author;
/*    */ 
/*    */   public int getId()
/*    */   {
/* 17 */     return this.id;
/*    */   }
/*    */   public void setId(int id) {
/* 20 */     this.id = id;
/*    */   }
/* 25 */   @Id
/*    */   @GeneratedValue
/*    */   public String getTitle() { return this.title; }
/*    */ 
/*    */   public void setTitle(String title) {
/* 28 */     this.title = title;
/*    */   }
/*    */   public Clob getText() {
/* 31 */     return this.text;
/*    */   }
/*    */   public void setText(Clob text) {
/* 34 */     this.text = text;
/*    */   }
/*    */   public Date getWriteDate() {
/* 37 */     return this.writeDate;
/*    */   }
/*    */   public void setWriteDate(Date writeDate) {
/* 40 */     this.writeDate = writeDate;
/*    */   }
/*    */   public String getAuthor() {
/* 43 */     return this.author;
/*    */   }
/*    */   public void setAuthor(String author) {
/* 46 */     this.author = author;
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.model.News
 * JD-Core Version:    0.6.2
 */