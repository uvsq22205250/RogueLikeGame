package fr.uvsq.pglp.roguelike.donjon;

public enum DonjonComponentType {
  /**
   * Obstacle, représenté par un caractère #.
   */
  OBSTACLE(" # "),
  /**
   * Sol, représenté par un caractère .
   */
  SOL(" . "),
  ;

  /**
   * Caractère ASCII représentant le composant dans le monde.
   */
  private String asciiChar;

  /**
   * Constructeur de {@code WorldComponentsType}.
   *
   * @param asciiChar Caractère ASCII représentant le composant dans le monde.
   */
  DonjonComponentType(String asciiChar) {
    this.asciiChar = asciiChar;
  }

  /**
   * Retourne le caractère ASCII représentant le composant dans le monde.
   *
   * @return Caractère ASCII représentant le composant dans le monde.
   */
  public String getAsciiChar() {
    return asciiChar;
  }
}
