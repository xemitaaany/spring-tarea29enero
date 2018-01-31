package com.jeromejaglale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeromejaglale.domain.Car;
import com.jeromejaglale.service.CarService;

@Controller
public class HelloController {
	@Autowired
	private CarService carService;

	@RequestMapping("hii")
	@ResponseBody
	public String hi() {
		return "Hello, Chema.¿Como estas?";
	}

        @RequestMapping("/car/list")
        public void carList(Model model) {
                List<Car> carList = carService.findAll();
                model.addAttribute("carList", carList);
        }
}

