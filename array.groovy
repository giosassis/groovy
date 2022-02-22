String [] singers = ["Bob", "George", "Jeff", "Roy", "Tom"]

for (String singer: singers) {
    println singer 
}


singers.each{
    x -> println(x)
}

singers.each{println(it)}