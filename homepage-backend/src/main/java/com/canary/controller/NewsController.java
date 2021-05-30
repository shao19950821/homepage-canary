package com.canary.controller;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.canary.common.lang.Result;
import com.canary.entity.News;
import com.canary.service.NewsService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-05-26
 */
@RestController
@Api(value = "Controller", tags = { "新闻操作接口" })
public class NewsController {

    @Autowired
    private NewsService newsService;

    @ApiOperation(value = "查询新闻列表")
    @GetMapping("/news")
    public Result list(@RequestParam(defaultValue = "1") Integer currentPage) {
        Page page = new Page(currentPage, 5);
        IPage pageData = newsService.page(page, new QueryWrapper<News>().orderByDesc("createTime"));
        return Result.succ(pageData);
    }

    @GetMapping("/news/{id}")
    @ApiOperation(value = "具体新闻信息")
    public Result detail(@PathVariable(name = "id") Long id) {
        News news = newsService.getById(id);
        Assert.notNull(news, "该新闻已被删除");
        return Result.succ(news);
    }

    @PostMapping("/news/create")
    @ApiOperation(value = "新建新闻")
    public Result create(@Validated @RequestBody @ApiParam(name="news",value="新闻对象，传入json格式，optional表示不是必须参数",required=true) News news) {
        News createNews = new News();
        LocalDateTime time = LocalDateTime.now();
        createNews.setCreateTime(time);
        createNews.setUpdateTime(time);
        createNews.setUserId(1L);
        createNews.setStatus(0);
        BeanUtil.copyProperties(news, createNews, "id", "userId", "createTime","updateTime","status");
        newsService.saveOrUpdate(createNews);
        return Result.succ(null);
    }

    @PutMapping("/news/update")
    @ApiOperation(value = "更新新闻")
    public Result update(@Validated @RequestBody @ApiParam(name="news",value="新闻对象，传入json格式，编辑新闻时须传入id",required=true) News news) {
        News updateNews = newsService.getById(news.getId());
        LocalDateTime time = LocalDateTime.now();
        updateNews.setUpdateTime(time);
        Assert.notNull(updateNews, "该新闻已被删除");
        BeanUtil.copyProperties(news, updateNews, "id", "userId", "createdTime","updateTime","status");
        newsService.saveOrUpdate(updateNews);
        return Result.succ(null);
    }

    @DeleteMapping("/news/delete/{id}")
    @ApiOperation(value = "删除新闻")
    public Result delete(@PathVariable(name = "id") Long id) {
        Boolean succ = newsService.removeById(id);
        Assert.isTrue(succ,"新闻删除失败");
        return Result.succ(null);
    }
}
