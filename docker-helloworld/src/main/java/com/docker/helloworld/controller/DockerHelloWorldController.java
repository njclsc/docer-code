package com.docker.helloworld.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerHelloWorldController {

	@RequestMapping("helloworld")
	public String helloworld(HttpServletRequest req, HttpServletResponse rep){
		return "spring boot application add to docker for aut is pyyh";
	}
}
