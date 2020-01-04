package com.ludashen.dao;

import com.ludashen.kouyumain.A;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2019-12-25 23:41
 */
public interface ADao {
    @Select("SELECT * FROM a where aid=#{aid};")
    public A findAid(int aid) throws Exception;
}
