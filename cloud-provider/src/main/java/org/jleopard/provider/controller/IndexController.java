/**
 * @author (c) 2018. Chen_9g jleopard@126.com.
 * @date 2019/3/13  17:11
 * @version 1.0
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */
package org.jleopard.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test(String msg) {
        return String.format("your message is %s and port is %s",msg,port);
    }
}
