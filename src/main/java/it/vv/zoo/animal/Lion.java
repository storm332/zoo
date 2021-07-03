package it.vv.zoo.animal;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Lion {

   public int id;
   public String name = "default";
   public int age;
   public Sex sex = Sex.MALE;
   public int aggressivity = 0; // livello di aggressività

   public Lion(int id, String name) {
      this(id, name, new Random().nextInt(50) + 1, Sex.values()[new Random().nextInt(2)]);
   }

   public Lion(int id, String name, int age, Sex sex) {

      this.id = id;
      this.name = StringUtils.capitalize(name);
      this.age = age;
      this.sex = sex;

      this.aggressivity = new Random().nextInt(10) + 1;
   }

   @Override
   public String toString() {
      return "Lion{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", sex=" + sex +
              ", aggressivity=" + aggressivity +
              '}';
   }

   public String speak() {
      String phrase = "meow";

      if (aggressivity >= 5) {
         phrase = "roaaar";
      }

      if (aggressivity == 10) {
         phrase = "Ti spiezzo in dueeeee!!!!";
      }

      return phrase;
   }
}
