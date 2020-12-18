package org.quarkus.project.factory;

import lombok.SneakyThrows;
import org.quarkus.project.utils.ExceptionQuarkus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    @SneakyThrows
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:clinica",
                    "medico", "123");
        } catch (SQLException exception) {
            throw new ExceptionQuarkus("Erro de Conexão.");
        }
    }
}
