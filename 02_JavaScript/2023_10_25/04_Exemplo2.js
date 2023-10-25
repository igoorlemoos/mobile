console.log("==================== EXEMPLO 1 ====================");

function ola(nome) { 
    // console.log("Olá, " + nome + "!")
    console.log(`Olá, ${nome}!`);
}
ola("Igor");


console.log("\n==================== EXEMPLO 2 ====================");
let nome = "Igor";

function oi(nome) {
    console.log("Olá, " + nome + "!");
}
oi("Igor");


console.log("\n==================== EXEMPLO 3 ====================")
// Aplicando o cenário real
function salesStatus() {
    console.log("Aprovado");
}
salesStatus();


console.log("\n==================== EXEMPLO 4 ====================")
// Aplicando o cenário real
function salesStatus2(status) {
    console.log(`Transação: ${status}`);
}
salesStatus2("Aprovado");


console.log("\n==================== EXEMPLO 5 ====================")
// Aplicando o cenário real
function salesStatus3(status, total) {
    console.log(`Transação: ${status}. Total: R$${total}.`);
}
salesStatus3('Aprovada', 10);