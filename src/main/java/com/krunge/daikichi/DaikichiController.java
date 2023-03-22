package com.krunge.daikichi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@GetMapping("/daikichi")
	public String welcome() {
		return "Welcome!";
	}
	
	@GetMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in your endeavours!";
	}
	
	@GetMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to open to new ideas!";
	}
	
	@RequestMapping("daikichi/travel/{city}")
	public String showCity(@PathVariable("city")String city) {
		return "Congratulations! You will soon travel to the beautiful city of " + city;
	}
	
	@RequestMapping("daikichi/lotto/{number}")
	public String showLotto(@PathVariable("number")int number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family amd friends";
		}
	}
}
