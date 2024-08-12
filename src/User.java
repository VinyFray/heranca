public class User {

    private String nickname;
    private String password;
    private int age;
    private String name;
    private String lastName;

    public User(String nickname, String password, String name, String lastName, int age){
        this.nickname = nickname;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public void printFullName(){
        System.out.println(name+" "+lastName);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append("Nome completo: " + name + " " + lastName);
        model.append("\n");
        model.append("Idade: " + age);
        model.append("\n");
        model.append("Nickname: " + nickname);
        return model.toString();
    }
}
