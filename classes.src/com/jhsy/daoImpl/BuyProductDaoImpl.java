/*    */ package com.jhsy.daoImpl;
/*    */ 
/*    */ import com.jhsy.dao.BuyProductDao;
/*    */ import com.jhsy.model.ProductIn;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.orm.hibernate3.HibernateTemplate;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component("buyProductDao")
/*    */ public class BuyProductDaoImpl
/*    */   implements BuyProductDao
/*    */ {
/*    */   private HibernateTemplate hibernateTemplate;
/*    */ 
/*    */   public HibernateTemplate getHibernateTemplate()
/*    */   {
/* 15 */     return this.hibernateTemplate;
/*    */   }
/*    */   @Resource
/*    */   public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
/* 19 */     this.hibernateTemplate = hibernateTemplate;
/*    */   }
/*    */ 
/*    */   public void add(ProductIn pi)
/*    */   {
/* 26 */     this.hibernateTemplate.save(pi);
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.daoImpl.BuyProductDaoImpl
 * JD-Core Version:    0.6.2
 */