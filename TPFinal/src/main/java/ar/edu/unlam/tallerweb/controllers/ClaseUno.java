package ar.edu.unlam.tallerweb.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb.domain.Persona;

@Controller
public class ClaseUno {

	@RequestMapping("/inicial")
	public ModelAndView pruebaInicial(){
		ModelAndView mav = new ModelAndView("Vista1");
		return mav;
	}
	
	@RequestMapping("/otro")
	public ModelAndView otraPrueba(@RequestParam(required = false) String nombre, String apellido){
		System.out.println(nombre + " " + apellido);
		ModelAndView mav = new ModelAndView("Vista2");
		mav.addObject("saludo", nombre + " " + apellido);
		return mav;
	}
		
	@RequestMapping(value = "/mapa", method = RequestMethod.GET)
	public ModelAndView map(){
		ModelMap miMapa = new ModelMap();
		miMapa.put("nombre", "Brian");
		miMapa.put("apellido", "Lamilla");
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("mapa");
		return miVista;
	}
	
	@RequestMapping(value = "/nombre/{nombre}/apellido/{apellido}", method = RequestMethod.GET)
	public ModelAndView holaREST(@PathVariable String nombre, @PathVariable String apellido){
		ModelMap miMapa = new ModelMap();
		/*miMapa.addAttribute("nombre", "Brian");
		miMapa.addAttribute("apellido", "Lamilla");*/
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("mapa");
		return miVista;
	}
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public ModelAndView lista(){
		ModelMap miMapa = new ModelMap();
		List<Persona> lista = new LinkedList<Persona>();
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		p1.setNombre("Brian");
		p1.setApellido("Lamilla");
		p2.setNombre("Juan");
		p2.setApellido("Perez");
		lista.add(p1);
		lista.add(p2);
		miMapa.put("lista", lista);
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("lista");
		return miVista;
	}
	
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String agregarPersona(@ModelAttribute("persona")
			Persona p1, BindingResult result){
		System.out.println("Nombre: " + p1.getNombre() + "Apellido: " + p1.getApellido() + "Email" + p1.getEmail() + "Edad" + p1.getEdad());
		return "redirect:contacts.html";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView listaPersonas(){
		ModelMap miMapa = new ModelMap();
		List<Persona> lista = new LinkedList<Persona>();
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		p1.setNombre("Brian");
		p1.setApellido("Lamilla");
		p1.setEmail("brian.lamilla@gmail.com");
		p1.setEdad(23);
		p2.setNombre("Paola");
		p2.setApellido("Ferrara");
		p2.setEmail("pao.ferrara@gmail.com");
		p2.setEdad(23);
		p3.setNombre("Sebastian");
		p3.setApellido("Ismael");
		p3.setEmail("sebastian.ismael@gmail.com");
		p3.setEdad(30);
		p4.setNombre("Ruben");
		p4.setApellido("Moreira");
		p4.setEmail("ruben.moreira@gmail.com");
		p4.setEdad(35);
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		miMapa.put("lista", lista);
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("lista");
		return miVista;
	}
}
