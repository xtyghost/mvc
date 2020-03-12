/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: HelloController Author: xutong Date: 2020/3/11 2:51
 * 下午 Description: 简单的controller History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.springmvc.mvc.controller;

import org.springframework.boot.autoconfigure.condition.ConditionMessage;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 * 〈简单的controller〉
 *
 * @author xutong
 * @create 2020/3/11
 * @since 1.0.0
 */
@Controller
@RequestMapping
public class HelloController {

  @RequestMapping(value = "/hello1")
  @ResponseBody
  public String hello1() {
    System.out.println(ConditionOutcome.inverse(ConditionOutcome.noMatch(ConditionMessage.forCondition("lisu",'S','1','2').because("生病").append("去医院"))).isMatch());
      return ConditionOutcome.match("hello,world").toString();
  }
    @RequestMapping("/hello2")
    public String hello2() {

        return "resultPage" ;
    }
}
