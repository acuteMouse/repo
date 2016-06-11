package com.jhsy.dao;

import com.jhsy.model.Staff;
import java.util.List;

public abstract interface StaffDao
{
  public abstract List findAllStaff();

  public abstract void addStaff(Staff paramStaff);

  public abstract void deleteStaff(Staff paramStaff);

  public abstract void updateStaff(Staff paramStaff);
}

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.dao.StaffDao
 * JD-Core Version:    0.6.2
 */