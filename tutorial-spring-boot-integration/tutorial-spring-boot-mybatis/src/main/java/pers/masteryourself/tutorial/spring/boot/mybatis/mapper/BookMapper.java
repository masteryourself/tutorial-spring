package pers.masteryourself.tutorial.spring.boot.mybatis.mapper;

import pers.masteryourself.tutorial.spring.boot.mybatis.entity.Book;

import java.util.List;

/**
 * <p>description : BookMapper
 * <p>{@link Mapper} 如果不添加 {@link MapperScan} 注解扫描包, 那么需要对每个接口加上 @Mapper 注解标识
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/16 21:49
 */
// @Mapper
public interface BookMapper {

    List<Book> list();

}
