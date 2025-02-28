package study.async.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.async.service.AsyncNonBlockingService;

@RestController
@Slf4j
@RequiredArgsConstructor
public class AsyncController {

    private final AsyncNonBlockingService asyncNonBlockingService;

    @GetMapping("/sync-non-blocking")
    public void asyncNonBlocking() {
        log.info("Start Thread >>> {}", Thread.currentThread().getName());
        asyncNonBlockingService.sleepThread();
        log.info("End Thread >>> {}", Thread.currentThread().getName());
    }

}
