package com.frank.cloudstream.process;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * Created by Frank on 2017-12-20.
 */
public interface KafkaSink {

    //Cycle消费者
    static String INPUT_TOPIC = "maintopic";

    @Input(INPUT_TOPIC)
    MessageChannel cycleDataInput();

}
