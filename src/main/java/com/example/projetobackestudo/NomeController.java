package com.example.projetobackestudo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class NomeController {

    @GetMapping(path = "{idade}/{sexo}")
    public String retornaNome(
            @PathVariable("idade") int idade,
            @PathVariable("sexo") String sexo
    ) {
        System.out.println(idade);
        System.out.println(sexo);

//        se idade for igual a 36 e sexo for  m retorna Felipe
//        se idade for igual a 30 e sexo for  f retorna Deise

        if (idade == 36 && sexo.equals("m")){
            System.out.println("Felipe");
            return "Felipe";
        }

        if (idade == 30  && sexo.equals("f")){
            System.out.println("Deise");
            return "Deise";
        }else{
            return "Nao sei";

        }

    }


}
