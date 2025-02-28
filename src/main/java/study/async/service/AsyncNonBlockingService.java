package study.async.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AsyncNonBlockingService {

    @Async
    public void sleepThread() {
        try {
            Thread.sleep(10000);
            log.info("Sleeping thread for 10sec >>> {}", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
