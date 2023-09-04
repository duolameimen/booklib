package com.yx.dao;

import com.yx.po.BookInfo;

import java.awt.print.Book;
import java.util.List;

public interface BookInfoMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(BookInfo record);


    int insertSelective(BookInfo record);


    BookInfo selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(BookInfo record);

    int updateByPrimaryKey(BookInfo record);

    List<BookInfo> queryBookInfoAll(BookInfo bookInfo);


    List<BookInfo> getBookCountByType();
}