# Exercicio 2

insert into Caixa(cor,etiqueta) 
values ("vermelha","ação");
insert into Caixa(cor,etiqueta)
values ("azul","aventura");

select * from Caixa;

insert into Revista(ano, colecao, edicao,
Caixa_numeroCaixa) values(2024,"ben 10",
"inverno", 2);
insert into Revista(ano, colecao, edicao,
Caixa_numeroCaixa) values (2023,"x-men",
"verão",2);

select * from Revista;

insert into Emprestimo(dataDevolucao,
dataEmprestimo, nomeAmiguinho, nomeMae,
deOndeE, telefone, Revista_codRevista)
values ("2024-05-07", "2024-03-10", 
"joazinho", "MaeDoJoao", "escola",
"123456789101", 1);

insert into Emprestimo(dataDevolucao,
dataEmprestimo, nomeAmiguinho, nomeMae,
deOndeE, telefone, Revista_codRevista)
values ("2024-06-10", "2024-04-11", 
"zezinho", "MaeDoZe", "predio",
"123456789101", 2);