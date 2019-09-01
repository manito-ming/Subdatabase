package org.shard.jdbc.controller;

import org.shard.jdbc.pojo.TableOne;
import org.shard.jdbc.service.ShardService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ShardController {
    @Resource
    private ShardService shardService;

    /**
     * 6、修改表 table_one 数据
     */
    @RequestMapping("/updateOneByPhone/{phone}")
    public String UpdateOneByPhone (@PathVariable("phone") String phone){
        phone = "phone6";
        TableOne tableOne = new TableOne();
        tableOne.setPhone(phone);
        tableOne.setBackOne("back_one3");
        tableOne.setBackTwo("back_two13");
        tableOne.setBackThree("back_three13");
        shardService.updateOneByPhone(tableOne);
        return "SUCCESS";
    }
}
