package com.smartkode.toretto.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.smartkode.toretto.Service.PeliculaService;
import com.smartkode.toretto.entidad.Pelicula;
@Configuration
@Controller
public class PeliculaController {
private static final Logger logger = LoggerFactory.getLogger(PeliculaController.class);
    
    private PeliculaService  peliculaservice	;

    @Autowired
    @Qualifier(value = "PeliculaService")
    public void setPeliculaService(PeliculaService ps) {
        this.peliculaservice = ps;
    }
    
    @RequestMapping(value = "/add"	)
    //@RequestParam
    public String Agregarpelicula(Model model1){           
    model1.addAttribute("alu", new Pelicula());
    logger.info("Crear pelicula" );
    return "crear";
    
    }
    
    @RequestMapping(value = "/up"	)
    //@RequestParam
    public String Actualizarpelicula(Model model1){           
    model1.addAttribute("alu", new Pelicula());
    logger.info("Actualizar pelicula" );
    return "actualiza";
    
    }
    
    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    //@PostMapping("/create")
    public String eliminar(@PathVariable("id") int id, Model model) {
    Pelicula a=this.peliculaservice.getPeliculaById(id);
    this.peliculaservice.eliminarPelicula(a);
    return "redirect:/peliculas";

    }
    
    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    //@PostMapping("/create")
    public String create(Pelicula alu, Model model) {
    if(alu==null)
    {
    this.peliculaservice.addPelicula(alu);
    }
    return "home";

    }
    
    @RequestMapping(value = "/actualizar", method = RequestMethod.POST)
    //@PostMapping("/create")
    public String actu(Pelicula peli, Model model) {
    logger.info("pelicula salvada"+peli.getNombre()+"----"+peli.getAño()+"-----"+peli.getParte_historia()+"----"+peli.getNo_pelicula());
    this.peliculaservice.updatePelicula(peli);
    return "redirect:/peliculas";

    }
    
    @RequestMapping("/up/{id}")    
    public String editPhone(@PathVariable("id") int id, Model model) 
    { 
    Pelicula a=this.peliculaservice.getPeliculaById(id);
    model.addAttribute("peli", this.peliculaservice.getPeliculaById(id));
    logger.info("pelicula encontrada con" +id+ " :"+a.getNombre()+a.getNo_pelicula());
    return "act";    
    }
    
    @RequestMapping(value = "/peliculas", method = RequestMethod.GET)    
    public String listPhones(Model model) {       	
    model.addAttribute("peli", this.peliculaservice.listPelicula());        
    return "actualiza";    
    }
   /* @RequestMapping(value = "/add"	)
    //@RequestParam
    public String Agregaralumnos(Model model1){           
    model1.addAttribute("alu", new Alumno());
    logger.info("Alumno saved successfully" );
    return "crear";
   

    }
    
    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    //@PostMapping("/create")
    public String create(Alumno alu, Model model) {
                this.se.addAlumno(alu);
                System.out.print("creado");
            

         return "home";

    }
    */
}
