package com.example.controller;

import com.example.domain.Result;
import com.example.domain.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> 2023/7/3 </p>
 * restful api 样例
 *
 * @author Fqq
 */
@RestController
@RequestMapping("/rest")
public class RestfulApiController {
    /**
     * 获取用户列表，URL 上只有 users，能够望文生义，其它参数使用查询参数拼接，避免混淆 URL 需要表达的语义
     */
    @GetMapping("/users")
    public Result<User> list() {
        return Result.success(null);
    }
}
