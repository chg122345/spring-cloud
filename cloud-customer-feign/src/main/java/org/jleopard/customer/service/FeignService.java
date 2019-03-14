/**
 * @author (c) 2018. Chen_9g jleopard@126.com.
 * @date 2019/3/14  12:57
 * @version 1.0
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */
package org.jleopard.customer.service;

import org.jleopard.customer.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PROVIDER-8010",fallback = FeignServiceImpl.class)
public interface FeignService {

    @GetMapping(value = "/test")
    String test(@RequestParam("msg") String msg);
}
