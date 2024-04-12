package Command;

public class AddToppingCommand implements Command{

  private Chef chef;
  private String topping;

  public AddToppingCommand(Chef chef, String topping) {
    this.chef = chef;
    this.topping = topping;
  }

  @Override
  public void execute() {
    chef.addTopping(topping);
  }
}
