-- ----------------------------------------------------------------------------------
-- ************ TRIGGER'S DA TABELA CAIXA COM EVENTOS DA TABELA ENTRADA *************
-- ----------------------------------------------------------------------------------
/*
 * trigger criada para alimentar a tabela caixa com os valores inseridos na tabela entrada
*/
DELIMITER $$
-- DROP TRIGGER trigger_entrada_insert
CREATE TRIGGER trigger_entrada_insert AFTER INSERT ON entrada
FOR EACH ROW BEGIN

insert into caixa set
movimentacao = 1, 
id_movimentacao = new.id_entrada,
descricao = new.descricao_entrada, 
data = new.data_entrada, 
hora = current_time(), 
username = (select u.username from usuario as u where u.id_usuario = new.id_usuario), 
valor = new.valor_entrada;

END;
 $$ DELIMITER $$ ;
select * from caixa
/*
 * trigger criada para atualizar a tabela caixa com os valores atualizados na tabela entrada
*/
DELIMITER $$
-- DROP TRIGGER trigger_entrada_update
CREATE TRIGGER trigger_entrada_update BEFORE UPDATE ON entrada
FOR EACH ROW BEGIN

update caixa set
caixa.movimentacao = 1, 
caixa.descricao = new.descricao_entrada, 
caixa.data = new.data_entrada, 
caixa.hora = current_time(), 
caixa.username = (select u.username from usuario as u where u.id_usuario = new.id_usuario),  
caixa.valor = new.valor_entrada
where caixa.id_movimentacao = new.id_entrada;
END;
 $$ DELIMITER $$ ;


/*
 * trigger criada para deletar da tabela caixa os valores deletados na tabela entrada
*/
DELIMITER $$
-- DROP TRIGGER trigger_entrada_delete
CREATE TRIGGER trigger_entrada_delete BEFORE delete ON entrada
FOR EACH ROW BEGIN

delete from caixa 
where id_movimentacao = old.id_entrada;
 END;
$$ DELIMITER ;

 
-- ----------------------------------------------------------------------------------
-- ************ TRIGGER'S DA TABELA CAIXA COM EVENTOS DA TABELA SAIDA *************
-- ----------------------------------------------------------------------------------
/*
 * trigger criada para alimentar a tabela caixa com os valores inseridos na tabela saida
*/
DELIMITER $$
-- DROP TRIGGER trigger_saida_insert
CREATE TRIGGER trigger_saida_insert AFTER INSERT ON saida
FOR EACH ROW BEGIN

insert into caixa set
movimentacao = 2, 
id_movimentacao = new.id_saida,
descricao = new.descricao_saida, 
data = new.data_saida,
hora = current_time(), 
username = (select u.username from usuario as u where u.id_usuario = new.id_usuario),  
valor = new.valor_saida;

END;
 $$ DELIMITER $$ ;

/*
 * trigger criada para atualizar a tabela caixa com os valores atualizados na tabela saida
*/
DELIMITER $$
-- DROP TRIGGER trigger_saida_update
CREATE TRIGGER trigger_saida_update BEFORE UPDATE ON saida
FOR EACH ROW BEGIN

update caixa set
caixa.movimentacao = 2, 
caixa.descricao = new.descricao_saida, 
caixa.data = new.data_saida, 
caixa.hora = current_time(),  
caixa.username = (select u.username from usuario as u where u.id_usuario = new.id_usuario), 
caixa.valor = new.valor_saida
where caixa.id_movimentacao = new.id_saida;
END;
 $$ DELIMITER $$ ;


/*
 * trigger criada para deletar da tabela caixa os valores deletados na tabela entrada
*/
DELIMITER $$
-- DROP TRIGGER trigger_saida_delete
CREATE TRIGGER trigger_saida_delete BEFORE delete ON saida
FOR EACH ROW BEGIN

delete from caixa 
where id_movimentacao = old.id_saida;
 END;
$$ DELIMITER ;

-- ----------------------------------------------------------------------------------
-- **********************************************************************************
-- ----------------------------------------------------------------------------------
