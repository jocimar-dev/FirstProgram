package org.quarkus.project.utils;

import java.sql.SQLException;

public class ExceptionQuarkus extends SQLException {

    public static final long serialVersionUID = -4561198819027899663L;

    public ExceptionQuarkus(String msg) {
            super(msg);
    }

        public ExceptionQuarkus(String msg, Throwable cause){
            super(msg, cause);
        }
    }