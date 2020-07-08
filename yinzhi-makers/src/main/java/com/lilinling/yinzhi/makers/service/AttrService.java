package com.lilinling.yinzhi.makers.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilinling.common.utils.PageUtils;
import com.lilinling.yinzhi.makers.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lichenglin
 * @email lilinling15@gmail.com
 * @date 2020-07-08 19:56:56
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

