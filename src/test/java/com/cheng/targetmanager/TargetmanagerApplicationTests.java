package com.cheng.targetmanager;

import com.cheng.targetmanager.mapper.DiaryMapperTest;
import com.cheng.targetmanager.mapper.TaskMapperTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DiaryMapperTest.class,
        TaskMapperTest.class
})
class TargetmanagerApplicationTests {

    @Test
    void contextLoads() {
    }

}
