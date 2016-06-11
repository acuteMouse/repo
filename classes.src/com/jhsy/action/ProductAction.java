/*    */ package com.jhsy.action;
/*    */ 
/*    */ import com.jhsy.model.Product;
/*    */ import com.jhsy.service.ProductService;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Resource;
/*    */ import net.sf.json.JSONObject;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component
/*    */ public class ProductAction
/*    */ {
/*    */   private int id;
/*    */   private String name;
/*    */   private Double number;
/*    */   private String desc;
/*    */   private Map responseJson;
/*    */   private ProductService productService;
/*    */ 
/*    */   public int getId()
/*    */   {
/* 24 */     return this.id;
/*    */   }
/*    */   public void setId(int id) {
/* 27 */     this.id = id;
/*    */   }
/*    */   public String getName() {
/* 30 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 33 */     this.name = name;
/*    */   }
/*    */   public Double getNumber() {
/* 36 */     return this.number;
/*    */   }
/*    */   public void setNumber(Double number) {
/* 39 */     this.number = number;
/*    */   }
/*    */   public String getDesc() {
/* 42 */     return this.desc;
/*    */   }
/*    */   public void setDesc(String desc) {
/* 45 */     this.desc = desc;
/*    */   }
/*    */ 
/*    */   public Map getResponseJson()
/*    */   {
/* 50 */     return this.responseJson;
/*    */   }
/*    */   public void setResponseJson(Map responseJson) {
/* 53 */     this.responseJson = responseJson;
/*    */   }
/*    */   public ProductService getProductService() {
/* 56 */     return this.productService;
/*    */   }
/*    */   @Resource
/*    */   public void setProductService(ProductService productService) {
/* 60 */     this.productService = productService;
/*    */   }
/*    */ 
/*    */   public String selectProduct() throws Exception {
/* 64 */     Map map = new HashMap();
/* 65 */     List list = new ArrayList();
/*    */ 
/* 67 */     List products = this.productService.findAllProduct();
/* 68 */     int total = products.size();
/* 69 */     for (int i = 0; i < products.size(); i++) {
/* 70 */       Product a = (Product)products.get(i);
/* 71 */       JSONObject jo = new JSONObject();
/* 72 */       jo.put("id", Integer.valueOf(a.getId()));
/* 73 */       jo.put("name", a.getName());
/* 74 */       jo.put("number", a.getNumber());
/* 75 */       jo.put("desc", a.getDescription());
/* 76 */       list.add(jo);
/*    */     }
/* 78 */     map.put("rows", list);
/* 79 */     map.put("total", Integer.valueOf(total));
/* 80 */     setResponseJson(map);
/* 81 */     return "success";
/*    */   }
/*    */   public String updateProduct() {
/* 84 */     Product p = new Product();
/* 85 */     p.setDescription(this.desc);
/* 86 */     p.setId(this.id);
/* 87 */     p.setName(this.name);
/* 88 */     p.setNumber(this.number);
/* 89 */     this.productService.saveOrUpdate(p);
/* 90 */     return "success";
/*    */   }
/*    */ }

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.action.ProductAction
 * JD-Core Version:    0.6.2
 */