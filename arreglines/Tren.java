public class Tren {
  private int largo;



  public Tren(int largo) {
    this.largo = largo;
  }


  public int getLargo() {
    return this.largo;
  }

  public void setLargo(int largo) {
    this.largo = largo;
  }

  @Override
  public String toString() {
    return "{" +
      " largo='" + getLargo() + "'" +
      "}";
  }
  
}
