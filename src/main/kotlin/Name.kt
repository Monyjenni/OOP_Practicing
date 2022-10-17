class Name (name: String , pwd: String) {

    val m_name: String
    val m_pwd: String

    init {
        m_name=name
        m_pwd=pwd

        println("Name = ${m_name}")
        println("Her Pwd = ${m_pwd}")


    }
}