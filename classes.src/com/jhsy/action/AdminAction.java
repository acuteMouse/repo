/*     */ package com.jhsy.action;
/*     */ 
/*     */ import com.jhsy.model.Admin;
/*     */ import com.jhsy.service.AdminService;
/*     */ import com.opensymphony.xwork2.ActionSupport;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Resource;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import net.sf.json.JSONObject;
/*     */ import org.apache.struts2.ServletActionContext;
/*     */ import org.springframework.stereotype.Component;
/*     */ 
/*     */ @Component
/*     */ public class AdminAction extends ActionSupport
/*     */ {
/*     */   private int id;
/*     */   private String name;
/*     */   private String password;
/*     */   private AdminService adminService;
/*     */   private Map responseJson;
/*     */   private String ids;
/*     */ 
/*     */   public int getId()
/*     */   {
/*  39 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(int id) {
/*  43 */     this.id = id;
/*     */   }
/*     */ 
/*     */   public String getIds() {
/*  47 */     return this.ids;
/*     */   }
/*     */ 
/*     */   public void setIds(String ids) {
/*  51 */     this.ids = ids;
/*     */   }
/*     */ 
/*     */   public String getName() {
/*  55 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name) {
/*  59 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String getPassword() {
/*  63 */     return this.password;
/*     */   }
/*     */ 
/*     */   public void setPassword(String password) {
/*  67 */     this.password = password;
/*     */   }
/*     */ 
/*     */   public Map getResponseJson() {
/*  71 */     return this.responseJson;
/*     */   }
/*     */ 
/*     */   public void setResponseJson(Map responseJson) {
/*  75 */     this.responseJson = responseJson;
/*     */   }
/*     */ 
/*     */   public AdminService getAdminService() {
/*  79 */     return this.adminService;
/*     */   }
/*     */ 
/*     */   @Resource
/*     */   public void setAdminService(AdminService adminService)
/*     */   {
/*  85 */     this.adminService = adminService;
/*     */   }
/*     */ 
/*     */   public String login()
/*     */   {
/*  94 */     Admin a = this.adminService.findAdminByName(this.name);
/*  95 */     HttpServletRequest request = ServletActionContext.getRequest();
/*  96 */     HttpServletResponse response = ServletActionContext.getResponse();
/*     */ 
/*  98 */     if (a == null) {
/*  99 */       request.setAttribute("Error", "该用户不存在");
/* 100 */       return "fail";
/*     */     }
/*     */ 
/* 103 */     if ((a.getName().equals(this.name)) && (a.getPassword().equals(this.password))) {
/* 104 */       request.setAttribute("name", a.getName());
/* 105 */       request.setAttribute("date", new Date());
/* 106 */       return "success";
/*     */     }
/*     */ 
/* 110 */     request.setAttribute("Error", "用户名或密码错误");
/* 111 */     return "fail";
/*     */   }
/*     */ 
/*     */   public String selectAdmins()
/*     */     throws Exception
/*     */   {
/* 124 */     Map map = new HashMap();
/* 125 */     List list = new ArrayList();
/*     */ 
/* 127 */     List admins = this.adminService.finaAllAdmin();
/* 128 */     int total = admins.size();
/* 129 */     for (int i = 0; i < admins.size(); i++) {
/* 130 */       Admin a = (Admin)admins.get(i);
/* 131 */       JSONObject jo = new JSONObject();
/* 132 */       jo.put("id", Integer.valueOf(a.getId()));
/* 133 */       jo.put("name", a.getName());
/* 134 */       jo.put("password", a.getPassword());
/* 135 */       list.add(jo);
/*     */     }
/* 137 */     map.put("rows", list);
/* 138 */     map.put("total", Integer.valueOf(total));
/* 139 */     setResponseJson(map);
/* 140 */     return "success";
/*     */   }
/*     */ 
/*     */   public String saveAdmin()
/*     */   {
/* 147 */     Admin a = new Admin();
/* 148 */     a.setName(this.name);
/* 149 */     a.setPassword(this.password);
/* 150 */     this.adminService.addUser(a);
/* 151 */     return "none";
/*     */   }
/*     */ 
/*     */   public String updateAdmin()
/*     */   {
/* 157 */     Admin a = new Admin();
/* 158 */     a.setId(this.id);
/* 159 */     a.setName(this.name);
/* 160 */     a.setPassword(this.password);
/* 161 */     this.adminService.updateAdmin(a);
/* 162 */     return "success";
/*     */   }
/*     */ 
/*     */   public String deleteAdmin()
/*     */   {
/* 171 */     String[] Stringid = this.ids.split(",");
/*     */ 
/* 173 */     for (int i = 0; i < Stringid.length; i++) {
/* 174 */       Admin a = new Admin();
/* 175 */       int Aid = Integer.parseInt(Stringid[i]);
/* 176 */       a.setId(Aid);
/* 177 */       this.adminService.deleteAdminById(a);
/*     */     }
/* 179 */     return "success";
/*     */   }
/*     */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.action.AdminAction
 * JD-Core Version:    0.6.2
 */