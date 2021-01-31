public class Main {
    public static void main(String[] args) {
        int current_balance = 100; // Текущий баланс пользователя
        int top_up = 10000; // Сумма пополнения счета
        int bonus = 0; // Инициализация переменной для бонуса
        if(top_up > 1000) {
            bonus = top_up/100;
        }
        current_balance = current_balance + top_up;
        System.out.println("Бонус равен " + bonus);
        System.out.println("Текущий баланс: " + current_balance);

    }
}
