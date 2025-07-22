public class UserInfo {

    private String name;
    private int age;
    private String email;
    private boolean isActive;

    public UserInfo(String name, int age, String email, boolean isActive){
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + "\nAge: " + age +
                "\nEmail: " + email + "\nStatus: " + (isActive ? "Active" : "Inactive")+ "\n");
    }

    public static void main(String[] args){
        UserInfo us01 = new UserInfo("Almuatsam", 22, "Almuatsam@mail.com", true);
        UserInfo us02 = new UserInfo("Ahmead", 8, "Ahmead@mail.com", false);
        UserInfo us03 = new UserInfo("Sultan", 12, "Sultan@mail.com", true);

        us01.displayInfo();
        us02.displayInfo();
        us03.displayInfo();

    }

}
