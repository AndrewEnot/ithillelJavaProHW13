package homework13;

import homework13.controller.FileNavigator;
import homework13.model.FileData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<FileData> fileList = new ArrayList<>();
    fileList.add(new FileData("mytest.txt", 3048,
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW13"));

    List<FileData> fileList1 = new ArrayList<>();
    fileList1.add(new FileData("mytest01.txt", 3048,
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW11"));

    FileNavigator fileNavigator = new FileNavigator(new HashMap<>());
    fileNavigator.getFiles().put("C:/Users/7not9/IdeaProjects/ithillelJavaProHW13",
        fileList);
    fileNavigator.getFiles().put("C:/Users/7not9/IdeaProjects/ithillelJavaProHW11",
        fileList1);

    fileNavigator.add(new FileData("mytest4.txt", 2048,
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW13"));
    fileNavigator.add(new FileData("mytest6.txt", 6048,
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW13"));

    fileNavigator.add(new FileData("mytest10.txt", 3048,
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW14"));

    fileNavigator.add(new FileData("mytest5.txt", 3048,
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW11"));
    fileNavigator.add(new FileData("mytest7.txt", 5048,
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW11"));

    List<FileData> findByPath = fileNavigator.find(
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW11");

    List<FileData> filterBySize = fileNavigator.filterBySize(
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW13", 5000);

    System.out.println(fileNavigator.remove("C:/Users/7not9/IdeaProjects/ithillelJavaProHW11"));

    List<FileData> sortBySize = fileNavigator.sortBySize(
        "C:/Users/7not9/IdeaProjects/ithillelJavaProHW13");
  }
}
