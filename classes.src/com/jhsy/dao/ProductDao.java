package com.jhsy.dao;

import com.jhsy.model.Product;
import java.util.List;

public abstract interface ProductDao
{
  public abstract List<Product> select();

  public abstract void add(Product paramProduct);
}

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.dao.ProductDao
 * JD-Core Version:    0.6.2
 */