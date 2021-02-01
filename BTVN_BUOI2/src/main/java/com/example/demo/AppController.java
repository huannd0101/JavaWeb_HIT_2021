package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@GetMapping("/student")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		List<Data> arr = new ArrayList<Data>();
		arr.add(new Data(54, "Wells McCuish", "wmccuish0@cpanel.net", "635 North Trail"));
		arr.add(new Data(13, "Garald Shadfourth", "gshadfourth1@symantec.com", "054 Bellgrove Pass"));
		arr.add(new Data(6, "Thalia Danilevich", "tdanilevich2@smh.com.au", "92 Scoville Drive"));
		arr.add(new Data(767, "Lowrance Alton", "lalton3@netlog.com", "663 Thackeray Avenue"));
		arr.add(new Data(424, "Ozzie Duckit", "oduckit4@addtoany.com", "1 Bobwhite Crossing"));
		
		mav.addObject("datas", arr);
		return mav;
	}
	
}		
			
			
			
			

