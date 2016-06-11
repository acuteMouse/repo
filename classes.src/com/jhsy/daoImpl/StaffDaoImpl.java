/*    */ package com.jhsy.daoImpl;
/*    */ 
/*    */ import com.jhsy.dao.StaffDao;
/*    */ import com.jhsy.model.Staff;
/*    */ import java.util.List;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.orm.hibernate3.HibernateTemplate;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component("staffDao")
/*    */ public class StaffDaoImpl
/*    */   implements StaffDao
/*    */ {
/*    */   private HibernateTemplate hibernateTemplate;
/*    */ 
/*    */   public HibernateTemplate getHibernateTemplate()
/*    */   {
/* 19 */     return this.hibernateTemplate;
/*    */   }
/*    */ 
/*    */   @Resource
/*    */   public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
/* 24 */     this.hibernateTemplate = hibernateTemplate;
/*    */   }
/*    */ 
/*    */   public List findAllStaff()
/*    */   {
/* 31 */     List sList = this.hibernateTemplate.find("from Staff ");
/* 32 */     return sList;
/*    */   }
/*    */ 
/*    */   public void addStaff(Staff s)
/*    */   {
/* 39 */     this.hibernateTemplate.saveOrUpdate(s);
/*    */   }
/*    */ 
/*    */   public void deleteStaff(Staff s)
/*    */   {
/* 47 */     this.hibernateTemplate.delete(s);
/*    */   }
/*    */ 
/*    */   public void updateStaff(Staff s)
/*    */   {
/* 53 */     this.hibernateTemplate.update(s);
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.daoImpl.StaffDaoImpl
 * JD-Core Version:    0.6.2
 */