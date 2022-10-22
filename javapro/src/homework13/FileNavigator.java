package homework13;

import java.util.ArrayList;
import java.util.Map;

public class FileNavigator {

  private String

  private Map<String, FileList> files;

  public FileNavigator(Map<String, FileList> files , ) {
    this.files = files;
  }

  public void add(FileData file) {
    if (file != null) {
      if (files)
      if (files.containsKey(file.getPath())) {
        files.get(file.getPath()).add(file);
//      } else {
//        throw new WrongPathException("!!!!Wrong path of file you want to add..." + file.getPath(), file.getPath());
      }
    }
  }

  public FileList find(String path) {
    if (path == null) {
      return null;
    }
    return files.get(path);
  }

  public FileList filterBySize(String path, int size) {
    if (path == null) {
      path = "";
    }
    FileList resultList = new FileList(new ArrayList<>());
    for (FileData fileData : files.get(path).getFileDataList()) {
      if (fileData.getSize() < size) {
        resultList.add(fileData);
      }
    }
    return resultList;
  }

  public boolean remove(String path) {
    if (path == null) {
      return false;
    }
    return files.remove(path, files.get(path));
  }

  public FileList sortBySize(String path) {
    if (path == null) {
      path = "";
    }
    FileList resultList = files.get(path);
    resultList.sortBySize();
    return resultList;
  }

  public Map<String, FileList> getFiles() {
    return files;
  }
}
