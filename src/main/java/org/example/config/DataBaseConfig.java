package org.example.config;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.models.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class DataBaseConfig {
    public static SessionFactory createsessionFactory(){
        Properties properties=new Properties();
        properties.put(Environment.DRIVER,"org.postgresql.Driver");
        properties.put(Environment.URL,"jdbc:postgresql://localhost:5432/java77");
        properties.put(Environment.USER,"postgres");
        properties.put(Environment.PASS,"1234");


        properties.put(Environment.HBM2DDL_AUTO,"update");
        properties.put(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL,"true");


        Configuration configuration=new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(User.class);

        return configuration.buildSessionFactory();
    }
    public static EntityManagerFactory createEntityManegerFactory(){
        return Persistence.createEntityManagerFactory("peaksoft");
    }

}
