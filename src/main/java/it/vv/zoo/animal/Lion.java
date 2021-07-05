package it.vv.zoo.animal;

import it.vv.zoo.food.FoodType;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Random;

public class Lion extends Animal {

   private static String[] MALE_NAMES = {"anacleto", "eminem", "moustapha"};
   private static String[] FEMALE_NAMES = {"palmiera", "madonna", "giuseppina"};


   public int aggressivity = 0; // livello di aggressività


   public Lion(int id) {
      super(id, "temp");

      if (this.sex == Sex.MALE) {
         this.name = MALE_NAMES[new Random().nextInt(MALE_NAMES.length)];
      } else {
         this.name = FEMALE_NAMES[new Random().nextInt(FEMALE_NAMES.length)];
      }
   }

   @Override
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

   @Override
   public Position move() {

      if (health == 0) {
         this.position = Position.LAID;
         System.out.println("This animal is tired!!");
         return this.position;
      }

      if (this.position == Position.STAND) {
         this.position = Position.SIT;
      } else if (this.position == Position.SIT) {
         this.position = Position.LAID;
      } else if (this.position == Position.LAID) {
         this.position = Position.ROLLOVER;
      } else if (this.position == Position.ROLLOVER) {
         this.position = Position.STAND;
      }

      this.health = this.health - HEALTH_PER_MOVEMENT;

      if (this.health < 0) {
         this.health = 0;
      }

      return this.position;
   }

   @Override
   public List<FoodType> canEat() {
      return List.of(FoodType.MEAT, FoodType.FISH);
   }

   @Override
   public String toString() {
      return "Lion{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", sex=" + sex +
              ", size=" + size +
              ", aggressivity=" + aggressivity +
              ", health=" + health +
              '}';
   }


}


