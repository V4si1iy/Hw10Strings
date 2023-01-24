public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Задание 2");
        String fullName = "Ivanov Ivan Ivanovich";
        char secondOfName = fullName.charAt(fullName.indexOf(' ') + 1);
        char thirdOfName = fullName.charAt(fullName.indexOf(' ', fullName.indexOf(' ') + 1) + 1);
        char firstOfName = fullName.charAt(0);
        String lol = "";
        lol +=firstOfName;
        lol +='.';
        lol +=secondOfName;
        lol +='.';
        lol +=thirdOfName;
        lol +='.';
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + lol);
    }

    public static void task3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        fullName=fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }

}