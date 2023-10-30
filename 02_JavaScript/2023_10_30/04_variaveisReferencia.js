// Exemplo 1 - Variáveis de referencia

// Variáveis de referências (objetos)

let pessoa = {
    nome: "Igor",
    idade: 26,
    cidade: "São Paulo"
};

// Acessar e modificar propriedades do objeto
console.log("Nome: ", pessoa.nome);
console.log("Idade: ", pessoa.idade);

// Modificar uma propriedade
pessoa.idade = 18;

console.log("\nNome: ", pessoa.nome);
console.log("Idade: ", pessoa.idade);

// Adicionando uma nova propriedade
pessoa.profissao = "Developer";

// Exibindo o objeto atualizado
console.log("\nInformações da pessoa", pessoa);


// Exemplo 02
let carro = {
    marca: "Marca",
    modelo: "Modelo",
    ano: 1996,
    cor: "Cor",
    motorLigado: true
}

// Acessando as propriedades do objeto
console.log("\nMarca do carro: " + carro.marca)
console.log("Modelo do carro: " + carro.modelo)
console.log("Ano do carro: " + carro.ano)
console.log("Cor do carro: " + carro.cor)
console.log("Motor ligado: " + carro.motorLigado)

console.log("")
// Desafio exibindo o estado do motor, se o motor esta ligado ou se o motor esta desligado
// let status = carro.motorLigado == true ? console.log("Motor Ligado") : console.log("Motor Desligado");
let status = carro.motorLigado ? console.log("Motor Ligado") : console.log("Motor Desligado");
