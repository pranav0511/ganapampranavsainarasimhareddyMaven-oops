class Sweet implements Comparable{
int weight=1;
String name="";
String color="yellow";
float calories=100;
@Override
public int compareTo(Object o) {
return 0;
}
}
class chocolate extends Sweet{}
class FiveStar extends chocolate
{
FiveStar ()
{
this.name="xFiveStar";
}
}
class KitKat extends chocolate{
KitKat()
{
this.name="aKitKat";
}
}
public class AllChock {
public static void main(String[] args) {
Sweet[]  allsweets = new Sweet[3];
allsweets [0]= new FiveStar();
allsweets [1]= new FiveStar();
allsweets [2]= new KitKat();
float tw =0;
for (int i = 0; i < allsweets.length; i++) {
Sweet s = allsweets[i];
tw += s.weight;
}
System.out.println(" tw = "+tw);
System.out.println(" Printing ");
for (int i = 0; i < allsweets.length; i++) {
Sweet s = allsweets[i];
System.out.println(s.name);
}
System.out.println(" sort all objects using name");

}
}