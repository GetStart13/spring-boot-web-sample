package com.example.controller;

import com.example.domain.Result;
import com.example.domain.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p> 2023/7/3 </p>
 * http 协议相关样例
 * <li>http 请求方法</li>
 * <li>http 参数携带方式</li>
 *
 * @author Fqq
 */
@RestController
@RequestMapping("/example")
public class HttpExampleController {
    /**
     * post 方法，通过 @RequestBody 注解，自动封装请求体参数为实体
     *
     * @param body 请求体附带的消息参数
     * @return 响应结果
     */
    @PostMapping("/post")
    public ResponseEntity<String> postMethod(@RequestBody Map<String, Object> body) {
        System.out.println(String.format("receive body: %s", body));
        String welcome = "welcome for spring boot with web";
        System.out.println(welcome);
        return ResponseEntity.ok(welcome);
    }

    /**
     * get 方法
     *
     * @param user 请求参数将映射到 User 实体
     * @return 返回结果
     */
    @GetMapping("get")
    public Result<User> getMethod(User user) {
        System.out.println(String.format("get 方法，参数为实体时自动封装请求参数：%s", user));
        return Result.success(user);
    }
}
