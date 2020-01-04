package com.ludashen.dao;

import com.ludashen.kouyumain.Topic;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2019-12-25 23:42
 */
public interface TopicDao {
    @Select("SELECT * FROM topic where topicid=#{tid};")
    public Topic findTid(int tid) throws Exception;

}
