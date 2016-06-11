/*    */ package com.jhsy.service;
/*    */ 
/*    */ import com.jhsy.dao.AdminDao;
/*    */ import com.jhsy.model.Admin;
/*    */ import java.util.List;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component("adminService")
/*    */ public class AdminService
/*    */ {
/*    */   private AdminDao adminDao;
/*    */ 
/*    */   public AdminDao getAdminDao()
/*    */   {
/* 24 */     return this.adminDao;
/*    */   }
/*    */ 
/*    */   @Resource
/*    */   public void setAdminDao(AdminDao adminDao)
/*    */   {
/* 30 */     this.adminDao = adminDao;
/*    */   }
/*    */ 
/*    */   public void addUser(Admin admin)
/*    */   {
/* 35 */     this.adminDao.add(admin);
/*    */   }
/*    */ 
/*    */   public List<Admin> finaAllAdmin()
/*    */   {
/* 43 */     List list = this.adminDao.findAllAdmin();
/* 44 */     return list;
/*    */   }
/*    */ 
/*    */   public int findTotal()
/*    */   {
/* 50 */     return this.adminDao.findTotal();
/*    */   }
/*    */ 
/*    */   public void updateAdmin(Admin a)
/*    */   {
/* 56 */     this.adminDao.updateAdmin(a);
/*    */   }
/*    */ 
/*    */   public void deleteAdminById(Admin a)
/*    */   {
/* 61 */     this.adminDao.deleteAdmin(a);
/*    */   }
/*    */ 
/*    */   public Admin findAdminByName(String name)
/*    */   {
/* 66 */     return this.adminDao.findAdminByName(name);
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.service.AdminService
 * JD-Core Version:    0.6.2
 */