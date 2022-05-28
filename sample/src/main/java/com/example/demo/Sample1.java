package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample1 {
	@GetMapping(value="/Hi")
	public String setHi() {
		return "Hello";
	}
	@GetMapping(value="/sum/{num1}/{num2}")
	public int total(@PathVariable int num1,@PathVariable int num2) {
		return num1+num2;
	}
	@GetMapping(value="/para")
	public String line() {
		return "Gods grace";
	}
	@GetMapping(value="/div/{num1}/{num2}")
	public int div(@PathVariable int num1,@PathVariable int num2) {
		return num1/num2;
	}
	@GetMapping(value="/add/{v1}/{v2}")
	public String add(@PathVariable String v1,@PathVariable String v2) {
		return v1+v2;
	}
	@GetMapping(value="/sub/{a1}/{a2}")
	public int subt(@PathVariable int a1,@PathVariable int a2) {
		return a1-a2;
		
	}

}
