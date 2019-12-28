package com.cheng.targetmanager.mapper;

import com.cheng.targetmanager.entity.Task;
import com.cheng.targetmanager.utils.Limit;
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
        for(int i = 0 ; i < 10; i ++){
            Task taskInList = new Task();
            taskInList.setCurrentProgress(i);
            taskInList.setTargetProgress(i + 100);
            taskInList.setStartDate("2019-12-28");
            taskInList.setLastModifiedDate("2019-12-28");
            taskInList.setName(String.valueOf(i));
            mapper.add(taskInList);
        }
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

    @Test
    @Transactional
    public void shouldGetRightCountWhenGetTasks(){
        int len = 10;
        Limit limit = new Limit(1, len);
        assertEquals(mapper.getTasks(limit.getBeginAndLimit()).size(), len);
    }

    @Test
    @Transactional
    public void shouldGetRightCountWhenGetExcessiveTasks(){
        int len = 100;
        Limit limit = new Limit(1, len);
        assertEquals(mapper.getTasks(limit.getBeginAndLimit()).size(), mapper.getCount());
    }
}
