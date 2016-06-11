/*    */ package com.jhsy.service;
/*    */ 
/*    */ import com.jhsy.dao.NewsDao;
/*    */ import com.jhsy.model.News;
/*    */ import java.util.List;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component
/*    */ public class NewsService
/*    */ {
/*    */   private NewsDao newsDao;
/*    */ 
/*    */   public NewsDao getNewsDao()
/*    */   {
/* 17 */     return this.newsDao;
/*    */   }
/*    */   @Resource
/*    */   public void setNewsDao(NewsDao newsDao) {
/* 21 */     this.newsDao = newsDao;
/*    */   }
/*    */   public List findAll() {
/* 24 */     List nl = this.newsDao.findAll();
/*    */ 
/* 26 */     return nl;
/*    */   }
/*    */ 
/*    */   public News findNewsByTitle(String title) {
/* 30 */     News n = this.newsDao.findNewsByTitle(title);
/*    */ 
/* 32 */     return n;
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.service.NewsService
 * JD-Core Version:    0.6.2
 */