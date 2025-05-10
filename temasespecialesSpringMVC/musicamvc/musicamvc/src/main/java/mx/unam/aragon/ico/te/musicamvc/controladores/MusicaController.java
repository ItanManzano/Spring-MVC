package mx.unam.aragon.ico.te.musicamvc.controladores;


import mx.unam.aragon.ico.te.musicamvc.modelos.Artista;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda/")
public class MusicaController {
    @GetMapping("/home/")
    public String home() {
        return "home";
    }

    @GetMapping("/artista/")
    public String artista(Model model) {
        Artista artista = new Artista(1,"Freddy Mercury","Rock","Algo",25, "https://www.sopitas.com/wp-content/uploads/2014/11/freddie-mercury-e1416885817438.jpg"
               );
        model.addAttribute("artista", artista);
        return "artista";
    }
}
