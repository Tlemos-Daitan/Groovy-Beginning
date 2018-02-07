#Groovy-Beginning

- Codigo Treino

class Cidade{
    String nome
}
class Pessoa{
    String nome
    public void setNome(String valor){
        println "Setter chamado"
        this.nome = valor
    }
    public String getNome(){
        "Meu nome é " + nome
    }
    String sobrenome
    Cidade cidade
}  

Pessoa pessoa = new Pessoa()
pessoa.nome = "Tiago"
println pessoa.nome
println pessoa.@nome


- Listas

ArrayList lista = new ArrayList()
lista.add("a")
lista.add("b")
println lista

List listaGroovy = []
listaGroovy += "a"
listaGroovy += "b"
println listaGroovy
println listaGroovy
listaGroovy[1]

- Map

Map mapJava = new HashMap()
mapJava.put("nome", "Henrique")
mapJava.put("sobrenome", "Lobo")
println mapJava

Map mapGroovy = [:]
mapGroovy.nome = "Henrique"
mapGroovy.sobrenome = "Lobo"
println mapGroovy


- String

String nome = "Tiago"
String mensagem = "Ola"

String mensagemCompleta = "${mensagem} ${nome}"

- Tipagem dinamica

def soma (x,y){
    
    x + y
}

soma(3,4)
soma(3,"Teste")