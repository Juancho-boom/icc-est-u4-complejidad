import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, Mundo!");
        
        int[] array = new int[]{1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array[2]);

        int cantidadEstudiantes = 1000000;
        int cantidad = 1_000_000;

        List<Estudiante> estudiantes = Generador.generarListado(cantidadEstudiantes);
        
        for(Estudiante est : estudiantes){
            System.out.println(est.nombre);
        }

        String nombreBuscar = "Estudiante_29000111";
        int intentos = 0;

        for(Estudiante est : estudiantes){
            if(est.nombre.equals(nombreBuscar)){
                System.out.println("Existe");
            } else {
                intentos++;
            }
        }

        System.out.println(x: "Fin");
    }
}
