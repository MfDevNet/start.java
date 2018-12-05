import org.junit.jupiter.api.Test;

import java.util.*;

class LearnFullArray {
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
      for (; ; ) {

        if (arBoolean[arbool] == true)
          System.out.println("True");
        else if (arBoolean[arbool] == false)
          System.out.println("False");

        if (arBoolean.length == arbool)
          break;
        arbool++;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error Code is : " + e.getMessage());
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
    String s = "M F D";
    System.out.println(s.length() + " " + s.indexOf('M') + " " + s.lastIndexOf('D'));
    System.out.println(s.length() + s.lastIndexOf(' ') + s.indexOf('F'));
    System.out.println(s.length() + "" + s.lastIndexOf(' ') + "" + s.indexOf('F'));

  }

  @Test
  public void arrayTest() {

    int[] arraylist = new int[10];
    int[] arraylist2 = {10, 15, 8, 6, 3, 5, 5, 8, 7};
    System.out.println(Arrays.toString(arraylist2));
    int[][] cubes = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};
    System.out.println(Arrays.toString(cubes));
    System.out.println(Arrays.deepToString(cubes));
//    Arrays.sort(cubes,Collections());
//    System.out.println(Arrays.deepToString(cubes));
    String[] arrayString = {"mohammad", "Ali", "amirmahdi", "xaniar", "maryam"};
    Arrays.sort(arrayString);
    System.out.println(Arrays.toString(arrayString));
    Arrays.sort(arraylist2);
    System.out.println(Arrays.toString(arraylist2));
    String[] fruits = {"orange", "apple", "banana", "grapes"};
    System.out.println("" + Arrays.toString(fruits));
    Arrays.sort(fruits, Collections.reverseOrder());
    System.out.println(Arrays.toString(fruits));

    System.out.println(Arrays.toString(arrayString));
    Arrays.sort(arrayString, Collections.reverseOrder());
    System.out.println(Arrays.toString(arrayString));

    for (int i = 0; i < arraylist.length; i++) {
//      if (i%2==0)
//        arraylist[i]=i+1;
//      else {
//        arraylist[i]=i;
//      }
      arraylist[i] = i;
    }
    for (Integer ar : arraylist) {
      if (ar % 2 == 0)
        System.out.println(ar);
    }
    for (int ar : arraylist) {
      if (ar % 2 != 0)
        System.out.println(ar);
    }

    System.out.println("Even\tOdd");
    for (int ar : arraylist) {
      if (ar % 2 == 0)
        System.out.print(ar);
      else {
        System.out.println("\t\t" + ar);
      }
    }

  }

  @Test
  public void arraycompare() {

    int[] primes = {3, 5, 5};
    int[] odds = {3, 5, 7};

    boolean isEqual = Arrays.equals(primes, odds);
    if (isEqual) {
      System.out.println("is Equal");
      System.out.println(Arrays.toString(primes));
      System.out.println(Arrays.toString(odds));


    } else {
      System.out.printf("Not Equal %s and %s: ", Arrays.toString(primes), Arrays.toString(odds));
      System.out.println();
    }
    int[][] cubes = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};
    int[][] cubess = {{1, 1}, {2, 2}, {3, 2}, {4, 4}};
    isEqual = Arrays.deepEquals(cubes, cubess);
    if (isEqual)
      System.out.println("Equal");
    else
      System.out.println("Not Equal");

  }

  @Test
  public void arTest() {
    String[] s = {"2", "4", "6"};
//    String ss=Arrays.toString(s);
//  System.out.println(ss);
    String ss = stringToArray(s, ":");
    System.out.println(ss);

  }

  @Test
  public String stringToArray(String[] array, String delimiter) {
    StringBuilder sb = new StringBuilder();
    for (String s : array) {
      sb.append(s).append(delimiter);


    }
    String result = sb.deleteCharAt(sb.length() - 1).toString();

    return result;
  }

  @Test
  public void arrayToList(int[] val) {
    List<Object> list = Arrays.asList(val);
    for (Object s : list)
      System.out.println(s);
  }

  @Test
  public void arrayToList(String[] val) {
    List<String> list = Arrays.asList(val);
    System.out.println(list);
    for (String s : list)
      System.out.println(s);

  }

  @Test
  void convertArrayToList() {
    String[] x = {"5", "2", "4"};
    arrayToList(x);
    int[] ss = {5,2,4};
    arrayToList(ss);


  }

    @Test
  void arraycopy(){
    String[] bankCard={"Meli","Melat","Sepah","Saderat","Parsian"};

    String[] newBank=new String[10];


    System.arraycopy(bankCard,1,newBank,1,4);

      System.out.println(Arrays.toString(newBank));
      List<String> list=new ArrayList<>(Arrays.asList("Hi","ok","bing","goole"));
      System.out.println(list);
      //System.out.println(System.lineSeparator());
      System.out.println("ok");

    }
    @Test
  void testEnum(){

    for (LevelClass state:LevelClass.values()){
      if (state==LevelClass.NOOK){
        System.out.println("nook");
      }
      if (state==LevelClass.OK){
        System.out.println("ok");
      }
    }

    }
}

