package com.dx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Description: com.dx.controller
 *
 * @author yaoj
 * @version 1.0
 * @copyright Copyright (c) 文理电信
 * @since 2019/9/11
 */
@Controller
public class IndexController {

    @GetMapping(path = {"", "/", "/index"})
    public ModelAndView index() {
        Map<String, Object> data = new HashMap<>(2);
        data.put("name", "YiHui Beetl");
        data.put("now", LocalDateTime.now().toString());
        return new ModelAndView("index", data);
    }

    private static String[] contents =
            ("绿蚁浮觞香泛泛，黄花共荐芳辰。\n清霜天宇净无尘。\n登高宜有赋，拈笔戏成文。\n可奈园林摇落尽，悲秋意与谁论。\n眼中相识几番新。\n龙山高会处，落帽定何人。").split("\n");
    private static Random random = new Random();

    @GetMapping(path = "show1")
    public String showOne(Model model) {
        model.addAttribute("title", "临江仙");
        model.addAttribute("content", contents[random.nextInt(6)]);
        return "show1";
    }

    /*@GetMapping(path = "show2")
    public String showTow(Map<String, Object> data) {
        data.put("name", "Show2---->");
        data.put("now", LocalDateTime.now().toString());
        return "show2.html";
    }*/

    @GetMapping(path = "show2")
    public String showTow(Map<String, Object> data) {
        data.put("name", "Show2---->");
        data.put("now", LocalDateTime.now().toString());
        return "show2";
    }
}

