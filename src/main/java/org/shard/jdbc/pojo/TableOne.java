package org.shard.jdbc.pojo;

public class TableOne {
    private Integer id;

    private String phone;

    private String backOne;

    private String backTwo;

    private String backThree;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBackOne() {
        return backOne;
    }

    public void setBackOne(String backOne) {
        this.backOne = backOne;
    }

    public String getBackTwo() {
        return backTwo;
    }

    public void setBackTwo(String backTwo) {
        this.backTwo = backTwo;
    }

    public String getBackThree() {
        return backThree;
    }

    public void setBackThree(String backThree) {
        this.backThree = backThree;
    }

    @Override
    public String toString() {
        return "TableOne{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", backOne='" + backOne + '\'' +
                ", backTwo='" + backTwo + '\'' +
                ", backThree='" + backThree + '\'' +
                '}';
    }
}
