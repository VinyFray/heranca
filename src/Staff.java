public class Staff extends User {

    private String registerNumber;
    private String role;

    public Staff(String nickname, String password, String name, String lastName, int age, String registerNumber, String role){
        super(nickname, password, name, lastName, age);

        this.registerNumber = registerNumber;
        this.role = role;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append(super.toString());
        model.append("\nRole: "+role);
        model.append("\nRegister Number: "+registerNumber);
        return model.toString();
    }
}
