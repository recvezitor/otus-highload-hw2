package com.dimas.exception;

import java.sql.SQLException;

public class MyJdbcException extends RuntimeException {
    public MyJdbcException(SQLException e) {
        super(e);
    }

    public MyJdbcException(String s) {
        super(s);
    }

    public MyJdbcException(String msg, SQLException e) {
        super(msg, e);
    }

}
