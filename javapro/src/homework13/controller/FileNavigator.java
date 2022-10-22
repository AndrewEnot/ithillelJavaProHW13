package homework13.controller;

import homework13.api.WrongPathException;
import homework13.model.FileData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FileNavigator {

  private final Map<String, List<FileData>> files;

  public FileNavigator(Map<String, List<FileData>> files) {
    this.files = files;
  }

  public void add(FileData file) {
    try {
      if (file != null) {
        if (files.containsKey(file.getPath())) {
          files.get(file.getPath()).add(file);
        } else {
          throw new WrongPathException("!!!!Wrong path of file you want to add..." + file.getPath());
        }
      }
    } catch (WrongPathException wrongPathException) {
      System.out.println(wrongPathException.getLocalizedMessage());
    }
  }

  public List<FileData> find(String path) {
    if (path == null) {
      return null;
    }
    return files.get(path);
  }

  public List<FileData> filterBySize(String path, int size) {
    if (path == null) {
      path = "";
    }
    List<FileData> resultList = new ArrayList<>();
    for (FileData fileData : files.get(path)) {
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

  public List<FileData> sortBySize(String path) {
    List<FileData> result = files.get(path);
    Collections.sort(result);
    return result;
  }

  public Map<String, List<FileData>> getFiles() {
    return files;
  }
}
