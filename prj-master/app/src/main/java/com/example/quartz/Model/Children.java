package com.example.quartz.Model;

import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;

public class Children implements Iterable<Child>{
    private List<Child> children = new ArrayList<>();
    private static Children instance;
    private Children(){

    }
    public static Children getInstance()
    {
        if (instance == null)
        {
            instance = new Children();
        }
        return instance;
    }


    public void add(Child child)
    {
        children.add(child);
    }

    public List<Child> getChildren() {
        return children;
    }

    @Override
    public Iterator<Child> iterator() {
        return children.iterator();
    }
}
