package com.cheng.targetmanager.mapper;

import com.cheng.targetmanager.entity.Task;
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
public class TaskMapperTest {
    @Autowired
    TaskMapper mapper;

    private Task taskToAdd;

    @Before
    public void setUp() throws Exception {
        taskToAdd = new Task();
        taskToAdd.setCurrentProgress(0);
        taskToAdd.setTargetProgress(100);
        taskToAdd.setStartDate("2019-12-28");
        taskToAdd.setLastModifiedDate("2019-12-28");
        taskToAdd.setName("taskToAdd");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    @Transactional
    public void shouldCountIncWhenAdd() {
        int count = mapper.getCount();
        mapper.add(taskToAdd);
        assertEquals(mapper.getCount(), count + 1);
    }
}
