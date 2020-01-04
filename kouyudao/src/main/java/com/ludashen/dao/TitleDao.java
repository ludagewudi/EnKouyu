package com.ludashen.dao;

import com.ludashen.kouyumain.Title;
import com.ludashen.kouyumain.Topic;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2019-12-25 23:41
 */
public interface TitleDao {

    @Select("SELECT * FROM title where id=#{tid};")
    @Results({
            @Result(id = true, property = "id", column = "id"), //设置主键
            @Result(property = "name", column = "name"),
            @Result(property = "topicid", column = "topicid", javaType = Topic.class, one = @One(select = "com.ludashen.dao.TopicDao.findTid")),
    })
    public Title findTid(int tid) throws Exception;
}
