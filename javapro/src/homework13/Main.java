package homework13;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {

    FileNavigator fileNavigator = new FileNavigator(new HashMap<>());


    try {
      fileNavigator.add(new FileData("mytest.txt", 2048,
          "C:/Users/7not9/IdeaProjects/ithillelJavaProHW13"));
      fileNavigator.add(new FileData("mytest2.txt", 3048,
          "C:/Users/7not9/IdeaProjects/ithillelJavaProHW13"));
      fileNavigator.add(new FileData("mytest3.txt", 6048,
          "C:/Users/7not999999/IdeaProjects/ithillelJavaProHW13"));
      fileNavigator.add(new FileData("mytest4.txt", 5048,
          "C:/Users/7not9/IdeaProjects/ithillelJavaProHW13"));
    } catch (WrongPathException wrongPathException) {
      System.out.println(wrongPathException.getLocalizedMessage());
    }
  }
}
