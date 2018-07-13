package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by admin on 2018/7/13.
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    String getHiByFeignClient(@RequestParam(value = "name") String name);

}
