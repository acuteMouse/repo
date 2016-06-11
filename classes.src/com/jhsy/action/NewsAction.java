/*     */ package com.jhsy.action;
/*     */ 
/*     */ import com.jhsy.model.News;
/*     */ import com.jhsy.service.NewsService;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.Reader;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.sql.Clob;
/*     */ import java.sql.Date;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Resource;
/*     */ import org.hibernate.lob.SerializableClob;
/*     */ import org.springframework.stereotype.Component;
/*     */ 
/*     */ @Component
/*     */ public class NewsAction
/*     */ {
/*     */   private int id;
/*     */   private String title;
/*     */   private Clob text;
/*     */   private Date writeDate;
/*     */   private String author;
/*     */   private Map responseJson;
/*     */   private String ids;
/*     */   private NewsService newsService;
/*     */   private List<News> list;
/*     */   private News news;
/*     */ 
/*     */   public News getNews()
/*     */   {
/*  41 */     return this.news;
/*     */   }
/*     */   public void setNews(News news) {
/*  44 */     this.news = news;
/*     */   }
/*     */   public List<News> getList() {
/*  47 */     return this.list;
/*     */   }
/*     */   public void setList(List<News> list) {
/*  50 */     this.list = list;
/*     */   }
/*     */   public NewsService getNewsService() {
/*  53 */     return this.newsService;
/*     */   }
/*     */   @Resource
/*     */   public void setNewsService(NewsService newsService) {
/*  57 */     this.newsService = newsService;
/*     */   }
/*     */   public int getId() {
/*  60 */     return this.id;
/*     */   }
/*     */   public void setId(int id) {
/*  63 */     this.id = id;
/*     */   }
/*     */   public String getTitle() {
/*  66 */     return this.title;
/*     */   }
/*     */   public void setTitle(String title) {
/*  69 */     this.title = title;
/*     */   }
/*     */   public Clob getText() {
/*  72 */     return this.text;
/*     */   }
/*     */   public void setText(Clob text) {
/*  75 */     this.text = text;
/*     */   }
/*     */   public Date getWriteDate() {
/*  78 */     return this.writeDate;
/*     */   }
/*     */   public void setWriteDate(Date writeDate) {
/*  81 */     this.writeDate = writeDate;
/*     */   }
/*     */   public String getAuthor() {
/*  84 */     return this.author;
/*     */   }
/*     */   public void setAuthor(String author) {
/*  87 */     this.author = author;
/*     */   }
/*     */   public Map getResponseJson() {
/*  90 */     return this.responseJson;
/*     */   }
/*     */   public void setResponseJson(Map responseJson) {
/*  93 */     this.responseJson = responseJson;
/*     */   }
/*     */   public String getIds() {
/*  96 */     return this.ids;
/*     */   }
/*     */   public void setIds(String ids) {
/*  99 */     this.ids = ids;
/*     */   }
/*     */ 
/*     */   public String selectNews()
/*     */   {
/* 104 */     this.list = this.newsService.findAll();
/*     */ 
/* 106 */     return "success";
/*     */   }
/*     */ 
/*     */   public String ajaxSelectNews()
/*     */   {
/* 112 */     this.list = this.newsService.findAll();
/* 113 */     return "success";
/*     */   }
/*     */   public String selectNewsByTitle() throws UnsupportedEncodingException {
/* 116 */     this.news = this.newsService.findNewsByTitle(new String(this.title.getBytes("iso8859-1"), "utf-8"));
/*     */ 
/* 118 */     return "success";
/*     */   }
/*     */ 
/*     */   public String getClob(SerializableClob c) {
/* 122 */     StringBuffer sb = new StringBuffer();
/*     */     try {
/* 124 */       Reader reader = c.getCharacterStream();
/* 125 */       BufferedReader br = new BufferedReader(reader);
/* 126 */       String temp = null;
/* 127 */       while ((temp = br.readLine()) != null)
/* 128 */         sb.append(temp);
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/* 133 */     return sb.toString();
/*     */   }
/*     */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.action.NewsAction
 * JD-Core Version:    0.6.2
 */