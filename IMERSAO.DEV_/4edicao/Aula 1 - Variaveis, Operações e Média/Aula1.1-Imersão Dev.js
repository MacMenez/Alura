//Declarando váriaveis de palavras
var nome = "Davi"

//Declarando variáveis númericas.
var nota_1bimestre = "9"
var nota_2bimestre = "7"
var nota_3bimestre = "4"
var nota_4bimestre = "2"

//Somar todas as notas
var notaFinal = (nota_1bimestre + nota_2bimestre + nota_3bimestre + nota_4bimestre) / 4

//Mostar números com 1 casa decimal. Se colocar 0, arredonda para cima
//var notaFixada = notaFinal.toFixed(1)

var notaFixada = notaFinal.toFixed(2)

//Mostrar resultado na tela
console.log("Bem vindo " + nome)
console.log(nota_1bimestre)
console.log(nota_2bimestre)
console.log(nota_3bimestre)
console.log(nota_4bimestre)
console.log(notaFixada)

//console.log(notaFixada = (notaFixada = (nota_1bimestre + nota_2bimestre + nota_3bimestre + nota_4bimestre) / 4).toFixed(1))

if (notaFixada > 7) {
    console.log("Você está aprovado!")
} else {
    console.log("Você está reprovado!")
}