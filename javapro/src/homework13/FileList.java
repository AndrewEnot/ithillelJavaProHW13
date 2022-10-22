package homework13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileList {

  private List<FileData> fileDataList;

  public FileList(List<FileData> fileDataList) {
    this.fileDataList = fileDataList;
  }

  public void add(FileData file) {
    if (file != null) {
      fileDataList.add(file);
    }
  }

  public void sortBySize() {
    fileDataList.sort(null);
  }

  public List<FileData> getFileDataList() {
    return fileDataList;
  }
}
