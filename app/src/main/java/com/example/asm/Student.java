package com.example.asm;

public class Student {
    int id;
    String name;
    String email;
    String tel;

    public Student(){super();}

    public Student(int id, String name, String email, String tel) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.tel = tel;
    }

    public Student(String name, String email, String tel) {
        this.email = email;
        this.name = name;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
