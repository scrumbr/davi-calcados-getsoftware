
select * from produto;

select p.nome, p.descricao, p.quantidade, p.quantidade_minima, p.valor_unitario, p.valor_venda, p.valor_aumento, f.nome from produto as p, fornecedor as f where p.id_fornecedor = f.id_fornecedor;
select * from entrada;

select  e.id_entrada, e.descricao_entrada, e.valor_entrada, e.data_entrada, u.username from entrada as e, usuario as u where e.id_usuario = u.id_usuario and data_entrada BETWEEN '2014/05/11' AND '2014/05/13';
select  s.id_saida, s.descricao_saida, s.valor_saida, s.data_saida, u.username from saida as s, usuario as u where s.id_usuario = u.id_usuario and data_saida BETWEEN '2014/05/11' AND '2014/05/13';

SELECT * FROM entrada WHERE data_entrada BETWEEN '2014/05/11' AND '2014/05/15' ; 


insert into entrada (id_usuario, descricao_entrada, valor_entrada, data_entrada) values(1,"Recebimento de parcela", 50.00,'2014/05/15');
insert into entrada (id_usuario, descricao_saida, valor_saida, data_saida) values(1,"Conta de Energia", 50.00,'2014/05/15');


insert into cliente(nome,profissao,sexo,data_nascimento, estado_civil, cpf, rg, telefone,telefone2,email,preferencia,numero_boleto,ativo,rua,numero,complemento,
bairro,cidade,cep,estado,renda,credito) values("Maria Florentina", "Recepcionista", "Feminino", '1980/12/08', "Solteiro", "09878628320", "123456789", "(88)9660-4515",
"(88)3422-1407","rodolfo.abreu@gmail.com","Sem Preferencia", 123456, true, "Rua tomas de aquino", 123,"Casa","Santa Barbara", "Ibicuitinga", "62940-000", "CE", 1500,700);

select * from contas_pagar;

create table contas_pagar(
	id_contas_pagar bigint auto_increment,
	data_pagamento date not null,
	valor numeric(9,2) not null,
	status boolean not null,
	descricao longtext,
constraint pk_contas_pagar primary key contas_pagar(id_contas_pagar)
);


insert into contas_pagar(data_pagamento, valor, status, descricao) values('2014/10/10',120.00,false,"Testando");

select * from contas_pagar where descricao like 'c%' and status = false;
select * from contas_pagar where status = true order by data_pagamento;
delete from contas_pagar;
select * from saida;

insert into usuario(ativo, username, nivel, senha) values(true, "Junieudes",1,"123123");










