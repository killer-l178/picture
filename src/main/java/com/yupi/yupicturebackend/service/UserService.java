package com.yupi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.yupicturebackend.model.dto.user.UserQueryRequest;
import com.yupi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicturebackend.model.vo.LoginUserVO;
import com.yupi.yupicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 李永怡
* @description 针对表【user(用户)】的数据库操作Service,继承了mybatis-plus的封装类
* @createDate 2025-03-05 11:36:52
*/
public interface UserService extends IService<User> {

    /**
     * 用户登录
     * @param userAccount 账户
     * @param userPassWord 用户密码
     * @param request 请求
     * @return 脱敏后的用户信息（返回前端）
     */
    LoginUserVO userLogin(String userAccount, String userPassWord, HttpServletRequest request);


    /**
     * 用户注册
     * @param userAccount 账户
     * @param passWord 用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String passWord, String checkPassword);

    /**
     * 获取加密后的方法
     * @param userPassword 用户密码
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获得脱敏后的登录用户信息
     * @param user 数据库用户信息
     * @return 脱敏后的用户信息
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获得脱敏后的用户信息
     * @param user 数据库用户信息
     * @return 脱敏后的用户信息
     */
    UserVO getUserVO(User user);

    /**
     * 获得脱敏后的用户信息列表
     * @param userList 数据库用户信息列表
     * @return 脱敏后的用户信息列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取当前登录信息
     * @param request 客户端请求
     * @return 脱敏后的用户信息
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户登录态注销
     * @param request 客户端请求信息
     * @return 注销结果
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 将java对象封装为QueryWrapper
     * @param userQueryRequest  查询请求体
     * @return QueryWrapper
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    boolean isAdmin(User user);
}
