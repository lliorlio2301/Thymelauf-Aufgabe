package com.thymeleaf1.lazyvim1.model;

public class Text {
  private String nachricht;

  public Text() {
  }

  public Text(String nachricht) {
    this.nachricht = nachricht;
  }

  @Override
  public String toString() {
    return "Text [nachricht=" + nachricht + "]";
  }

  public void setNachricht(String nachricht) {
    this.nachricht = nachricht;
  }

  public String getNachricht() {
    return this.nachricht;
  }
}
