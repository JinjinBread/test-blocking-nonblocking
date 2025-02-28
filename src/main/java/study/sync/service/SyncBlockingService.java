package study.sync.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SyncBlockingService {


    public void sleepThread() {
        try {
            Thread.sleep(10000);
            log.info("Sleeping thread for 10sec >>> {}", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
