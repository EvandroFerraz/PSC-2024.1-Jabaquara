create database aula2204;
use aula2204;

create table Caixa(
numeroCaixa int primary key auto_increment,
cor varchar(45),
etiqueta varchar(45)    
);

create table Revista(
codRevista int primary key auto_increment,
colecao varchar(45),
ano int,
edicao varchar(45),
Caixa_numeroCaixa int,
foreign key (Caixa_numeroCaixa) references
Caixa(numeroCaixa));

create table Emprestimo(
	codEmprestimo int primary key 
    auto_increment,
    dataDevolucao date,
    dataEmprestimo date,
    nomeAmiguinho varchar(45),
    nomeMae varchar(45),
    deOndeE varchar(45),
    telefone char(12),
    Revista_codRevista int,
    foreign key (Revista_codRevista) references
    Revista(codRevista)
);
select * from Emprestimo