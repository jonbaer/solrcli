package com.odoko.solrcli.actions;

import java.util.List;
import java.util.Map;

public interface Action {

  public void go();

  public void configure(List<String> arguments, Map<String, String> options);

  public void init();
  
  public String usage();
}
