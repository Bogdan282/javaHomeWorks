public class MessageC {
    private static String text;
    private static String sender;

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        MessageC.text = text;
    }

    public static String getSender() {
        return sender;
    }

    public static void setSender(String sender) {
        MessageC.sender = sender;
    }

    public interface Printer{
        static void Print(String text, String sender) {
            if (sender.isEmpty() || sender == null) {
                if (text.isEmpty() || text == null) {
                    AnonymMessage.emptyDo();
                }
            }

            if (sender.isEmpty() || sender == null) {
                if (!sender.isEmpty() && sender == null) {
                    System.out.println("Анонімний користувач відправив повідомлення: " + text);
                }
            } else {
                System.out.println("Користувач " + sender + " відправив повідомлення: " + text);
            }
        }
    }
    private class AnonymMessage {
        private static String emptySenderText = "Опрацьовується пусте повідомлення від анонімного користувача...";
        public static void emptyDo() {
            System.out.println(emptySenderText);
        }
    }
}

