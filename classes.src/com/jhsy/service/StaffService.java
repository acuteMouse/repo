/*    */ package com.jhsy.service;
/*    */ 
/*    */ import com.jhsy.dao.StaffDao;
/*    */ import com.jhsy.model.Staff;
/*    */ import java.util.List;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component
/*    */ public class StaffService
/*    */ {
/*    */   private StaffDao staffDao;
/*    */ 
/*    */   public StaffDao getStaffDao()
/*    */   {
/* 17 */     return this.staffDao;
/*    */   }
/*    */ 
/*    */   @Resource
/*    */   public void setStaffDao(StaffDao staffDao) {
/* 22 */     this.staffDao = staffDao;
/*    */   }
/*    */ 
/*    */   public List findAllStaff() {
/* 26 */     return this.staffDao.findAllStaff();
/*    */   }
/*    */ 
/*    */   public void addStaff(Staff s) {
/* 30 */     this.staffDao.addStaff(s);
/*    */   }
/*    */ 
/*    */   public void deleteStaffById(Staff s)
/*    */   {
/* 35 */     this.staffDao.deleteStaff(s);
/*    */   }
/*    */ 
/*    */   public void updateStaff(Staff s)
/*    */   {
/* 40 */     this.staffDao.updateStaff(s);
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.service.StaffService
 * JD-Core Version:    0.6.2
 */