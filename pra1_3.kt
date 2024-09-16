fun main() {
    fun readInfo(prompt: String): String {
        print(prompt)
        return readlnOrNull() ?: ""
    }

    val enrno: String = readInfo("Student Enrollment No.: ")
    val stdname: String = readInfo("Student Name: ")
    val branch: String = readInfo("Student Branch: ")
    val stdclass: String = readInfo("Student Class: ")
    val batch: String = readInfo("Student Batch: ")
    val clgname: String = readInfo("Student College Name: ")
    val uniname: String = readInfo("Student University Name: ")
    val age: String = readInfo("Student Age: ")
    println("")
    println("*************************")
    println("\nStudent's Data:")
    println("Enrollment No.: $enrno")
    println("Name: $stdname")
    println("Age: $age")
    println("Branch: $branch")
    println("Class: $stdclass")
    println("Batch: $batch")
    println("College Name: $clgname")
    println("University Name: $uniname")
}
