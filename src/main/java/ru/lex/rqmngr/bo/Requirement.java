package ru.lex.rqmngr.bo;
/**
 * @author KuznetsovAN
 */

public class Requirement {

    private String name;
    private String oid;
    private String Description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
