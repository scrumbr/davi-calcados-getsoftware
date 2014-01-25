create  database estudo_trigger;

use estudo_trigger;

create table produtos (
codigo integer not null primary key,
descricao varchar(30),
qtde_em_estoque integer);

create table vendas (
data timestamp,
codigo_produto integer,
qtde_vendida integer,
valor_total numeric(9,2));

set term ^;

create trigger tr_baixa_de_estoque for vendas after insert as
begin
update produtos 
set qtde_em_estoque = qtde_em_estoque + new.qtde_vendida
where codigo = new.codigo_produto;
end^