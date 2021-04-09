package com.usian.service;


import com.usian.mapper.TbItemMapper;
import com.usian.pojo.TbItem;
import com.usian.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    public TbItem getItemByid(long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }
}
