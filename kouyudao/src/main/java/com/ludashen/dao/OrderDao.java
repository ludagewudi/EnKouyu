package com.ludashen.dao;

import com.ludashen.kouyumain.A;
import com.ludashen.kouyumain.B;
import com.ludashen.kouyumain.Order;
import com.ludashen.kouyumain.Title;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2019-12-25 23:41
 */
public interface OrderDao {
    @Select("SELECT *FROM `order`;")
    @Results({
            @Result(id = true, property = "id", column = "id"), //设置主键
            @Result(property = "a", column = "a", javaType = A.class, one = @One(select = "com.ludashen.dao.ADao.findAid")),
            @Result(property = "b", column = "b", javaType = B.class, one = @One(select = "com.ludashen.dao.BDao.findBid")),
            @Result(property = "title", column = "title", javaType = Title.class, one = @One(select = "com.ludashen.dao.TitleDao.findTid")),
    })
    public List<Order> findAll() throws Exception;
}
