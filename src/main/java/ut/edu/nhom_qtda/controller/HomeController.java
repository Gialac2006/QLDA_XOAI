package ut.edu.nhom_qtda.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() { return "index";}
    @GetMapping("/giaodien")
    public String giaodien() { return "giaodien"; }
    @GetMapping("/test")
    public String test() { return "test"; }
    @GetMapping("/test2")
    public String test2() { return "test2"; }
    @GetMapping("/honongdan")
    public String honongdan() { return "honongdan"; }

}
