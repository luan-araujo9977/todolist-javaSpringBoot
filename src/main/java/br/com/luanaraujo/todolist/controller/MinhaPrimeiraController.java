package br.com.luanaraujo.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/...
public class MinhaPrimeiraController {
  
  /**
   * Metodos de acesso HTTP
   * GET - Busca uma informação
   * POST - Adiciona um dado/info
   * PUT - Altera um dado/info
   * DELETE - Remove um dado
   * PUTH - Altera somente uma parte do dado/info
   */
  @GetMapping("/")
  public String primeiraMensagem(){
    return "Funcionou";
  }
}
