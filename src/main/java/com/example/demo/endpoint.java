package com.example.demo;

import com.example.demo.modelos.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.repositorios.departamentoRepositorio;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class endpoint {

    @Autowired
    private departamentoRepositorio departamentoRepositorio;
    @GetMapping
    @ResponseBody
    public String endpoint(){
        Departamento departamento=departamentoRepositorio.findById(1).orElse(null);
        return "el departamento con id 1 es: "+departamento.getNombreDepartamento();
    }
}
