package com.tsinghua.shops.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsinghua.shops.config.PoetryResult;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsinghua.shops.entity.User;
import com.tsinghua.shops.vo.BaseRequestVO;
import com.tsinghua.shops.vo.UserVO;

import java.util.List;

public interface UserService extends IService<User>{
    /**
     * 用户名、邮箱、手机号/密码登录
     *
     * @param account
     * @param password
     * @return
     */
    PoetryResult<UserVO> login(String account, String password, Boolean isAdmin);

    PoetryResult exit();

    PoetryResult<UserVO> regist(UserVO user);

    PoetryResult<UserVO> updateUserInfo(UserVO user);

    PoetryResult getCode(Integer flag);

    PoetryResult getCodeForBind(String place, Integer flag);

    PoetryResult<UserVO> updateSecretInfo(String place, Integer flag, String code, String password);

    PoetryResult getCodeForForgetPassword(String place, Integer flag);

    PoetryResult updateForForgetPassword(String place, Integer flag, String code, String password);

    PoetryResult<Page> listUser(BaseRequestVO baseRequestVO);

    PoetryResult<List<UserVO>> getUserByUsername(String username);

    PoetryResult<UserVO> token(String userToken);

    PoetryResult<UserVO> subscribe(Integer labelId, Boolean flag);
}
