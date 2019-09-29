package br.usjt.atena.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.atena.model.Usuario;
import br.usjt.atena.service.LoginService;

@Controller
public class UsuarioController {
	@Autowired
	private LoginService loginService;
	@GetMapping (value = {"/login", "/"})
	public ModelAndView login () {
		ModelAndView mv = new ModelAndView ("login");
		mv.addObject(new Usuario());
		return mv;
	}
	
	@PostMapping ("/fazerLogin")
	public String fazerLogin (HttpServletRequest request, Usuario usuario) {
		if (loginService.logar(usuario)) {
			request.getSession().setAttribute("usuarioLogado", usuario);
			return "redirect:quiz";
		}
		else {
			return "login";
		}
	}
	
	@PostMapping ("/fazerCadastro")
	public ModelAndView fazerCadastro() {
		ModelAndView mv = new ModelAndView ("cadastrarUsuario");
		mv.addObject(new Usuario());
		return mv;
	}
	
	@PostMapping("/cadastrarUsu")
	public String cadastrar(Usuario usuario) {
		loginService.salvar(usuario);
		return "redirect:/login";
	}
}
