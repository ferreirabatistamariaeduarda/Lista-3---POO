import java.time.LocalDateTime;

public class Main {
    
    public static void main(String[] args){
        Cliente c = new Cliente();
        c.cadastrarCliente("Laura Castelli", "0937434233", "889974523");
    
        Carro car = new Carro();
        car.cadastrarCarro("PNB25", "Cinza", 2023, "Flex", 4, 0, 
        "Civic", "Honda");

        Locacao loc = new Locacao();
        loc.c=car;
        loc.cliente=c;
        loc.valor=2500;
        loc.dataLocacao= LocalDateTime.parse("15/10/2023", "08:00", DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm"));
    }

  

}
