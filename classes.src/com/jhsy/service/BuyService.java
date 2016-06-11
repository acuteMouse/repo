/*    */ package com.jhsy.service;
/*    */ 
/*    */ import com.jhsy.dao.BuyProductDao;
/*    */ import com.jhsy.dao.ProductDao;
/*    */ import com.jhsy.model.Product;
/*    */ import com.jhsy.model.ProductIn;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.stereotype.Component;
/*    */ import org.springframework.transaction.annotation.Transactional;
/*    */ 
/*    */ @Component
/*    */ public class BuyService
/*    */ {
/*    */   private ProductDao productDao;
/*    */   private BuyProductDao buyProductDao;
/*    */ 
/*    */   public ProductDao getProductDao()
/*    */   {
/* 19 */     return this.productDao;
/*    */   }
/*    */ 
/*    */   @Resource
/*    */   public void setProductDao(ProductDao productDao)
/*    */   {
/* 25 */     this.productDao = productDao;
/*    */   }
/*    */ 
/*    */   public BuyProductDao getBuyProductDao() {
/* 29 */     return this.buyProductDao;
/*    */   }
/*    */ 
/*    */   @Resource
/*    */   public void setBuyProductDao(BuyProductDao buyProductDao)
/*    */   {
/* 35 */     this.buyProductDao = buyProductDao;
/*    */   }
/*    */ 
/*    */   @Transactional
/*    */   public void add(ProductIn pi, Product p)
/*    */   {
/* 44 */     this.buyProductDao.add(pi);
/* 45 */     this.productDao.add(p);
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.service.BuyService
 * JD-Core Version:    0.6.2
 */