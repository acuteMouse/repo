/*     */ package com.jhsy.daoImpl;
/*     */ 
/*     */ import com.jhsy.dao.AdminDao;
/*     */ import com.jhsy.model.Admin;
/*     */ import java.io.PrintStream;
/*     */ import java.util.List;
/*     */ import javax.annotation.Resource;
/*     */ import org.hibernate.SessionFactory;
/*     */ import org.springframework.orm.hibernate3.HibernateTemplate;
/*     */ import org.springframework.stereotype.Component;
/*     */ 
/*     */ @Component("adminDao")
/*     */ public class AdminDaoImpl
/*     */   implements AdminDao
/*     */ {
/*     */   private SessionFactory sessionFactory;
/*     */   private HibernateTemplate hibernateTemplate;
/*     */ 
/*     */   public SessionFactory getSessionFactory()
/*     */   {
/*  29 */     return this.sessionFactory;
/*     */   }
/*     */ 
/*     */   @Resource
/*     */   public void setSessionFactory(SessionFactory sessionFactory) {
/*  34 */     this.sessionFactory = sessionFactory;
/*     */   }
/*     */ 
/*     */   public HibernateTemplate getHibernateTemplate()
/*     */   {
/*  41 */     return this.hibernateTemplate;
/*     */   }
/*     */ 
/*     */   @Resource
/*     */   public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
/*     */   {
/*  47 */     this.hibernateTemplate = hibernateTemplate;
/*     */   }
/*     */ 
/*     */   public void add(Admin admin)
/*     */   {
/*  54 */     this.hibernateTemplate.save(admin);
/*     */   }
/*     */ 
/*     */   public List<Admin> findAllAdmin()
/*     */   {
/*  63 */     List admins = this.hibernateTemplate.find("from Admin ");
/*     */ 
/*  65 */     return admins;
/*     */   }
/*     */ 
/*     */   public int findTotal()
/*     */   {
/*  74 */     String sql = "select count(*) from Admin";
/*  75 */     List users = this.hibernateTemplate.find(sql);
/*  76 */     int total = users.size();
/*  77 */     return total;
/*     */   }
/*     */ 
/*     */   public void updateAdmin(Admin a)
/*     */   {
/*  85 */     this.hibernateTemplate.update(a);
/*     */   }
/*     */ 
/*     */   public void deleteAdmin(Admin a)
/*     */   {
/*  92 */     this.hibernateTemplate.delete(a);
/*     */   }
/*     */ 
/*     */   public Admin findAdminByName(String name) {
/*  96 */     String sql = "from Admin where name='" + name + "'";
/*  97 */     List a = this.hibernateTemplate.find(sql);
/*  98 */     System.out.println(a.size());
/*  99 */     if (!a.isEmpty()) {
/* 100 */       return (Admin)a.get(0);
/*     */     }
/* 102 */     return null;
/*     */   }
/*     */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.daoImpl.AdminDaoImpl
 * JD-Core Version:    0.6.2
 */