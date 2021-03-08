package com.tts.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
	public class ProductController {
		@Autowired
		ProductService productService;
		
		@GetMapping("/product/{id}")
		public String show(@PathVariable int id, Model model) {
			model.addAttribute(product);
			return "product";
		}
		
		// TODO: Either implement admin controls or remove these methods.
		// @RequestMapping(value = "/product", method = {RequestMethod.POST, RequestMethod.PUT})
		
		public String createOrUpdate(@Valid Product product) {
			productService.save(product);
			return "redirect:/product/" + product.getID();
		}
}
