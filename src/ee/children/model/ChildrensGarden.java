package ee.children.model;

public class ChildrensGarden {
  final int id;
  private final String name;

  public ChildrensGarden(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
