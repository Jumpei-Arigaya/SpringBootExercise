package jp.winschool.spring.exercise04;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Exercise04Controller {

	@GetMapping("/bookForm")
	public String bookForm(@ModelAttribute BookForm bookForm) {
		return "bookForm";
	}
	
	@PostMapping("/bookRegister")
	public String bookRegister(@Valid @ModelAttribute BookForm bookForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "bookForm";
		}
		return "bookRegister";		
	}
}
