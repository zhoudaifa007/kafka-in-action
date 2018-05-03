package com.frank.cloudstream.api;


import com.frank.cloudstream.common.model.ServerResponse;
import com.frank.cloudstream.process.MsgSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Frank on 2017-12-19.
 */
@RestController
@RequestMapping("/v1/stream/")
public class ApplicationController {

    @Autowired
    private MsgSender msgSender;

    @RequestMapping(value = "/get/userinfo", method = RequestMethod.GET)
    public ServerResponse getUserInfo(HttpServletRequest request, HttpServletResponse response) {
        return ServerResponse.successWithData(null);
    }

}
