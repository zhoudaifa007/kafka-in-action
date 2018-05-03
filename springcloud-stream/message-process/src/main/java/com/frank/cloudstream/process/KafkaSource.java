package com.frank.cloudstream.process;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by Frank on 2017-12-20.
 */
public interface KafkaSource {

    //Cycle消费者
    static String OUTPUT_TOPIC = "maintopic";


    @Output(OUTPUT_TOPIC)
    MessageChannel cycleDataOutput();

}
