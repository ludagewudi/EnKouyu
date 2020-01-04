package com.ludashen.server;

import com.ludashen.dao.OrderDao;
import com.ludashen.kouyumain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2019-12-26 0:14
 */
@Service
@Transactional
public class KouyuImp implements KouyuServer{
    @Autowired
    private OrderDao orderDao;

    public List<Order> findAll() throws Exception {
        return orderDao.findAll();
    }
}
