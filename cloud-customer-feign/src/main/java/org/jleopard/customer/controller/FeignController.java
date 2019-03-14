/**
 * @author (c) 2018. Chen_9g jleopard@126.com.
 * @date 2019/3/14  13:03
 * @version 1.0
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */
package org.jleopard.customer.controller;

import org.jleopard.customer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/feign/{msg}")
    public String test(@PathVariable("msg") String msg){
        return feignService.test(msg);
    }
}
