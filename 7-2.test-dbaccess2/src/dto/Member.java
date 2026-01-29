package dto;

/**
 * メンバー情報を表すDTO.
 * 
 * @author igamasayuki
 *
 */

public class Member {

    private int id;
    private String name;
    private int age;
    private int depId;

    // getter / setter
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getDepId() {
        return depId;
    }
    public void setDepId(int depId) {
        this.depId = depId;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", age=" + age + ", depId=" + depId + "]";
    }
}
