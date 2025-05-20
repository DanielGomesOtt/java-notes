package equals.entities;


public class Smartphone {

    private String serial;
    private String brand;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getBrand() {
        return brand;
    }

    public Smartphone(String serial, String brand) {
        this.serial = serial;
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //equals implementado na mão. nesse equals o parametro para verificar a igualdade é o serial number do smartphone
    @Override
    public boolean equals(Object obj) {
        //verifica se o objeto passado  é igual a null
        if(obj == null) return false;
        //verifica se o objeto passado é o mesmo do objeto atual
        if(this == obj) return true;
        //verifica se os dois objetos são instancias da mesma classe
        if(this.getClass() != obj.getClass()) return false;
        //faz um casting do objeto para Smartphone, porque ele foi recebido como Object
        Smartphone smartphone = (Smartphone) obj;
        //se o equals serial do objeto atual é diferente de null e o serial do objeto atual é igual ao serial do objeto passado retorna true
        return serial != null && serial.equals(smartphone.serial);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serial='" + serial + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    //EQUALS E HASH CODE TEM QUE ANDAR LADO A LADO E USAR OS MESMOS ELEMENTOS DE COMPARAÇÃO PARA NÃO FAZER MERDA
    //hash code é como se fosse uma etiqueta que ajuda a identifcar mais rapido o valor na memória.
    //por exemplo, você coloca para gerar o hash code a partir do serial, ai temos uma base de dados com gigantesca com vários seriais lá
    //na hora de você achar um especifico, ao inves de ir serial por serial até achar o desejado, é só saber o serial desejado e ir direto no lugar que tem o hashcode gerado a partir desse serial
    //só pensar em um monte de gavetas aonde o conteudo é o que você procura e a etiquetaa na frente da gaveta é o hash code
    @Override
    public int hashCode() {
        //se o serial for nulo já retorna 0, se não, retorna o hashCode desse serial
        return serial == null ? 0 : this.serial.hashCode();
    }
}
