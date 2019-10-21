package br.usjt.atena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.atena.model.Quiz;
import br.usjt.atena.repository.QuizRepository;


@Controller
public class QuizController {
	@Autowired
	private QuizRepository  quizRepo;
	
	@GetMapping ("/quiz")
	public ModelAndView listarAlunos () {
		ModelAndView mv = new ModelAndView ("quiz");
		//List<Quiz> pergunta = quizRepo.findAll();
		//mv.addObject("alunos", pergunta);
		return mv;
	}
	
	@PostMapping ("/fazerCadPergunta")
	public ModelAndView fazerCadastroPergunta() {
		ModelAndView mv = new ModelAndView ("cadastarPergunta");
		mv.addObject(new Quiz());
		return mv;
	}
	
	@PostMapping("/cadastrarPergunta")
	public String cadastrar(Quiz quiz) {
		quizRepo.save(quiz);
		return "redirect:/quiz";
	}
	
	@GetMapping("/start")
	public ModelAndView jogar(Quiz quiz) {
		ModelAndView mv = new ModelAndView ("start");
		return mv;
	}
	
	@PostMapping("/startquiz")
	public String start(Quiz quiz) {
		return "redirect:/start";
	}
	
}
