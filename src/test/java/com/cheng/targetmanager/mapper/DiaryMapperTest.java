package com.cheng.targetmanager.mapper;

import com.cheng.targetmanager.entity.Diary;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiaryMapperTest {
    @Autowired
    DiaryMapper mapper;

    private Diary diaryToAdd;

    @Before
    public void setUp() throws Exception {
        diaryToAdd = new Diary();
        diaryToAdd.setDate("2019-12-28");
        diaryToAdd.setText("hello");
        diaryToAdd.setTitle("testTitle");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCountIncWhenAdd() {
        int count = mapper.getCount();
        mapper.add(diaryToAdd);
        assertEquals(mapper.getCount(), count + 1);
    }
}
