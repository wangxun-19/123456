package com.tsinghua.shops.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsinghua.shops.entity.HistoryInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface HistoryInfoMapper extends BaseMapper<HistoryInfo> {


    @Select("select nation, province, count(distinct ip) as num" +
            " from history_info" +
            " where nation is not null and province is not null" +
            " group by nation, province" +
            " order by num desc" +
            " limit 10")
    List<Map<String, Object>> getHistoryByProvince();

    @Select("select ip, count(*) as num"+
           " from history_info"+
            " group by ip"+
            " order by num desc"+
            " limit 10")
    List<Map<String, Object>> getHistoryByIp();

    @Select("select ip, user_id, nation, province" +
            " from history_info" +
            " where create_time >= (now() - interval 24 hour)")
    List<Map<String, Object>> getHistoryBy24Hour();

    @Select("select count(*) from history_info")
    Long getHistoryCount();
}
