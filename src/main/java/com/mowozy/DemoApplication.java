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

	@RequestMapping("/") String index(Model model){
//		return "Web Owner is:"+ ownerSettings.getWebOwner() +"Web name is:" + ownerSettings.getWebName() ;
//		Person single = new Person("asd" ,123);
//
//		model.addAttribute("singlePerson",single);
//
//		List<Person> people = new ArrayList<Person>();
//		Person p1 = new Person("zxc1" ,1);
//		Person p2 = new Person("zxc2" ,2);
//		Person p3 = new Person("zxc3" ,3);
//		people.add(p1);
//		people.add(p2);
//		people.add(p3);
//
//		model.addAttribute("people",people);

		return "index";
	}

	@RequestMapping("index")String home(Model model){
		return "index";
	}

	@RequestMapping("about-us")String aboutUs(Model model){
		return "about-us";
	}

	@RequestMapping("404")String P404(Model model){
		return "404";
	}

	@RequestMapping("users-details")String userdetails(Model model){
		return "users-details";
	}

	@RequestMapping("teachers-details")String teachersDetails(Model model){
		return "teachers-details";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
