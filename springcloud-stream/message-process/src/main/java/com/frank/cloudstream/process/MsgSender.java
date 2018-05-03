package com.frank.cloudstream.process;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by Frank on 2017-12-20.
 */
@EnableBinding(KafkaSource.class)
public class MsgSender {

    @Autowired
    private KafkaSource kafkaSource;

    public void sendCycleData(JSONObject message){
        kafkaSource.cycleDataOutput().send(MessageBuilder.withPayload(message.toString()).build());
    }


}
