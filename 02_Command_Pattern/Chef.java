package Command;

import java.util.ArrayList;
import java.util.List;

public class Chef {

  List<String> toppings = new ArrayList<>();

  public void addTopping(String topping){
    toppings.add(topping);
    System.out.println(topping+" 토핑 추가됨.");
  }

  public void removeTopping(String topping){
    toppings.remove(topping);
    System.out.println(topping+" 토핑 제거됨.");
  }

  public void displayTopping(){
    System.out.print("현재 토핑 목록 : ");
    System.out.println(toppings);
  }
}

