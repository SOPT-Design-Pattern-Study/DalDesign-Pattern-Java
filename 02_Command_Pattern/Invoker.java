package Command;

public class Invoker {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
    //토핑 작업 실시 !
  }
}
