const objs=[
  {
    nome:"Matheus",
    idade:30,
    esta_trabalhando: true,
    detalhes_profissao:{
      profissao: "Programador",
      empresa: "Empresa X",
    },
    hobbies:["Programar", "Ler", "Correr"]
  },
  {
    nome:"João",
    idade:25,
    esta_trabalhando: false,
    detalhes_profissao:{
      profissao: null,
      empresa: null,
    },
    hobbies:["Jogar", "Academia"],
  },
]

//Converte de objeto para JSON:

const jsonData = JSON.stringify(objs)

console.log(jsonData)
console.log(typeof jsonData) // mostra o tipo de arquivo

//Converte de JSON para objeto:

const objData = JSON.parse(jsonData)
console.log(objData)
console.log(typeof objData)

objData.map((pessoa)=>{
console.log(pessoa.nome)
})
