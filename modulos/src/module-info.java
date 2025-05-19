//posso usar também open module, aonde permite os módulos que importam mudar atributos privados de classes importadas
module modulos {
    //requires tansitive -> manda para quem te importar também
    //exports sem o "to" exporta para todos
    exports br.com.daniel.modulos to modulos2; //exportar para modulo especifico
    //provides with, usa quando você importa uma interface e quer especificar qual implementação vai implementar ela
    //provides importação with implementação
}