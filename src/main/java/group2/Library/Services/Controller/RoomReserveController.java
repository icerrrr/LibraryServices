/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.Library.Services.Controller;
import group2.Library.DBInterfaces.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 *
 * @author Ben Xu
 */
@Controller
public class RoomReserveController implements WebMvcConfigurer{
    
    @Autowired
    private RoomRepository repo;
    
    @GetMapping("/roomreserve")
    public String roomres(){
        return "roomreserve";
    }
}
