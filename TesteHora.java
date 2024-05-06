public class TesteHora{
    public static void main(String[] args){
        int hora = 2, min = 30, seg = 0;
        Hora hora1 = new Hora(hora, min, seg);
        Hora hora2 = new Hora();

        hora2.setHor(hora);
        hora2.setMin(min);
        hora2.setSeg(seg);

        hora2.setHor();
        hora2.setMin();
        hora2.setSeg();

        System.out.println(hora2.getHor());
        System.out.println(hora2.getMin());
        System.out.println(hora2.getSeg());

        System.out.println(hora2.getHora1());
        System.out.println(hora2.getHora2());
        System.out.println(hora2.getSegundos());
    }
} 