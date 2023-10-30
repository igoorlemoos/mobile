// Exemplo 01 - Variaveis Primitivas

// Neste exemplo, usaremos variáveis primitivas para armazenar numeros inteiros e uma String e realizar operações simples

// Variaveis primitivas
let numeroInteiro = 42;
let numeroDecimal = 3.14;
let texto = "Ola Mundo"


// Realizando operações
let resultadoSoma = numeroInteiro + numeroDecimal;
let resultadoConcatenacao = `${texto}, estamos programando em JavaScript`;

console.log("Resultado da soma: ", resultadoSoma);
console.log("Resultado concatenação: ", resultadoConcatenacao);


// Exemplo 02 - Variaveis primitivas
console.log("\nExemplo 02 - Variaveis primitivas")
// Neste exemplo utilizaremos variáveis primitivas para armazenar numeros inteiros e realizar uma operação condicional simples

let idade = 18;

if (idade >= 18) {
    console.log(`Idade: ${idade} - Maior de idade`);
} else {
    console.log(`Idade: ${idade} - Menor de idade`);
}


let status = idade>=18 ? "Maior de idade" : "Menor de idade";
console.log(status)