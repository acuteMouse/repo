package com.jhsy.dao;

import com.jhsy.model.Admin;
import java.util.List;

public abstract interface AdminDao
{
  public abstract void add(Admin paramAdmin);

  public abstract List<Admin> findAllAdmin();

  public abstract int findTotal();

  public abstract void updateAdmin(Admin paramAdmin);

  public abstract void deleteAdmin(Admin paramAdmin);

  public abstract Admin findAdminByName(String paramString);
}

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.dao.AdminDao
 * JD-Core Version:    0.6.2
 */