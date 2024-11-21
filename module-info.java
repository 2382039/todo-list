module TodoApp {
    requires spring.context;
    requires java.sql;
    requires spring.beans;
    requires java.xml.crypto;

    opens todoapp;
    opens todoapp.entities;
    opens todoapp.repositories;
    opens todoapp.services;
    opens todoapp.views;
    opens todoapp.config;
}