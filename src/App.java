public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, Mundo!");
        
        int[] array = new int[]{1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array);

        //FOR NORMAL
        for(int i=0;  i<array.length; i++){
            System.out.println(array[i]);
        }
           //FOR EACH
        for(int i : array){
            System.out.println(i);
        }

    }
}
