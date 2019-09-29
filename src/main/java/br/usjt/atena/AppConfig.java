package br.usjt.atena;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.usjt.atena.interceptor.LoginInterceptor;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Bean
	public String teste() {
		return "";
	} 
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").
		excludePathPatterns("/login", "/", "/fazerLogin", "/fazerCadastro", "/cadastrarUsu");
	}
}
