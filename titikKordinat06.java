import java.util.Scanner;
public class titikKordinat06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double titikKordinatX, titikKordinatY;

        System.out.print("Masukkan Titik Kordinat X     : ");
        titikKordinatX = sc.nextDouble();
        System.out.print("Masukkan Titik kordinat Y   : ");
        titikKordinatY = sc.nextDouble();

        if (titikKordinatX == 0){
            if (titikKordinatY == 0){
                System.out.println("Titik Pusat");       
            } else if (titikKordinatY > 0 || titikKordinatY < 0){
                System.out.print("Titik Sumbu Y");
            }
        } else if (titikKordinatX > 0){
            if (titikKordinatY == 0){
                System.out.print("Tepat Sumbu Y");
            } else if (titikKordinatY > 0) {
                System.out.print("Kuadrat 1");
            } else if (titikKordinatY < 0){
                System.out.print("Kuadrat 2");
            }
        } else if (titikKordinatX < 0){
            if (titikKordinatY == 0){
                System.out.println("Titik Pusat");
            } else if (titikKordinatY > 0){
                System.out.print("Kuadrat 2");
            } else if (titikKordinatY < 0){
                System.out.print("kuadrat 3");
            }
        }
    }
    
}
