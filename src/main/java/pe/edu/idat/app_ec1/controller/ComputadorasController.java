package pe.edu.idat.app_ec1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.idat.app_ec1.model.ComputadorasModel;

@Controller
public class ComputadorasController {
    @GetMapping("/computadoras")
    public String computadora(Model model){
        model.addAttribute("mostrar",
                false);
        model.addAttribute("objcomputadoras",
                new ComputadorasModel());
        return "computadoras";}
    @PostMapping("/computadoras")
    public String totalprecio(ComputadorasModel computadorasModel,
                              Model model){
        double descuento=0;
        Integer ncomputsadoras= computadorasModel.getNcomputsadoras(){
            if (ncomputsadoras<5){
                 descuento= ncomputsadoras*0.01;
            }else if (ncomputsadoras>=10){
                descuento=ncomputsadoras*0.2;
            }else{
                descuento=0.4;
            }
            model.addAttribute("resultado",
                    "Su descuento es: "+descuento);
            model.addAttribute("mostrar",
                    true);
            model.addAttribute("objcomputadoras",
                    new ComputadorasModel());
            return "computadoras";
        }
    }


}
