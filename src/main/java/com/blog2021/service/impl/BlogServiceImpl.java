package com.blog2021.service.impl;

import com.blog2021.entity.Blog;
import com.blog2021.mapper.BlogMapper;
import com.blog2021.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 岭师杨杰李
 * @since 2021-05-30
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
