import org.junit.jupiter.api.Test;

public class LearnFullArray {
  @Test
  void arraySample1() {
    int[] aarayInt = new int[5];
    aarayInt[0] = 5;
    aarayInt[1] = 10;
    aarayInt[2] = 15;
    aarayInt[3] = 20;
    aarayInt[4] = 25;
    int iArrya1 = aarayInt.length - 1;
    do {
      System.out.println(aarayInt[iArrya1]);
      iArrya1--;
    } while (iArrya1 >= 0);
    System.out.println("----------------------------------------------");
    int[] arrayInt1 = {1, 2, 3, 4, 5, 6};
    int iArray2 = arrayInt1.length - 1;
    while ((iArray2 != 0 || iArray2 == 0) && (iArray2 > -1)) {
      System.out.println(arrayInt1[iArray2]);
      iArray2--;
    }
    String[] arstring = {"Mohammad", "Farahani", "Iranian", "\"", "\""};

    System.out.println(arstring[4] + arstring[0] + arstring[1] + arstring[2] + arstring[3]);
    System.out.println("----------------------------------------------");


    char[] arChar = {'a', 'b', 'c', 'A', 'B', 'C'};
    System.out.println(arChar);
    System.out.println("----------------------------------------------");

    boolean arBoolean[] = new boolean[3];
    arBoolean[0] = true;
    arBoolean[1] = true;
    arBoolean[2] = false;
    int arbool = 0;
    try {
      for (;; ){

        if (arBoolean[arbool] == true)
          System.out.println("True");
        else if (arBoolean[arbool] == false)
          System.out.println("False");

        if (arBoolean.length == arbool)
          break;
        arbool++;
      }
    }catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Error Code is : "+e.getMessage());
    }

    System.out.println("----------------------------------------");

    int[] arrayInt2;
    arrayInt2 = new int[10];
    //int[][]  arrayInt2dd={{1,1},{2,2},{0,0}};
    System.out.println("----------------------------------------");
    int[][] arrayInt2D = new int[3][3];
    arrayInt2D[0][0] = 1;
    arrayInt2D[0][1] = 1;
    arrayInt2D[0][2] = 2;
    arrayInt2D[1][0] = 10;
    arrayInt2D[1][1] = 11;
    arrayInt2D[1][2] = 12;
    arrayInt2D[2][0] = 20;
    arrayInt2D[2][1] = 21;
    arrayInt2D[2][2] = 22;
    for (int i = 0; i < arrayInt2D.length; i++) {
      for (int j = 0; j < arrayInt2D.length; j++) {
        if (arrayInt2D[i][j] == 0) break;
        System.out.print("\t" + arrayInt2D[i][j]);
      }
      System.out.println();
    }
//    for(int i=0;i<1;i++) {
//      for (int j = 0; j < arrayInt2dd.length; j++) {
//        System.out.println(arrayInt2dd[j][0]);
//
//      }
//    }
        String s="M F D";
    System.out.println(s.length()+" "+s.indexOf('M') + " "+s.lastIndexOf('D'));
    System.out.println(s.length()+s.lastIndexOf(' ')+s.indexOf('F'));
    System.out.println(s.length()+""+s.lastIndexOf(' ')+""+s.indexOf('F'));

  }

}
