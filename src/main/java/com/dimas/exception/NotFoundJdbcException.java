package com.dimas.exception;

import java.sql.SQLException;

public class NotFoundJdbcException extends MyJdbcException {
    public NotFoundJdbcException(SQLException e) {
        super(e);
    }

    public NotFoundJdbcException(String s) {
        super(s);
    }

}
