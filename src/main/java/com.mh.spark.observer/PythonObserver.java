package com.mh.spark.observer;

/**
 * This interface is used as an abstract class in python projects.
 */
public interface PythonObserver{
    default void on_next(Object o) {
    }
}