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

        hora2.getHor();
        hora2.getMin();
        hora2.getSeg();

        hora2.getHora1();
        hora2.getHora2();
        hora2.getSegundos();
    }
} 