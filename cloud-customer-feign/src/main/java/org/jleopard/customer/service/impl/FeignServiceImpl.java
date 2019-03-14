/**
 * @author (c) 2018. Chen_9g jleopard@126.com.
 * @date 2019/3/14  13:02
 * @version 1.0
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */
package org.jleopard.customer.service.impl;

import org.jleopard.customer.service.FeignService;
import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignService {

    @Override
    public String test(String msg) {
        return String.format("your message is %s",msg);
    }
}
