package com.sp.fc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BasicTestApplicationTest {

    @Test
    void contextLoads() {
        assertThat("test").isEqualTo("test");
    }

}