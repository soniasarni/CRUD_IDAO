package com.sonia.DNO;

import java.util.List;

public interface IDAO<T> {
public void create(T object);
public List<T>read(T object);
public void delete(T object);
}
