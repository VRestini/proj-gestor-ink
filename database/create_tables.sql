CREATE TABLE IF NOT EXISTS tbl_categoria(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL UNIQUE;
);
CREATE TABLE IF NOT EXISTS tbl_produto(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR (60) NOT NULL,
	descricao VARCHAR(255),
	se_ativo TINYINT NOT NULL,
	se_validade TINYINT NOT NULL,
	dt_criacao DATE NOT NULL,
	fk_categoria INT,
	FOREIGN KEY (fkCategoria) REFERENCES tbl_categoria(id);
);
CREATE TABLE IF NOT EXISTS tbl_item(
	id INT PRIMARY KEY AUTO_INCREMENT,
	dt_entrada DATE NOT NULL,
	dt_saida DATE,
	dt_validade DATE,
	valor DECIMAL(6,2),
	se_usado TINYINT NOT NULL,
	fk_produto INT,
	FOREIGN KEY (fkProduto) REFERENCES tbl_produto(id);	
);

