package com.cheng.targetmanager.mapper;

import com.cheng.targetmanager.entity.Diary;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryMapper {
    int getCount();
    void add(Diary diary);
}
