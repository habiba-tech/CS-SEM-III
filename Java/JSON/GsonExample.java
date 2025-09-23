package com.example.nep;

import com.google.gson.Gson;

class Student {
int id;
String name;
double marks;
boolean isPassed;
}

public class GsonExample {
public static void main(String[] args) {
Student s = new Student();
s.id = 1;
s.name = "Habiba";
s.marks = 85.5;
s.isPassed = true;

Gson gson = new Gson();
String json = gson.toJson(s);
System.out.println(json);

Student obj = gson.fromJson(json, Student.class);
System.out.println("Name: " + obj.name);
}
}
