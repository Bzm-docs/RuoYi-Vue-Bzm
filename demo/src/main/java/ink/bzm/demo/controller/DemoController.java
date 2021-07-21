package ink.bzm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/3/18 17:55
 */
@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
