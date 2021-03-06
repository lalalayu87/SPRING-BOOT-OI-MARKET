package com.oimarket.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller 
// 스프링이 com.oimarket 패키지 이하를 스캔해서 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IoC) 스프링 컨테이너에 관리해줍니다.
// 모든 파일을 메모리에 NEW하는 것이 아님
@RestController
public class ControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}
