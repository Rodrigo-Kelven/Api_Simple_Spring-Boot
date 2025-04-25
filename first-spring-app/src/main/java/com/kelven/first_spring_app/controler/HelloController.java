package com.kelven.first_spring_app.controler;

import org.springframework.web.bind.annotation.*;


// esta anotacao tem como funcao dizer ao java e ao spring que esta classe é responsavel por ser um controlador de uma api rest
// primeiramente, @RestController é uma simplificacao e abstracao de uma ruma de coisa, entao pelo menos ententa a teoria disso

// ela Combina @Controller e @ResponseBody.
// * @Controller: Indica que a classe é um controlador do Spring, ou seja, uma classe responsável por lidar com requisições HTTP e retornar respostas.
// * @ResponseBody: Faz com que o retorno de um metodo seja escrito diretamente na resposta HTTP, ao invés de ser interpretado como o nome de uma view (como em aplicações tradicionais com HTML).
// No contexto de APIs REST, isso significa que o objeto retornado será serializado (geralmente em JSON ou XML) e enviado diretamente como a resposta.
// Quando você usa @RestController, o Spring aplica implicitamente @ResponseBody a todos os métodos dentro do controlador, o que facilita a criação de APIs RESTful.

// Resumindo:
// A anotação @RestController é usada para marcar uma classe como um controlador REST.
//Qualquer metodo dentro dessa classe que retorne um valor será automaticamente serializado e enviado como corpo da resposta HTTP.
@RestController
public class HelloController {
    private String message = "Hello World, esta é minha primeira API em Spring Boot.";

    // @GetMapping("/hello"): Define que é um endpoint de tipo GET em no path/rota -> /
    @GetMapping("/")
    public String sayHome() {
        return message;
    }

    @GetMapping("/seila")
    public String aidento(){
        return "Aprenda Java !!!";
    }

    @GetMapping("/hello")
    public String routeHello(){
        return "Hello World!";
    }

    // mesma coisa que o primeiro endpoint, so tem o caminho diferente e a passagem de parametro no path
    @GetMapping("/hello/{name}") // caso queira passagem de valor no path, usa a convencao {} com o valor a ser passado dentro
    // o @PathVariable é usada no Spring para extrair valores de variáveis diretamente da URL de uma requisição
    // aqui so é TIPADO que voce ESPERA que o parametro que foi passado dentro da url que voce esta pegando
    // seja do tipo String, e que o decorador @PathVariable faca o papel de pegar isso pra voce.
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " !";
    }

    // mesma coisa do GET, só o tipo de metodo é diferente, de tipo post
    @PostMapping("/routePost") // esta rota espera o envio de um parametro no BODY/Corpo da requisicao
    public String routeOk(@RequestBody String message) { // essa resposta é retornada e tudo certo
        return "Iae meu broder " + message; // @RequestBody tem como papel pegar respostas do Body, e ja era papae
    }

    @PostMapping("/routePostDois")
    public String routeExemple(@RequestBody String message){
        return "Fala meu broder javeiro " + message;
    }

}
