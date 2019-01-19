package com.sfja.norris.chuck.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sfja.norris.chuck.model.Joke;
import com.sfja.norris.chuck.services.ChuckNorrisService;
import com.sfja.norris.chuck.services.ChuckNorrisServiceImpl;

@Controller
public class JokeController {

	private ChuckNorrisService chuckNorrisService;

	@Autowired
	public JokeController(ChuckNorrisService chuckNorrisService) {
		this.chuckNorrisService = chuckNorrisService;
	}


	@RequestMapping("/")
	public String showJoke(Model model) {
		System.out.println(chuckNorrisService.getJoke());
		model.addAttribute("joke", chuckNorrisService.getJoke());
		return "chucknorris";
	}
}
