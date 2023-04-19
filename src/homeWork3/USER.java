package homeWork3;

public enum USER {
    USER1("Roma", "Ivanov", "man", 25, new UserAddress("РБ", "Минск")),
    USER2("Masha", "Pitrova", "woman", 18, new UserAddress("РБ", "Витебск")),
    USER("Dima", "Sidorov", "man", 21, new UserAddress("РБ", "Гродно"));
    private String name, lastname, gender;
    private int age;
    private  UserAddress address;

    USER(String name, String lastname, String gender, int age, UserAddress address) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public void printNameAndLastname() {
        System.out.println(name + " " + lastname);
    }

    public int upAge(int plusAge) {
        age += plusAge;
        System.out.println("через" + " " + plusAge + " будет: " + age);
        return age;

    }

    public void printUserInfo() {
        System.out.println(name + " " + lastname + " " + "" + gender + " " + age);
        address.printAddress();
    }

    public static class UserAddress {
        private String country;
        private String city;

        public UserAddress(String country, String city) {
            this.country = country;
            this.city = city;
        }
        public void printAddress(){
            System.out.println(country + " " + city);
        }

    }
}
