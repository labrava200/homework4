public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
        }

        //Задача 2
        int t = 6;
        if (t > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (t < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        //Задача 3
        int speed = 90;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //Задача 4
        int age1 = 4;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если человеку " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 <= 17) {
            System.out.println("Если человеку " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 <= 24) {
            System.out.println("Если человеку " + age1 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если человеку " + age1 + ", то ему нужно ходить на работу");
        }

        //Задача 5
        int age2 = 5;
        if (age2 < 5) {
            System.out.println("Если ребенку " + age2 + ", то он не может кататься на аттракционе");
        } else if (age2 >= 5 && age2 <= 14) {
            System.out.println("Если ребенку " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если ребенку " + age2 + ", ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //Задача 6
        int peoples = 102;
        if (peoples < 60) {
            System.out.println("Если в вагоне " + peoples + " то можно занять сидячее место");
        } else if (peoples < 102) {
            System.out.println("Если в вагоне " + peoples + " то можно занять стоячее место");
        } else {
            System.out.println("Мест в вагоне нет");
        }

        //Задача 7
        int one = 1;
        int two = 1;
        int three = 1;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (one > two && one < three) {
            System.out.println("Наибольшее число " + three);
        } else {
            System.out.println("Наибольшее число " + two);
        }


    }

}
