package exercice1;
class Point { 
public Point(int x, int y) { 
this.x = x; 
this.y = y;
 }
 public void deplace(int dx, int dy) {
 x += dx; 
 y += dy; 
} 
 public void affiche() {
     System.out.println("Point: (" + getX() + ", " + getY() + ")");
 }
 
public int getX() {
return x; 
}


 public int getY() {
 return y; 
}
 
 
 private int x, y;
 } 
