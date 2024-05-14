public class Main {
    public static void main (String[] args){
       /*DatosPersonales obj = new DatosPersonales("Gabriela", "Palacios Torres");

        System.out.println(obj.getNombre());*/

       Coleccion objc = new Coleccion();
       DatosPersonales dp1 = new DatosPersonales("Francisco", "Flores Diaz");

       objc.add(dp1);
       objc.add(new DatosPersonales("Gustavo", "Mendez Salazar"));
        objc.add(new DatosPersonales("Javir", "Sanchez Diaz"));
        objc.add(new DatosPersonales("Enrique", "Flores Aguirre"));
        objc.add(new DatosPersonales("Eitan", "Rojas Garcia"));

       // objc.show();
      //  objc.show2();

        objc.buscar("Eitan");
    }
}
