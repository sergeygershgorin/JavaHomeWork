package com.pb.gershgorin.hw6;

import java.lang.reflect.Constructor;

    public class VetClinic {
        public static void main(String[] args) throws Exception {
            Animal[] Individual = new Animal[4];
            Individual[0] = new Cat("Котофей", "молоко", "квартира", 30);
            Individual[1] = new Dog("Шарик", "Royal Canin", "дом", "зеленый");
            Individual[2] = new Horse("Иноходец", "сено", "конюшня", "тыгдым-тыгдым-тыгдым");
            Individual[3] = new Cat("Котофей", "молоко", "квартира", 30);

            System.out.println("Животные: ");
            for (Animal animal : Individual) {
                System.out.println(animal.toString());
            }
            System.out.println("-----------------------");
            Class vet = Class.forName("com.pb.gershgorin.hw6.Veterinarian");
            Constructor constr = vet.getConstructor();
            Object obj = constr.newInstance();

            System.out.println();
            System.out.println("У доброго доктора: ");
            int i = 0;
            if (obj instanceof Veterinarian) {
                for (Animal animal: Individual) {
                    System.out.println("----------------------------");
                    System.out.println(++i + ". На прием пришел : " + animal.getName());
                    System.out.println();
                    ((Veterinarian) obj).treatAnimal(animal);
                }
            }
            System.out.println("---------------------");
 /*           if (Individual[0].equals(Individual[3])) {
                System.out.println("Животное " + Individual[0].getName() + " является клоном животного " + Individual[3].getName());
            }
            else {
                System.out.println("Животное " + Individual[0].getName() + " НЕ является клоном животного " + Individual[3].getName());
            }
            System.out.println("---------------------");
            if (Individual[3].equals(Individual[4])) {
                System.out.println("Животное " + Individual[3].getName() + " является клоном животного " + Individual[4].getName());
            }
            else {
                System.out.println("Животное " + Individual[3].getName() + " НЕ является клоном животного " + Individual[4].getName());
            }
            System.out.println("---------------------");
            if (Individual[2].equals(Individual[7])) {
                System.out.println("Животное " + Individual[2].getName() + " является клоном животного " + Individual[7].getName());
            }
            else {
                System.out.println("Животное " + Individual[2].getName() + " НЕ является клоном животного " + Individual[7].getName());
            }
*/
            System.out.println("---------------------");
            System.out.println("сравниваю 1 и 2: " + Individual[0].equals(Individual[1]));
            System.out.println("сравниваю 1 и 3: " + Individual[0].equals(Individual[2]));
            System.out.println("сравниваю 1 и 4: " + Individual[0].equals(Individual[3]));
            System.out.println("---------------------");
            System.out.println("смотрю hashCode 1: " + Individual[0].hashCode());
            System.out.println("смотрю hashCode 2: " + Individual[1].hashCode());
            System.out.println("смотрю hashCode 3: " + Individual[2].hashCode());
            System.out.println("смотрю hashCode 4: " + Individual[3].hashCode());
        }
    }

