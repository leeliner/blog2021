package com.blog2021.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blog2021.common.lang.Result;
import com.blog2021.entity.User;
import com.blog2021.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
//@RequiresAuthentication
@PostMapping("/save")

//public Result save(@Validated @RequestBody User user) {
////查询所有记录
//    List<User> userList=userService.list();
//    return Result.succ(userList);
//    //列表查询
//    List<User> list=userService.list(new QueryWrapper<User>().orderByDesc("ID"));
//    return Result.succ(list);
//}
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);

    }





//    public Result list(@RequestParam(defaultValue = "1") Integer currentPage) {
////分页，每页5条
//        Page page = new Page(currentPage, 5);
//        IPage pageData = userService.page(page, new QueryWrapper<User>().orderByDesc("created"));//mybatisplus条件结果集
//
//        return Result.succ(pageData);
//}



}
