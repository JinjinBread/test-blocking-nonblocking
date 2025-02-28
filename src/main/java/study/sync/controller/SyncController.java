package study.sync.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.sync.service.SyncBlockingService;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SyncController {

    private final SyncBlockingService syncBlockingService;

    @GetMapping("/sync-blocking")
    public void syncBlocking() {
        log.info("Start Thread >>> {}", Thread.currentThread().getName());
        syncBlockingService.sleepThread();
        log.info("End Thread >>> {}", Thread.currentThread().getName());
    }

}
