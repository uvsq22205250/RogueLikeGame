package fr.uvsq.pglp.roguelike.equipement;

import java.util.Random;

public class ArmeDistance implements Equipement{
  private ArmeDistanceType armeDistanceType;
  private int de ;
  private int nbreDe ;
  private  int portee;
  private int prix ;

  private Random random;

  public ArmeDistance(ArmeDistanceType armeDistanceType, Random random) {
    this.armeDistanceType = armeDistanceType;
    this.de = armeDistanceType.de;
    this.nbreDe = armeDistanceType.nbreDe;
    this.portee = armeDistanceType.portee;
    this.prix = armeDistanceType.prix;
    this.random = random;
  }
  private void setRandom(Random random) {
    this.random = random;
  }
  public int calculDamage(){
    int dm = 0;
    for(int i = 0 ; i < this.nbreDe ; i++){
      dm += this.random.nextInt(this.de + 1);
    }
    return dm ;
  }

  @Override
  public int getBonus() {
    return 0;
  }
}
