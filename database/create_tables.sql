CREATE TABLE IF NOT EXISTS tbl_categoria(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50);
);
CREATE TABLE IF NOT EXISTS tbl_produto(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR (60) NOT NULL,
	descricao VARCHAR(255);
	validade TINYINT NOT NULL,
	fkCategoria INT,
	FOREIGN KEY (fkCategoria) REFERENCES tbl_categoria(id);
);
CREATE TABLE IF NOT EXISTS tbl_item(
	id INT PRIMARY KEY AUTO_INCREMENT,
	dtEntrada DATE NOT NULL,
	dtSaida DATE,
	dtValidade DATE,
	valor DECIMAL(6,2),==
	fkProduto INT,
	FOREIGN KEY (fkProduto) REFERENCES tbl_produto(id);	
);
