package com.wactobus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = WactobusBackendApplication.class)
@ActiveProfiles("test")
class WactobusBackendApplicationTests {

    @Test
    void contextLoads() {
    }
}