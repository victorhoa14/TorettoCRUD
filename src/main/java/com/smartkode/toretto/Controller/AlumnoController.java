package com.smartkode.toretto.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.smartkode.toretto.Service.AlumnoService;
import com.smartkode.toretto.entidad.Alumno;
@Configuration
@Controller
public class AlumnoController {
private static final Logger logger = LoggerFactory.getLogger(AlumnoController.class);
    
    private AlumnoService alumnoService	;

    @Autowired
    @Qualifier(value = "AlumnoService")
    public void setAlumnoService(AlumnoService ps) {
        this.alumnoService = ps;
    }
    @RequestMapping(value = "/add"	)
    //@RequestParam
    public String Agregaralumnos(Model model1){           
    model1.addAttribute("alu", new Alumno());
    logger.info("Alumno saved successfully" );
    return "crear";
    
    }
    
    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    //@PostMapping("/create")
    public String create(Alumno alu, Model model) {
    	 /*alu.setNombre("vctor");
    	 alu.setApellido("asdasd");
    	 alu.setMatricula(Long.valueOf(12334));
    	 alu.setId_alumno(11);
   */
    this.alumnoService.addAlumno(alu);
    System.out.print("creado");
    return "home";

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
