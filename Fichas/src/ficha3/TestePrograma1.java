package ficha3;

public class TestePrograma1 {
    public static void main(String[] args) {
        Ex1 c = new Ex1();
        c.setRaio(1);
        double p = c.calculaPerimetro();
        System.out.println("Perímetro: " + p);
        System.out.println(c);
        c.alteraCentro(1,1);
        System.out.println(c);
        double a = c.calculaArea();
        System.out.println("Área: " + a);

        Ex1 c2 = c.clone();
        System.out.println(" c == c  ? "+ c.equals(c));
        System.out.println(" c == c2 ? "+ c.equals(c2));
        c2.setRaio(5);
        System.out.println(" c == c2 ? "+ c.equals(c2));
        c.setRaio(5);
        System.out.println(" c == c2 ? "+ c.equals(c2));

    }
}
