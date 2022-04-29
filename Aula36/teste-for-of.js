let estacionamento = [
    {
        marca:"chevrolet",
        modelo:"chevette",
        ano:1977,
        cor:"desbotado"
    },
    {
        marca:"ford",
        modelo:"escort xr3",
        ano: 1993,
        cor: "vermelho"
    },
    {
        marca:"volkswagen",
        modelo:"fusca",
        ano: 1965,
        cor: "azul"
    }
];

//console.log(estacionamento);
//console.log("Carro escolhido:", estacionamento[1]);

for (const carro of estacionamento.entries()) {
    console.log(carro)
}
