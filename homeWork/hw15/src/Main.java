public class Main {
    public static void main(String[] args) {
        //Напишемо програму, яка видає пораду/рекомендацію в залежності від днів тижня.
        //Створити enum Day, який матиме константи для кожного дня - з понеділка по неділю.
        //Створити інтерфейс, який матиме один метод - advise. На вхід метод приймає день тижня (Day).
        //Використати switch в реалізції методу, щоб мати можливість перевіряти день та видавати рекомендації наступним чином:
        //якщо це будній день з понеділка по четвер включно, друкувати в консоль пораду, як бути продуктивним на роботі
        //якщо це п'ятниця, друкуємо в консоль "Happy Friday!"
        //якщо це вихідні, то надрукувати в консоль, які місця ви б порекомендували відвідати

        DayOfWeek.advise(Day.MONDAY);
        DayOfWeek.advise(Day.FRIDAY);
        DayOfWeek.advise(Day.SUNDAY);


    }
    public interface DayOfWeek {
        static void advise(Day today) {
            switch (today) {
                case MONDAY, WEDNESDAY, TUESDAY, THURSDAY:
                    System.out.println("Не забувай відпочитвати!");
                    break;
                case FRIDAY:
                    System.out.println("Happy Friday!");
                    break;
                case SATURDAY, SUNDAY:
                    System.out.println("Рекомендую відвідати Київ.");
                    break;
            }
        }
    }
}