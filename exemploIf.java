public class exemploIf {
  public static void main (String args[]) {
    if (args.length > 0) {
     for (int j=0; j<Integer.parseInt(args[0]); j++){
       System.out.print("" + j + " ");
     }
     System.out.println("\nFim da Contagem");
    }
    System.out.println("Fim do Programa");
   }
}