package com.mowozy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication

public class DemoApplication {

//@Autowired
//private OwnerSettings ownerSettings;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/") String index(Model model){
		return "index";
	}

	@RequestMapping("index")String home(Model model){
		return "index";
	}

}
