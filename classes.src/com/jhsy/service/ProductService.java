/*    */ package com.jhsy.service;
/*    */ 
/*    */ import com.jhsy.dao.ProductDao;
/*    */ import com.jhsy.model.Product;
/*    */ import java.util.List;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component
/*    */ public class ProductService
/*    */ {
/*    */   private ProductDao productDao;
/*    */ 
/*    */   public ProductDao getProductDao()
/*    */   {
/* 17 */     return this.productDao;
/*    */   }
/*    */ 
/*    */   @Resource
/*    */   public void setProductDao(ProductDao productDao) {
/* 22 */     this.productDao = productDao;
/*    */   }
/*    */ 
/*    */   public List<Product> findAllProduct()
/*    */   {
/* 29 */     List lp = this.productDao.select();
/* 30 */     return lp;
/*    */   }
/*    */ 
/*    */   public void saveOrUpdate(Product p) {
/* 34 */     this.productDao.add(p);
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.service.ProductService
 * JD-Core Version:    0.6.2
 */