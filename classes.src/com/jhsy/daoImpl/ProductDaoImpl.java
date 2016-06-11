/*    */ package com.jhsy.daoImpl;
/*    */ 
/*    */ import com.jhsy.dao.ProductDao;
/*    */ import com.jhsy.model.Product;
/*    */ import java.util.List;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.orm.hibernate3.HibernateTemplate;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component("productDao")
/*    */ public class ProductDaoImpl
/*    */   implements ProductDao
/*    */ {
/*    */   private HibernateTemplate hibernateTemplate;
/*    */ 
/*    */   public HibernateTemplate getHibernateTemplate()
/*    */   {
/* 18 */     return this.hibernateTemplate;
/*    */   }
/*    */ 
/*    */   @Resource
/*    */   public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
/* 23 */     this.hibernateTemplate = hibernateTemplate;
/*    */   }
/*    */ 
/*    */   public List<Product> select()
/*    */   {
/* 37 */     List lp = this.hibernateTemplate.find("from Product");
/* 38 */     return lp;
/*    */   }
/*    */ 
/*    */   public void add(Product p)
/*    */   {
/* 44 */     this.hibernateTemplate.save(p);
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.daoImpl.ProductDaoImpl
 * JD-Core Version:    0.6.2
 */