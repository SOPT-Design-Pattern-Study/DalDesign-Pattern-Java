package Command;

public class RemoveToppingCommand implements Command{

  private Chef chef;
  private String topping;

  public RemoveToppingCommand(Chef chef, String topping) {
    this.chef = chef;
    this.topping = topping;
  }


  @Override
  public void execute() {
    chef.removeTopping(topping);
  }
}
