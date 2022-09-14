package Problema3;

public class User {
    String name;
    String country;


    public User(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append("country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
