package reader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import exception.ExceptionReader;

public class ReaderList<T> implements Reader<T> {

  private List<T> itemList = new ArrayList<>();
  private int index = 0;

  public ReaderList(Collection<T> itemList) {
    itemList = new ArrayList<>(itemList);
  }
  
  protected void addItem(T t) {
    itemList.add(t);
  }

  @Override
  public T readItem() {
    return itemList.get(index++);
  }

  @Override
  public boolean hasNext() {
    if (index < itemList.size())
      return true;
    else {
      return false;
    }
  }
  
  @Override
  public void close() throws ExceptionReader {}

}
