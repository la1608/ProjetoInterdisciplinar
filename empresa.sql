# Host: localhost  (Version: 5.5.5-10.1.38-MariaDB)
# Date: 2019-06-12 12:03:31
# Generator: MySQL-Front 5.3  (Build 4.187)

/*!40101 SET NAMES latin1 */;

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

INSERT INTO `cliente` VALUES (1,'aksnfkasnfk','kasnfjasnfl','Física','112.155.548-47','00.215.546/3100-00','16151626161','adaldnfkasflsakfak','(34) 9 9168-1833','teste@teste.com','Rua blablabla','Frutal','das couves','Sim','Não','5151615464656'),(3,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9956-8454','teste@teste.com','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(4,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9956-8454','testeeeee@teste.br','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(6,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9874-5487','teste@teste.br','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(8,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9958-4448','testeeee@teste','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(9,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9958-4448','testeeee@teste','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(10,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9958-4448','testeeee@teste','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(13,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9958-4448','testeeee@teste','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(15,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9958-4448','testeeee@teste','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(16,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9958-4448','testeeee@teste','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(17,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9958-4448','testeeee@teste','teste teste','Uberaba','testeee','Sim','Não','61616161616'),(18,'teste','teste','Jurídica','315.464.646-46','31.513.213/1616-16','6161615161616','6161616131','(34) 9 9958-4448','testeeee@teste','teste teste','Uberaba','testeee','Sim','Não','61616161616');

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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

#
# Data for table "produtos"
#

INSERT INTO `produtos` VALUES (1,'nome','1','1','1','1','1','Sim','Normal','1','1','11','Tercerizada'),(2,'asjmfaj','aksnsfgkansf','kanskgnaks','knsakfnask','kansknask','kanskfnak','Não','Normal','knaskfna','kanskfnaks','kanskfnak','Própria'),(3,'agalm','lmasglam','lkasmglam','lamsdglm','lamsglam','lamslgma','Sim','Normal','asgasgas','asgasg','gasg','Tercerizada'),(5,'askfjaksj','aksfaksnnf','kaksnfaksn','laksnnfakn','klansflkan','alskfnalksnf','Não','Normal','sdgasgasgas','asgasgasg','gasgasg','Tercerizada');

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

INSERT INTO `usuarios` VALUES (1,'root','root','root@root'),(2,'admin','admin','admin@admin'),(3,'teste','123','teste@teste.com'),(4,'teste2','teste','teste2@teste');
