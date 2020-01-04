package com.ludashen.dao;

import com.ludashen.kouyumain.B;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2019-12-25 23:41
 */
public interface BDao {
    @Select("SELECT * FROM b where bid=#{bid};")
    public B findBid(int bid) throws Exception;
}
