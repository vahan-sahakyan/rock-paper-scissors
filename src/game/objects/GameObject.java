package game.objects;

public class GameObject implements Comparable<GameObject> {
  private int id;
  private String name;

  // @formatter:off
  
  private int[][] comparison = {
    //               rock     paper      scissors
    /* rock */     {   0,      -1,       1,   },
    /* paper */    {   1,       0,      -1,   },
    /* scissors */ {  -1,       1,       0,   },
      
  };
  
  // @formatter:on

  protected int getId() {
    return id;
  }

  protected void setId(int id) {
    this.id = id;
  }

  protected String getName() {
    return name;
  }

  protected void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public int compareTo(GameObject other) {
    return comparison[this.id][other.id];
  }

}
