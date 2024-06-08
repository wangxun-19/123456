package com.tsinghua.shops.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsinghua.shops.config.PoetryResult;
import com.tsinghua.shops.entity.Comment;
import com.tsinghua.shops.vo.BaseRequestVO;
import com.tsinghua.shops.vo.CommentVO;

public interface CommentService extends IService<Comment> {
    PoetryResult saveComment(CommentVO commentVO);

    PoetryResult deleteComment(Integer id);

    PoetryResult<BaseRequestVO> listComment(BaseRequestVO baseRequestVO);

    PoetryResult<Page> listAdminComment(BaseRequestVO baseRequestVO, Boolean isBoss);

}
