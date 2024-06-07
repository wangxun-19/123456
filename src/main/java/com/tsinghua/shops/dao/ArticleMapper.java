package com.tsinghua.shops.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsinghua.shops.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface ArticleMapper extends BaseMapper<Article> {
    @Update("update article set view_count+1 where id=#{id}")
    int updateViewCount(@Param("id") Integer id);

}
