import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class SetTable {
    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();
        while(true) {
//main abilities of the system
            System.out.println("1.set a train");
            System.out.println("2.search a train");
            System.out.println("3.delete a train");
            System.out.println("4.See the whole table");
            System.out.println("What do you want to do:");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                Train train = new Train();
                System.out.println("Please input the number of the train:");
                train.setNum(scanner.nextLine());
                System.out.println("Please input the departure of the train:");
                train.setDeparture(scanner.nextLine());
                System.out.println("Please input the terminal of the train:");
                train.setTerminal(scanner.nextLine());
                System.out.println("Please input the dTime of the train:");
                train.setdTime(scanner.nextLine());
                System.out.println("Please input the tTime of the train:");
                train.settTime(scanner.nextLine());
                trains.add(train);
                System.out.println("This train is set.");
            } else if (choice.equals("2")) {
                System.out.println("Please input the number of the train you want to search:");
                for (Train train : trains) {
                    String sNum = scanner.nextLine();
                    if (train.getNum().equals(sNum)) {
                        System.out.println( "Here is your train : " + train.getNum() + " " + "from" + " " + train.getDeparture() + " " + "to" + " " + train.getTerminal() + " " + "from" + " " + train.getdTime() + " " + "to" + " " + train.gettTime());
                    } else {
                        System.out.println("sorry,no information");
                    }
                }
            } else if (choice.equals("3")) {
                System.out.println("Which one do you want to delete:");
                String dNum = scanner.nextLine();
                boolean found = false;
                for (int i = 0; i < trains.size(); i++) {
                    if (trains.get(i).getNum().equals(dNum)) {
                        trains.remove(i);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No train with the given number found.");
                }
            } else if (choice.equals("4")) {
                System.out.println("Here you are:");
                for (Train train : trains) {
                    System.out.println( train.getNum() + " " + "from" + " " + train.getDeparture() + " " + "to" + " " + train.getTerminal() + " " + "from" + " " + train.getdTime() + " " + "to" + " " + train.gettTime());
                }
            }else {
                System.out.println("You input a wrong number.");
            }
        }
    }
}
