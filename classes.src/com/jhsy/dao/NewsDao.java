package com.jhsy.dao;

import com.jhsy.model.News;
import java.util.List;

public abstract interface NewsDao
{
  public abstract List<News> findAll();

  public abstract News findNewsByTitle(String paramString);
}

/* Location:           G:\study\jianhangsuye\WEB-INF\classes\
 * Qualified Name:     com.jhsy.dao.NewsDao
 * JD-Core Version:    0.6.2
 */