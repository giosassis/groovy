String getUserName(String firstName, String lastName) {
    return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase();
}

assert getUserName("Chris", "Behrens") == "cbehrens" : "getUserName isn't working"

println (getUserName("Chris", "Behrens"))

String[] fristsNames = ["Bob", "Jeff", "Roy","George","Tom"]
String[] lastNames = ["Dylan", "Lynne", "Orbison", "Harrison", "Pretty"]

void printCredential (cred) {
    println("Username is ${cred}");
}

for (int i = 0; i < fristsNames.size(); i++) {
    printCredential(getUserName(fristsNames[i], lastNames[i]));
}