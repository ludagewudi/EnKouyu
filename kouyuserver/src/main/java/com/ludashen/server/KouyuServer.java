package com.ludashen.server;

import com.ludashen.kouyumain.Order;

import java.util.List;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2019-12-25 23:23
 */
public interface KouyuServer {
    public List<Order> findAll() throws Exception;
}
