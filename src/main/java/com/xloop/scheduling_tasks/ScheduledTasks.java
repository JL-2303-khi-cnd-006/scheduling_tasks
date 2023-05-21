package com.xloop.scheduling_tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("mm:HH:ss");

    @Scheduled(fixedRate = 2000)
    public void reportCurrentTime() {
        log.info("\nthis is a new time");
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
