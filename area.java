import java.util.Scanner;

public class area{
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);

        System.out.println("Calculo de Area");
        System.out.println("+++++++++++++++");

        System.out.print("Digite a altura: ");
        int altura = input.nextInt();

        if (altura <= 0) {
            System.out.println("A altura deve ser maior do que zero!");
            return;
        }

        System.out.print("Digite a largura: ");
        int largura = input.nextInt();

        if (largura <= 0) {
            System.out.println("A largura deve ser maior do que zero!");
            return;
        }

        System.out.println("Area Total: " + altura*largura);
	}
}