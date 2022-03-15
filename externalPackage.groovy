//Default Imports in groovy

// import java.io.*
// importjava.lang.*
// import java.net.*
// import java.until.*
// import groovy.lang.*
// import groovy.util.*
// import java.math.BigDecimal
// import java.math.BigInteger

import groovy.json.JsonSlurper

String filepath = "home/code/groovy/music.json" //i dont have this json file

def jsonSlurper = new JsonSlurper()
Arraylist data = jsonSlurper.parse(new File(filepath))

println (data.getClass())

for (artist: data) {
    println (artist.name);
    for (album: artist.albums) {
        println ('\t' album.title)
    }
}