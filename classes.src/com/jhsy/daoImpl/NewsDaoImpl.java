/*    */ package com.jhsy.daoImpl;
/*    */ 
/*    */ import com.jhsy.dao.NewsDao;
/*    */ import com.jhsy.model.News;
/*    */ import java.io.PrintStream;
/*    */ import java.util.List;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.orm.hibernate3.HibernateTemplate;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component("newsDAo")
/*    */ public class NewsDaoImpl
/*    */   implements NewsDao
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
/*    */   public List<News> findAll() {
/* 27 */     List nl = this.hibernateTemplate.find("from News");
/*    */ 
/* 29 */     return nl;
/*    */   }
/*    */ 
/*    */   public News findNewsByTitle(String title)
/*    */   {
/* 34 */     System.out.println(title);
/* 35 */     List nl = this.hibernateTemplate.find("from News where title='" + title + "'");
/*    */ 
/* 37 */     if (nl.size() > 0) {
/* 38 */       News n = (News)nl.get(0);
/* 39 */       return n;
/*    */     }
/*    */ 
/* 42 */     return null;
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.daoImpl.NewsDaoImpl
 * JD-Core Version:    0.6.2
 */