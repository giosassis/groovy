class User { 
    String lastName;
    String firstName;

    public String UserName(){
        return getUserName(this.firstName, this.lastName);
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase();
    }
}

class Artist extends User {
    public String[] Songs;
}

class Producer extends User{
    public void Produce(){
        println("Album Complete")
    };

}



User[] users = [new Artist (firstName: "Bob", lastName: "Dylan"),
                new Artist (firstName: "Jeff", lastName: "Bezos"),
                new Artist (firstName: "Roy", lastName: "Orbison"),
                new Artist (firstName: "George", lastName: "Harrison"),
                new Artist (firstName: "Tom", lastName: "Petty")];

users.each(user ->  
    if (user instanceof Artist) {
        println("Username is ${user.UserName()}")
    } else {
        user.Produce()
    }