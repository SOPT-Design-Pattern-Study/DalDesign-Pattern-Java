package Command;

public class Main {

  public static void main(String[] args) {
    Chef myChef = new Chef();
    Command addToppingCommand = new AddToppingCommand(myChef,"치즈");
    Command removePickle = new RemoveToppingCommand(myChef,"피클");

    Invoker invoker = new Invoker();

    invoker.setCommand(addToppingCommand);
    invoker.pressButton();

    invoker.setCommand(removePickle);
    invoker.pressButton();

    myChef.displayTopping();

  }

}
