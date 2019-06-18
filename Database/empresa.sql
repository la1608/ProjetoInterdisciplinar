
#
# Database "empresa"
#

CREATE DATABASE IF NOT EXISTS `empresa` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `empresa`;

#
# Structure for table "cliente"
#

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `codigo` int(5) NOT NULL AUTO_INCREMENT,
  `RazaoSocial` varchar(150) DEFAULT NULL,
  `NomeFantasia` varchar(150) DEFAULT NULL,
  `Pessoa` varchar(150) DEFAULT NULL,
  `CPF` varchar(150) DEFAULT NULL,
  `CNPJ` varchar(150) DEFAULT NULL,
  `InscricaoMunicipal` varchar(150) DEFAULT NULL,
  `Referencia` varchar(150) DEFAULT NULL,
  `Telefone` varchar(150) DEFAULT NULL,
  `Email` varchar(150) DEFAULT NULL,
  `Endereco` varchar(150) DEFAULT NULL,
  `Cidade` varchar(150) DEFAULT NULL,
  `Bairro` varchar(150) DEFAULT NULL,
  `OrgaoPublico` varchar(150) DEFAULT NULL,
  `Microempresa` varchar(150) DEFAULT NULL,
  `InscricaoEstadual` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "cliente"
#


#
# Structure for table "produtos"
#

DROP TABLE IF EXISTS `produtos`;
CREATE TABLE `produtos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) DEFAULT NULL,
  `NomeReduzido` varchar(255) DEFAULT NULL,
  `Fabricante` varchar(255) DEFAULT NULL,
  `Familia` varchar(255) DEFAULT NULL,
  `ClassABC` varchar(255) DEFAULT NULL,
  `Tipo` varchar(255) DEFAULT NULL,
  `Desconto` varchar(255) DEFAULT NULL,
  `Situacao` varchar(255) DEFAULT NULL,
  `CodigoBarras` varchar(255) DEFAULT NULL,
  `Referencia` varchar(255) DEFAULT NULL,
  `ReferenciaOriginal` varchar(255) DEFAULT NULL,
  `TipoProducao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "produtos"
#


#
# Structure for table "usuarios"
#

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

#
# Data for table "usuarios"
#

INSERT INTO `usuarios` VALUES (1,'j.tomaz','admin','vendas@enterpostos.com.br');