public class Main {
    public static void main(String[] args) {
      int account = 100;

      int deposit = 1200;

      int bonus;
      if (deposit > 100) {
          bonus = deposit / 100;
      } else {
          bonus = 0;}
      int totalAmount = deposit + bonus;

        System.out.println("Итоговый счет включающий в себя бонусы:" + totalAmount);
      }
    }