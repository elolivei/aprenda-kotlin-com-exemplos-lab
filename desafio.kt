// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
    fun incluirConteudo(conteudo: ConteudoEducacional){
        conteudos.add(conteudo)
    }
}

fun main() {
    
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val variaveis = ConteudoEducacional("Lidando com variaveis")
    val desvios = ConteudoEducacional("Desvios condicionais",120)
    val cursoPython  = Formacao( "Python", mutableListOf(variaveis,desvios))
    val aluno = Usuario("Joao")
    cursoPython.matricular(aluno)
    
    println(cursoPython)
    println(cursoPython.inscritos)
    
    val loops = ConteudoEducacional("loops de repeticao")
    cursoPython.incluirConteudo(loops)
    
    val aluno1 = Usuario("Matilde de Souza")
    cursoPython.matricular(aluno1)
    println()
    println(cursoPython)
    println(cursoPython.inscritos)
    
}
