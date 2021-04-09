package com.usian.controller;

import com.usian.feign.ItemServiceFeign;
import com.usian.pojo.TbItem;
import com.usian.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("frontend/item/")
public class ItemController {


    @Autowired
    ItemServiceFeign ItemServiceFeign;

    @RequestMapping("selectItemInfo")
    public Result selectItemInfo(long itemId){
        TbItem tb = ItemServiceFeign.getItemByid(itemId);
        if(tb != null){
            return Result.ok(tb);
        }else {
            return Result.error("对不起,请求的数据未找到,请重试~!");
        }

    }
}
