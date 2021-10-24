package creationaldesignpatterns.prototype;

import java.util.List;

public class Statement {

    //Shallow Copy/Clone - These objects are getting returned as what they are passed in

    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {

        this.sql = sql;
        this.parameters = parameters;
        this.record = record;

    }

    public Statement clone() {

        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;

    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }
}
