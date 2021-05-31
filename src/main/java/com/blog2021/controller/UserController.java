package com.blog2021.controller;


import com.blog2021.common.lang.Result;
import com.blog2021.entity.User;
import com.blog2021.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 岭师杨杰李
 * @since 2021-05-30
 */
@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
    UserService userService;

@RequiresAuthentication
@GetMapping("/index")
public Result index(){

    User user= userService.getById(1L);
   return Result.succ(user);
}
    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);

    }
}
