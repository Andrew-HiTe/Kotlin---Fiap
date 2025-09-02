import kotlin.reflect.typeOf

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    constante
    val pi = 3.14
    println(pi)
//    variavel
    var nome = "Andrew"
    println(nome)

    nome = "Teruya"
    println(nome)

//    Esse é o char  -- Variável utilizando inferência de tipo (Ou seja, será automático a declaração dá variável)
    var tipo = 'x'
    println(tipo)

//    String  -- Forma com tipo explícito
    var cidade: String = "Sao Paulo"
    println("Nome da cidade: $cidade")
    println("Quantidade de letras: " + cidade.length)

//    Pair
    var (codigo, descricao) = Pair(100, "Mouse")
    println("codigo: $codigo")
    println("descricao: $descricao")

//    Pair -- Declarando a variável
    var produto2: Pair<Int, String> = Pair(200, "Teclado")
    println("produto2: ${produto2.first}")
    println("produto2: ${produto2.second}")
}
