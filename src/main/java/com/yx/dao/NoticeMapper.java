package com.yx.dao;

import com.yx.po.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Notice record);

    int insertSelective(Notice record);


    Notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);


    List<Notice> queryNoticeAll(Notice notice);

}