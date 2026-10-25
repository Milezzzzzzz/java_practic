package practice13;

public class num5 {
    public static void main(String[] args) {
        String phone1 = "+79175655655";
        String phone2 = "+104289652211";
        String phone3 = "89175655655";

        System.out.println(formatPhone(phone1));
        System.out.println(formatPhone(phone2));
        System.out.println(formatPhone(phone3));
    }

    public static String formatPhone(String phone) {
        StringBuilder sb = new StringBuilder();

        if (phone.startsWith("8")) {
            sb.append("+7");
            phone = phone.substring(1); // Отрезаем "8"
        } else if (phone.startsWith("+")) {

            int splitIndex = phone.length() - 10;
            sb.append(phone.substring(0, splitIndex)); // Добавляем код страны
            phone = phone.substring(splitIndex);       // Оставляем только 10 цифр
        }

        if (phone.length() == 10) {
            sb.append(" (")
                    .append(phone.substring(0, 3)).append(") ")
                    .append(phone.substring(3, 6)).append("-")
                    .append(phone.substring(6));
        } else {
            sb.append(phone);
        }

        return sb.toString();
    }
}