public class App {
    public static void main(String[] args) throws Exception {
        String preguntas[] = {
        
            "¿Cuanto es la mitad de dos mas dos?",
            "edificio empieza por e y termina por...",
            "¿cual seria el siguiente numero de la secuencia?0,1,1,2,3,5,8,13,...",
            "¿cual es el apellido de bob esponja?",
            "¿que mes tiene 28 dias?"

        };
        String respuestas[]={

            "3",
           "t",
            "21",
            "pantalones cuadrados",
            "todos",
            
        }   ;

        int rand;
        String res;
        

         Random rm = new Random();
         rand=rm.nextInt(0,6);

         System.out.println(preguntas[rand]);

         Scanner sc=new Scanner(System.in);
        res=sc.nextLine();
        

        if (res.equals(respuestas[rand])){

            System.out.println("has ganado");
        
        }else{
            System.out.println("has fallado");
        }
    }
}
