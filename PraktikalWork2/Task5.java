package PraktikalWork2;

public class Task5 {

    static class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int humanAge() {
            return age * 7;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", humanAge=" + humanAge() +
                    '}';
        }
    }

    static class ПитомникСобак {

        private Dog[] dogs;
        private int count;

        public ПитомникСобак(int size) {
            dogs = new Dog[size];
            count = 0;
        }

        public void addDog(Dog dog) {
            if (count < dogs.length) {
                dogs[count] = dog;
                count++;
            }
        }

        public void showDogs() {
            for (int i = 0; i < count; i++) {
                System.out.println(dogs[i]);
            }
        }
    }

    public static void main(String[] args) {

        ПитомникСобак kennel = new ПитомникСобак(3);

        kennel.addDog(new Dog("Шарик", 3));
        kennel.addDog(new Dog("Бобик", 5));
        kennel.addDog(new Dog("Рекс", 2));

        kennel.showDogs();
    }
}