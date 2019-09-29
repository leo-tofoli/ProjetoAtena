package br.usjt.atena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class QuizController {
	//private QuizRepository  quizRepo;
	@GetMapping ("/quiz")
	public ModelAndView listarAlunos () {
		ModelAndView mv = new ModelAndView ("quiz");
		//List<Quiz> pergunta = quizRepo.findAll();
		//mv.addObject("alunos", pergunta);
		return mv;
	}
}
