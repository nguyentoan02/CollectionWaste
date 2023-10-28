
import controller.GarbageCollectionController;
import java.util.Scanner;
import model.GarbageCollectionModel;
import view.GarbageCollectionView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        GarbageCollectionModel model = new GarbageCollectionModel();
        GarbageCollectionView view = new GarbageCollectionView();
        GarbageCollectionController controller = new GarbageCollectionController(model, view);

        Scanner scanner = new Scanner(System.in);
        int station = 0;
        while (true) {
            System.out.print("Enter the amount of garbage at station " + (station + 1) + " (kg) or -1 to end: ");
            int garbage = scanner.nextInt();
            if (garbage == -1) {
                break;
            }
            model.collectGarbage(station, garbage);
            station++;
        }

        int cost = controller.calculateCost();
        view.printCost(cost);
    }
}
