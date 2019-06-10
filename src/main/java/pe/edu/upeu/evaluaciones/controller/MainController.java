package pe.edu.upeu.evaluaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.evaluaciones.Service.AlternativasService;
import pe.edu.upeu.evaluaciones.Service.InstrumentosService;
import pe.edu.upeu.evaluaciones.Service.PreguntasService;
import pe.edu.upeu.evaluaciones.Service.RespuestasService;
import pe.edu.upeu.evaluaciones.Service.SeccionesService;
import pe.edu.upeu.evaluaciones.entities.Alternativas;
import pe.edu.upeu.evaluaciones.entities.Instrumentos;
import pe.edu.upeu.evaluaciones.entities.Preguntas;
import pe.edu.upeu.evaluaciones.entities.Respuestas;
import pe.edu.upeu.evaluaciones.entities.Secciones;

@RestController
@RequestMapping("/administrativa")
public class MainController {
	
	 @Autowired
	 private AlternativasService alternaServ;
	 
	 @Autowired
	 private InstrumentosService instruServi;
	 
	 @Autowired
	 private PreguntasService pregunSer;
	 
	 @Autowired
	 private RespuestasService respueSer;
	 
	 @Autowired
	 private SeccionesService seccioSer;

	 @GetMapping("/muestraInstru")
	 public List<Instrumentos> listar(){
		 return instruServi.listar();
	 }
	 @GetMapping("/muestraAlter")
	 public List<Alternativas> listar1(){
		 return alternaServ.listar();
	 }
	 @GetMapping("/muestraPregu")
	 public List<Preguntas> listar2(){
		 return pregunSer.listar();
	 }
	 @GetMapping("/muestraRespue")
	 public List<Respuestas> listar3(){
		 return respueSer.listar();
	 }
	 @GetMapping("/muestraSeccio")
	 public List<Secciones> listar4(){
		 return seccioSer.listar();
	 }
	 
	 @PostMapping("/Instrumento")
	 public Instrumentos crearIns(@RequestBody Instrumentos as) {
		 
		 return instruServi.registrar(as);
	 }
	 @PostMapping("/Instrumento")
	 public Alternativas crearAlternati(@RequestBody Alternativas as) {
		 
		 return alternaServ.registrar(as);
	 }
	 @PostMapping("/Instrumento")
	 public Preguntas crearPreguns(@RequestBody Preguntas as) {
		 
		 return pregunSer.registrar(as);
	 }
	 @PostMapping("/Instrumento")
	 public Respuestas crearRespues(@RequestBody Respuestas as) {
		 
		 return respueSer.registrar(as);
	 }
	 @PostMapping("/Instrumento")
	 public Secciones crearSeccion(@RequestBody Secciones as) {
		 
		 return seccioSer.registrar(as);
	 }
}
