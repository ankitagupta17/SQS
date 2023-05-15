package com.example.sqsintegration.SQS.Intgeration.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleListener {

    @SqsListener(value="${queue.firstqueue}")
    public void listenToFirstQueue(String message)
    {
        log.info("Received a message on first queue{}"+message);
    }

}
