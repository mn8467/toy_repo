package com.practice.shppingmall.controller.woman;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping(value = "/woman")
public class HiTopController {

    @RequestMapping(value = "/hiTops")
    public String hiTops() {
        return "pages/woman/hiTops";
    }

}
