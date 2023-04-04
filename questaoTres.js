const fs = require('fs');
const dados = JSON.parse(fs.readFileSync('./arquivos-fornecidos/dados.json'))

const soma = dados.reduce((acc, curr) => acc + curr.valor, 0)
const media = soma / dados.length;

const menor = Math.min(...dados.map((item) => item.valor));
const maior = Math.max(...dados.map((item) => item.valor));

const acimaDaMedia = dados.filter((item) => item.valor > media).length

console.log(`Menor valor: ${menor}`);
console.log(`Maior valor: ${maior}`);
console.log(`Dias acima da média: ${acimaDaMedia}`);