package com.javarush.test;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class DogIsNotReadyException extends Exception {
     public DogIsNotReadyException(String message) {
         super(message);
     }
}
