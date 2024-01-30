import java.util.function.Function;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String role = in.nextLine();
        int salary = in.nextInt();

        Function<Integer, Integer> getBonus = null;
        final int MANAGER_BONUS_PERCENT = 15;
        final int TEAM_LEAD_BONUS_PERCENT = 10;
        final int OTHER_BONUS_PERCENT = 5;

        switch(role) {
            case "Manager":
                // Define lambda function for manager's bonus calculation
                getBonus = (x)->{
                    return (int)(x*MANAGER_BONUS_PERCENT*0.01);
                };
                break;
            case "Team Lead":
                // Define lambda function for team lead's bonus calculation
                getBonus = (x)->{
                    return (int)(x*TEAM_LEAD_BONUS_PERCENT*0.01);
                };
                break;
            case "Other":
                // Define lambda function for other employee's bonus calculation
                getBonus = (x)->{
                    return (int)(x*OTHER_BONUS_PERCENT*0.01);
                };
                break;
            default:
                System.out.println("Invalid role!");
                return;
        }

        int bonus = getBonus.apply(salary);
        System.out.println(bonus);
    }
}