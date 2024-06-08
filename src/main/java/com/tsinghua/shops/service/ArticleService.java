package com.tsinghua.shops.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsinghua.shops.config.PoetryResult;
import com.tsinghua.shops.entity.Article;
import com.tsinghua.shops.vo.ArticleVo;
import com.tsinghua.shops.vo.BaseRequestVO;

import java.util.List;
import java.util.Map;

public interface ArticleService extends IService<Article> {
    PoetryResult saveArticle(ArticleVo articleVO);

    PoetryResult deleteArticle(Integer id);

    PoetryResult updateArticle(ArticleVo articleVO);

    PoetryResult<Page> listArticle(BaseRequestVO baseRequestVO);

    PoetryResult<ArticleVo> getArticleById(Integer id, String password);

    PoetryResult<Page> listAdminArticle(BaseRequestVO baseRequestVO, Boolean isBoss);

    PoetryResult<ArticleVo> getArticleByIdForUser(Integer id);

    PoetryResult<Map<Integer, List<ArticleVo>>> listSortArticle();
}
