create database davi_calcados;

use davi_calcados;

 -- drop database davi_calcados;

CREATE TABLE FUNCIONARIO(
		id_funcionario bigint auto_increment,
        nome varchar(150) not null,
        sexo char(1) not null,
        data_nascimento date not null,
        cpf varchar(14) not null,
        rg varchar(30),
        telefone varchar(13), -- (88)8888-8888
        telefone2 varchar(13), -- (88)8888-8888
        email varchar(150),
        salario numeric(9,2) not null,
        contrato date not null,
        recisao date,
        ativo boolean not null,
        rua varchar(50) not null,
        numero int not null,
        complemento varchar(20),
        bairro varchar(50) not null,
        cidade varchar(50) not null,
        CEP varchar(10), -- 99.999-999
        estado char(2) not null,
constraint pk_funcionario primary key funcionario(id_funcionario)
);

CREATE TABLE USUARIO(
        id_usuario bigint auto_increment not null,
        username varchar(30) not null,
        senha varchar(30) not null,
        nivel int not null,
        ativo boolean not null,
constraint pk_usuario primary key usuario(id_usuario),
constraint fk_usuario foreign key usuario(id_usuario) references funcionario(id_funcionario)
);

CREATE TABLE CLIENTE(
        id_cliente bigint auto_increment not null,
        nome varchar(150) not null,
        profissao varchar(150) not null,
        sexo varchar(12) not null,
        data_nascimento date not null,
        estado_civil varchar(20),
        cpf varchar(14) not null, -- 111.111.111-11
        rg varchar(30),
        telefone varchar(13), -- (88)8888-8888
        telefone2 varchar(13), -- (88)8888-8888
        email varchar(40), 
        preferencia longtext,
        numero_boleto bigint ,
        ativo boolean not null,
	    rua varchar(50) not null,
        numero int not null,
        complemento varchar(100),
        bairro varchar(50) not null,
        cidade varchar(50) not null,
        CEP varchar(10), -- 99.999-999
        estado char(2) not null,
        renda numeric(9,2),
        credito numeric(9,2),		
constraint pk_cliente primary key cliente(id_cliente)
);


CREATE TABLE FORNECEDOR(
		id_fornecedor bigint auto_increment not null,
        nome varchar(150) not null,
        fisica_juridica varchar(18) not null, -- CNPJ (99.999.999/0001-99) ou CPF (999.999.999-99)
        telefone varchar(13), -- (88)8888-8888
        telefone2 varchar(13), -- (88)8888-8888
        email varchar(150),
        ativo boolean not null,
		rua varchar(50) not null,
        numero int not null,
        complemento varchar(20),
        bairro varchar(50) not null,
        cidade varchar(50) not null,
        CEP varchar(10) , -- 99.999-999
        estado char(2) not null,
		observacao longtext,
constraint pk_fornecedor primary key fornecedor(id_fornecedor)
);

CREATE TABLE PRODUTO(
		id_produto varchar(255) not null,
        id_fornecedor bigint not null,
		nome varchar(255) not null,
        descricao longtext,
        quantidade int not null,
        quantidade_minima int not null,
        valor_unitario numeric(9,2) not null,
        valor_venda numeric(9,2) not null,
        valor_aumento numeric(9,2),
constraint pk_produto primary key produto(id_produto),
constraint fk_produto_fornecedorr foreign key produto(id_fornecedor) references fornecedor(id_fornecedor)
); 


 CREATE TABLE SAIDA(
		id_usuario bigint not null,
        id_saida bigint auto_increment not null,
        descricao_saida longtext not null,
        valor_Saida numeric(9,2) not null,
        data_saida date not null,
constraint pk_saida primary key saida(id_saida),
constraint fk_saida foreign key saida(id_usuario) references usuario(id_usuario)
);

CREATE TABLE ENTRADA(
        id_usuario bigint not null,
        id_entrada bigint auto_increment not null,
        descricao_entrada longtext not null,
        valor_entrada numeric(9,2) not null,
        data_entrada date not null,
constraint pk_entrada primary key entrada(id_entrada),
constraint fk_entrada foreign key entrada(id_usuario) references usuario(id_usuario)

);

CREATE TABLE PRODUTO_FORNECIDO( -- TABELA N : M (PRODUTO : FORNECEDOR)
		id_produto_fornecido bigint,
		id_produto varchar(255) not null,
		id_fornecedor bigint not null,
constraint pk_produto_fornecido primary key produto_fornecido(id_produto_fornecido),
constraint fk_prod_produto_fornecido foreign key produto_fornecido(id_produto) references produto(id_produto),
constraint fk_forn_produto_fornecido foreign key produto_fornecido(id_fornecedor) references fornecedor(id_fornecedor)

);

create table caixa(
	id_caixa bigint auto_increment,
	id_movimentacao bigint not null, 
	movimentacao enum('Entrada','Saída'), 
	descricao longtext not null, 
	data date not null, 
	hora time not null, 
	username varchar(30) not null, 
	valor numeric(20,2),
constraint pk_caixa primary key caixa(id_caixa)
);


create table plano_compras(
	id_plano_compras bigint auto_increment,
    nome varchar(100) not null,
    descricao longtext not null,
     marca varchar(50) not null,
    data_cadastro date,
    constraint pk_plano_compras primary key plano_compras(id_plano_compras)
);

create table venda(
	id bigint auto_increment,
    id_funcionario bigint,
    id_cliente bigint,
	data date not null,
	parcela int,
    total Double not null,
constraint pk_venda primary key venda(id),
constraint fk_venda_funcionario foreign key venda(id_funcionario) references funcionario(id_funcionario)
);

create table produtos_vendidos(
	id bigint auto_increment,
    id_venda bigint,
    id_produto varchar(255) ,
constraint pk_venda primary key produtos_vendidos(id),
constraint fk_venda_produto foreign key produtos_vendidos(id_venda) references venda(id),
constraint fk_venda_produto_vendido foreign key produtos_vendidos(id_produto) references produto(id_produto)
);

create table contas_pagar(
	id_contas_pagar bigint auto_increment,
	data_pagamento date not null,
	valor numeric(9,2) not null,
	status boolean not null,
	descricao longtext,
constraint pk_contas_pagar primary key contas_pagar(id_contas_pagar)
);

create table contas_receber(
	id_contas_receber bigint auto_increment,
	data_pagamento date not null,
	valor numeric(9,2) not null,
	status boolean not null,
	descricao longtext,
constraint pk_contas_receber primary key contas_receber(id_contas_receber)
);
