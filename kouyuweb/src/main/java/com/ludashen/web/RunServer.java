package com.ludashen.web;

import com.ludashen.kouyumain.Order;
import com.ludashen.server.KouyuServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2019-12-26 0:17
 */
@Controller
public class RunServer {
    @Autowired
    private KouyuServer kouyuServer;
    @RequestMapping("/Test.do")
    public ModelAndView Test() throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Order> all = kouyuServer.findAll();
        mv.addObject("a",all);
        mv.setViewName("a");
        return mv;
    }
}
