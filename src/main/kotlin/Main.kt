fun main(args: Array<String>) {
 val book = Books(1,"Not giving a fuck", "Motivational Speech Book")
    println(book.category)
    println("Kholine has lended me the ${book.name} which has id ${book.id} " +
            "and the categorize is   ${book.category}")


 val caculus= getBook(1,2)
    println(caculus)



  val mony = Name("Chansovanmony Yoeun","Monylove404%")
  println("Her Bio = ${mony.m_name} ${mony.m_pwd}")

}