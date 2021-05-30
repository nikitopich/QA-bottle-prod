package com.fallindawn.qabottleprod.order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface IOrderController {

    @PostMapping("/order")
    void newOrder(@RequestBody Order order);

}
