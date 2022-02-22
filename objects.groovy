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

assert getUserName("Chris", "Behrens") == "cbehrens" : "getUserName isn't working"

void printCredential (cred) {
    println("Username is ${cred}");
}

String[] fristsNames = ["Bob", "Jeff", "Roy","George","Tom"]
String[] lastNames = ["Dylan", "Lynne", "Orbison", "Harrison", "Pretty"]



for (int i = 0; i < fristsNames.size(); i++) {
    printCredential(getUserName(fristsNames[i], lastNames[i]));
}