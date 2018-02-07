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
