package com.legend.common;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.MySqlMapper;


public interface MyMapper<T> extends BaseMapper<T>, MySqlMapper<T> {
}
