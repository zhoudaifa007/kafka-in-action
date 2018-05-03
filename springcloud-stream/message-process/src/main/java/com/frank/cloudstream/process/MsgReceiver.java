package com.frank.cloudstream.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

import java.util.UUID;

/**
 * Created by Frank on 2017-12-20.
 */
@EnableBinding(KafkaSink.class)
public class MsgReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(MsgReceiver.class);

    @StreamListener(KafkaSink.INPUT_TOPIC)
    public void cycleDataReceive(Message<String> message) {
        String sid = UUID.randomUUID().toString().replace("-", "");
        String jsonObject = message.getPayload();
        LOGGER.info("[周期数据]：sid={},msg={}", sid, jsonObject);
    }

}
