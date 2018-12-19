package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greeting method.
   * 
   * @param someone String
   * @return greeting String
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
