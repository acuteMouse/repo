/*     */ package com.jhsy.action;
/*     */ 
/*     */ import com.jhsy.model.Product;
/*     */ import com.jhsy.model.ProductIn;
/*     */ import com.jhsy.service.BuyService;
/*     */ import java.util.Date;
/*     */ import javax.annotation.Resource;
/*     */ import org.springframework.stereotype.Component;
/*     */ 
/*     */ @Component
/*     */ public class BuyProductAction
/*     */ {
/*     */   private String id;
/*     */   private String name;
/*     */   private Double price;
/*     */   private Double number;
/*     */   private Date inTime;
/*     */   private String inWho;
/*     */   private String inFrom;
/*     */   private BuyService buyservicr;
/*     */ 
/*     */   public BuyService getBuyservicr()
/*     */   {
/*  26 */     return this.buyservicr;
/*     */   }
/*     */ 
/*     */   @Resource
/*     */   public void setBuyservicr(BuyService buyservicr)
/*     */   {
/*  32 */     this.buyservicr = buyservicr;
/*     */   }
/*     */ 
/*     */   public String getId() {
/*  36 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(String id) {
/*  40 */     this.id = id;
/*     */   }
/*     */ 
/*     */   public String getName() {
/*  44 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name) {
/*  48 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public Double getPrice() {
/*  52 */     return this.price;
/*     */   }
/*     */ 
/*     */   public void setPrice(Double price) {
/*  56 */     this.price = price;
/*     */   }
/*     */ 
/*     */   public Double getNumber() {
/*  60 */     return this.number;
/*     */   }
/*     */ 
/*     */   public void setNumber(Double number) {
/*  64 */     this.number = number;
/*     */   }
/*     */ 
/*     */   public Date getInTime() {
/*  68 */     return this.inTime;
/*     */   }
/*     */ 
/*     */   public void setInTime(Date inTime) {
/*  72 */     this.inTime = inTime;
/*     */   }
/*     */ 
/*     */   public String getInWho() {
/*  76 */     return this.inWho;
/*     */   }
/*     */ 
/*     */   public void setInWho(String inWho) {
/*  80 */     this.inWho = inWho;
/*     */   }
/*     */ 
/*     */   public String getInFrom() {
/*  84 */     return this.inFrom;
/*     */   }
/*     */ 
/*     */   public void setInFrom(String inFrom) {
/*  88 */     this.inFrom = inFrom;
/*     */   }
/*     */ 
/*     */   public String buy() {
/*  92 */     ProductIn pi = new ProductIn();
/*  93 */     pi.setInFrom(this.inFrom);
/*  94 */     pi.setInTime(this.inTime);
/*  95 */     pi.setInWho(this.inWho);
/*  96 */     pi.setName(this.name);
/*  97 */     pi.setNumber(this.number);
/*  98 */     pi.setPrice(this.price);
/*  99 */     Product p = new Product();
/* 100 */     p.setName(this.name);
/* 101 */     p.setNumber(this.number);
/* 102 */     this.buyservicr.add(pi, p);
/* 103 */     return "success";
/*     */   }
/*     */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.action.BuyProductAction
 * JD-Core Version:    0.6.2
 */