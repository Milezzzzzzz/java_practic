package practice13;

import java.util.StringTokenizer;

public class num3 {
    public static void main(String[] args) {
        String test1 = "Страна, Регион, Город, Улица, Дом, Корпус, Квартира";
        String test2 = "Россия; Московская обл.; Москва; Тверская; 10; 2; 45";
        String test3 = "Беларусь, Минская, Минск, Независимости, 4, 1, 12";
        String test4 = "USA; California; Los Angeles; Hollywood Blvd; 100; 0; 5";

        System.out.println("Разделитель запятая");
        Address addr1 = new Address();
        addr1.setAddressSplit(test1);
        System.out.println(addr1);

        Address addr2 = new Address();
        addr2.setAddressSplit(test3);
        System.out.println(addr2);

        System.out.println("\nЛюбой разделитель");
        Address addr3 = new Address();
        addr3.setAddressTokenizer(test2);
        System.out.println(addr3);

        Address addr4 = new Address();
        addr4.setAddressTokenizer(test4);
        System.out.println(addr4);
    }
}

class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void setAddressSplit(String str) {
        String[] parts = str.split(",");
        assignParts(parts);
    }

    public void setAddressTokenizer(String str) {
        StringTokenizer st = new StringTokenizer(str, ",;-");
        String[] parts = new String[7];
        int i = 0;
        while (st.hasMoreTokens() && i < 7) {
            parts[i++] = st.nextToken();
        }
        assignParts(parts);
    }

    private void assignParts(String[] parts) {
        if (parts.length > 0) country = parts[0].trim();
        if (parts.length > 1) region = parts[1].trim();
        if (parts.length > 2) city = parts[2].trim();
        if (parts.length > 3) street = parts[3].trim();
        if (parts.length > 4) house = parts[4].trim();
        if (parts.length > 5) building = parts[5].trim();
        if (parts.length > 6) apartment = parts[6].trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "Страна='" + country + '\'' +
                ", Регион='" + region + '\'' +
                ", Город='" + city + '\'' +
                ", Улица='" + street + '\'' +
                ", Дом='" + house + '\'' +
                ", Корпус='" + building + '\'' +
                ", Квартира='" + apartment + '\'' +
                '}';
    }
}