import java.util.Scanner;

public class Main implements MessageC.Printer{
    public static void main(String[] args) {
        //Створити інтерфейс Printer. Додати до нього метод print, який приймає на вхід повідомлення (див. нижче).
        //Реалізувати інтерфейс Printer. В класі, що реалізує цей інтерфейс, створити статичний внутрішній клас Message, який є публічним і має всередині поля text, sender, конструктор для всіх параметрів, геттери та сеттери.
        //Метод print в класі реалізації повинен друкувати повідомлення в консоль згідно з наступними умовами:
        //Якщо поле sender в повідомленні пусте або null, то вивести текст: "Анонімний користувач відправив повідомлення: <текст повідомлення тут>"
        //Якщо поле sender присутнє, виводити "Користувач <sender> відправив повідомлення: <текст повідомлення тут>"
        //Якщо обидва поля text та sender пусті (null), створити анонімний клас, що буде обробляти таке пусте повідомлення і друкувати в консоль: "Опрацьовується пусте повідомлення від анонімного користувача..."

        MessageC message = new MessageC();

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть повідомлення: ");
        message.setText(sc.nextLine());
        System.out.print("Введіть ім'я відправника: ");
        message.setSender(sc.nextLine());

        MessageC.Printer.Print(message.getText(), message.getSender());
    }
}
